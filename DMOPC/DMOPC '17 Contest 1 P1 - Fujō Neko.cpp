#include <iostream>
#include <string>

using namespace std;

int R, C, Q, x, y;
char c;
bool row [1002], col [1002];

int main() {

    cin.sync_with_stdio(0);
    cin.tie(0);

    cin >> R >> C;

    for (int i = 0; i<R; i++) {
        for (int j = 0; j < C; j++) {
            cin >> c;
            if (c == 'X') {
                row[i] = true;
                col[j] = true;
            }
        }
    }

    cin >> Q;

    for (int q = 0; q<Q; q++) {
        cin >> x >> y;
        x-=1;
        y-=1;

        if (row[y] || col[x]) {
            cout << "Y" << "\n";
        } else {
            cout <<"N" << "\n";
        }

    }

    return 0;
}