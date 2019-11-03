#include <iostream>

using namespace std;

class Ingredient {
public:
    int S, B;

};

int N, totalB, totalS = 1, total = 1<<30;
Ingredient food [10];

void choose (int index) {

    for (int i = index; i<N; i++) {
        totalB+=food[i].B; totalS*=food[i].S;

        total = min(total, abs(totalB-totalS));
        choose(i+1);

        totalB-=food[i].B; totalS/=food[i].S;

    }

}

int main() {
    std::cin >> N;

    for (int i = 0; i<N; i++) {
        int s, b; std::cin >> s >> b;
        food[i].S = s;
        food[i].B = b;

    }

    choose(0);

    cout << total;


    return 0;
}