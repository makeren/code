#include <iostream>

using namespace std;

int N, K, X, Y, ans = -1;
int row[100000], col[100000], leftd[200005], rightd[200005];

int main() {
    cin >> N >> K;

    for (int time = 1; time <= N; time++) {
        cin >> X >> Y;
        X--;
        Y--;
        row[Y]++;
        if (row[Y]==K) {
            ans = time;
            break;
        }

        col[X]++;
        if (col[X]==K) {
            ans = time;
            break;
        }

        //left
        int index;
        if (Y > X) {
            index = 99998 - Y + X;

        } else if (X > Y) {
            index = X - Y + 99998;

        } else {
            index = 99998;
        }

        leftd[index]++;
        if (leftd[index]==K) {
            ans = time;
            break;
        }

        //right
        rightd[X+Y]++;
        if (rightd[X+Y]==K) {
            ans = time;
            break;
        }

    }

    cout << ans << "\n";

    return 0;
}