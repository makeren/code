#include <iostream>
#include <algorithm>

using namespace std;

int N;
long M;
long psa[500005];

int main() {

    cin >> N >> M;

    for (int i = 1; i<=N; i++) {
        int d; cin >> d;
        psa[i] = psa[i-1] + d;
    }

    int l = 0, r = 1, mini = N+5;

    while (r>=l && r<=N) {
        if (psa[r]-psa[l]<M) {
            r++;

        } else {
            mini = min(mini, r-l);
            l++;
        }
    }

    if (mini<=N) {
        cout << mini;

    } else {
        cout << -1;
    }

    return 0;
}