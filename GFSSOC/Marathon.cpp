#include <iostream>

using namespace std;

int N, Q;
int psa [500001];

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> N >> Q;
    int i; cin >> i;
    psa[0] = i;

    for (int n = 1; n<N; n++) {
        cin >> i;
        psa[n] = psa[n-1] + i;
    }

    for (int q = 0; q<Q; q++) {
        int a, b; cin >> a >> b; a--; b--;
        cout << psa[N-1] - psa[b] + psa[a-1] << "\n";
    }

    return 0;
}