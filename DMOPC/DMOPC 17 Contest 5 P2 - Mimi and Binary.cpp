#include <iostream>

using namespace std;
string S;
int Q;
long zero[200005], one[200005], zeros[200005], ones[200005];

int main() {
    cin >> S >> Q;

    for (int i = 1; i<=S.length(); i++) {
        zero[i] = zero[i-1];
        one[i] = one[i-1];

        if (S.at(i-1)=='0') {
            zero[i]++;
            zeros[zero[i]] = i;

        } else if (S.at(i-1)=='1') {
            one[i]++;
            ones[one[i]] = i;
        }
    }

    for (int q = 0; q<Q; q++) {
        int x, y, z, index = -1; cin >> x >> y >> z;

        if (z==0) {
            index = zeros[zero[x-1]+y];
        } else if (z==1) {
            index = ones[one[x-1]+y];
        }

        if (index>0) {
            cout << index << "\n";
        } else {
            cout << -1 << "\n";
        }

    }
    return 0;
}