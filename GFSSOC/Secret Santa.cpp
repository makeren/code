#include <iostream>
#include <vector>

using namespace std;

class Present {
public:
    int floor, weight, stress;
};

int N, stress = 2147483647;
Present gift [7];
vector<Present> order;

void deliver(int tstress, int floor, int weight) {

    if (order.size()==N) {
        stress = min(tstress, stress);
    }

    for (int i = 0; i<N; i++) {
        bool included = false;

        for (Present p : order) {
            if (p.floor==gift[i].floor) {
                included = true;
                break;
            }
        }

        if (!included) {

            Present temp = gift[i];

            tstress+=(weight)*(abs(floor-temp.floor)+1);
            temp.stress = tstress;
            weight-=temp.weight;
            order.push_back(temp);

            deliver(tstress, gift[i].floor, weight);

            temp = order.back();
            order.pop_back();
            weight+=temp.weight;
            tstress = order.back().stress;

        }
    }

}

int main() {
    cin >> N;
    int tweight = 0;

    for (int i = 0; i<N; i++) {
        int z, w; cin >> z >> w;
        gift[i].floor = z, gift[i].weight = w;
        tweight+=w;
    }

    deliver(0, 101, tweight);

    cout << stress;

    return 0;
}