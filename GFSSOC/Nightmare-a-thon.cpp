#include <iostream>

using namespace std;

int N, Q;
int ep[500005], pre[500005], suf[500005], prec[500005], sufc[500005];

int main() {

    cin >> N >> Q;
    for (int i = 1; i<=N; i++) {
        int n; cin >> n;
        ep[i] = n;

        if (ep[i]>=pre[i-1]) {
            pre[i] = ep[i];

            if (ep[i]==pre[i-1]) {
                prec[i] = prec[i-1]+1;

            } else {
                prec[i] = 1;
            }

        } else {
            pre[i] = pre[i-1];
            prec[i] = prec[i-1];
        }
    }

    for (int i = N; i>=1; i--) {
        suf[i] = max(ep[i], suf[i+1]);

        if (ep[i]>=suf[i+1]) {
            suf[i] = ep[i];

            if (ep[i]==suf[i+1]) {
                sufc[i] = sufc[i+1]+1;

            } else {
                sufc[i] = 1;
            }

        } else {
            suf[i] = suf[i+1];
            sufc[i] = sufc[i+1];
        }

    }

    for (int i = 0; i<Q; i++) {
        int a, b; cin >> a >> b;

        if (pre[a-1]>suf[b+1]) {
            cout << pre[a-1] << " " << prec[a-1] << "\n";

        } else if (pre[a-1]<suf[b+1]) {
            cout << suf[b+1] << " " << sufc[b+1] << "\n";

        } else {
            cout << pre[a-1] << " " << prec[a-1]+sufc[b+1] << "\n";
        }
    }

    return 0;
}