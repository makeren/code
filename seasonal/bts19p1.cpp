#include <iostream>

using namespace std;

int N, M;
int bad [10001];

int main() {
    cin >> N >> M;

    for (int n = 0; n<N; n++) {
        for (int m = 0; m < M; m++) {
            int a;
            cin >> a;
            if (a == 1 || a == 10) {
                bad[n]++;
            }
        }
    }

    int min = 1001, mini = -1;

    for (int i = 0; i<N; i++) {
        if (bad[i]<min) {
            min = bad[i];
            mini = i+1;
        }
    }

    cout << mini;

    return 0;
}
