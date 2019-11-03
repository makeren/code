#include <iostream>
#include <algorithm>

using namespace std;

int N, t;
int tides [101];

int main() {

    cin >> N;

    for (int i = 0; i<N; i++) {
        cin >> t;
        tides[i] = t;
    }

    sort(tides, tides+N);

    if (N%2==0) {
        for (int i = (N - 1) / 2; i >= 0; i--) {
            cout << tides[i] << " " << tides[N - 1 - i] << " ";
        }

    } else {
        for (int i = (N - 1) / 2; i > 0; i--) {
            cout << tides[i] << " " << tides[N - i] << " ";
        }

        cout << tides[0];
    }

    return 0;
}