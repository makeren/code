#include <iostream>

using namespace std;
int N, Q;
int trees [1000001], psa [1000001];

int main() {

    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> N;
    for (int i = 0; i<N; i++) {
        int m; cin >> m;
        trees[i] = m;
        psa[i+1] = psa[i]+m;
    }

    cin >> Q;
    for (int q = 0; q<Q; q++) {
        int a, b; cin >> a >> b;
        cout << (psa[b+1]-psa[a]) << "\n";
    }

    return 0;
}