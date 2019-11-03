#include <iostream>

using namespace std;

long k;
long chars [31];
int x = 21, y = 17, z = 17, q, n;
string sx = "Good writing is good ", sy = " writing is good ", sz = " is good writing.", xyz = "Good writing is good writing is good writing.";

void find (long index, int deg) {

    if (deg==0) {
        cout << xyz.at(index-1) << "\n";
        return;
    }

    if (index-x > 0) {
        index -= x;

        if (index - chars[deg-1] > 0) {
            index -= chars[deg-1];

            if (index - y > 0) {
                index -= y;

                if (index - chars[deg-1] > 0) {
                    index -= chars[deg-1];

                    if (index - z > 0) {
                        cout << ".\n";

                    } else {
                        cout << sz.at(index-1) << "\n";
                        return;
                    }

                } else { // in another big one
                    find(index, deg-1);
                }

            } else {
                cout << sy.at(index-1) << "\n";
                return;
            }

        } else { // somewhere in another big one
            find(index, deg-1);
        }

    } else {
        cout << sx.at(index-1) << "\n";
        return;
    }

}

int main() {

    cin >> q;

    chars[0] = 45;
    for (int i = 1; i<=30; i++) {
        chars[i] = 2*chars[i-1] + x + y + z;
    }

    for (int Q = 0; Q<q; Q++) {
        cin >> n >> k;

        if (k>chars[n]) {
            cout << ".\n";

        } else {
            find(k, n);
        }

    }




    return 0;
}