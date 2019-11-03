#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int N;
double q1, q2, q3;
vector<int> data, p1, p2;

int main() {
    cin >> N;
    for (int i = 0; i<N; i++) {
        int a; cin >> a;
        data.push_back(a);
    }
    sort(data.begin(), data.end());

    int mid = N/2;

    for (int i = 0; i<mid; i++) {
        p1.push_back(data[i]);
    }

    for (int i = N-1; i>=(N-mid); i--) {
        p2.push_back(data[i]);
    }
    sort(p2.begin(), p2.end());


    if (N%2==0) {
        q2 = (data[mid-1]+data[mid])/2.0;

    } else {
        q2 = data[mid];
    }

    int halfmid1 = p1.size()/2;
    if (p1.size()%2==0) {
        q1 = (p1[halfmid1-1]+p1[halfmid1])/2.0;

    } else {
        q1 = p1[halfmid1];
    }

    int halfmid2 = p2.size()/2;
    if (p2.size()%2==0) {
        q3 = (p2[halfmid2-1]+p2[halfmid2])/2.0;

    } else {
        q3 = p2[halfmid2];
    }


    cout << data[0] << " " << data[N-1] << " " << q1 << " " << q2 << " " << q3 << "\n";


    return 0;
}