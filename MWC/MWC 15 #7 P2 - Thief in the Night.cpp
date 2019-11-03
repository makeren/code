#include <iostream>
using namespace std;
int psa [5][10002];

int F, R, C, Q, a, b, c;

int main() {

    cin.sync_with_stdio(0);
    cin.tie(0);

    cin >> F >> R;
    for (int f = 0; f<F; f++) {
        for (int r = 0; r<R; r++) {
            cin >> C;
            psa[f][r+1] = psa[f][r] + C;
        }
    }

    cin >> Q;

    for (int q = 0; q<Q; q++) {
        cin >> a >> b >> c;
        cout << (psa[c-1][b] - psa[c-1][a-1]) << "\n";

    }

    return 0;
}