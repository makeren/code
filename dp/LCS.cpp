#include <iostream>

int N, M, n[1005], m[1005], dp[1005][1005];

using namespace std;

int main() {
    cin >> N >> M;

    for (int i = 1; i<=N; i++) {
        int a; cin >> a;
        n[i] = a;
    }

    for (int i = 1; i<=M; i++) {
        int a; cin >> a;
        m[i] = a;
    }

    for (int i = 1; i<=N; i++) {
        for (int j = 1; j<=M; j++) {
            if (n[i] == m[j]) {
                dp[i][j] = dp[i-1][j-1]+1;

            } else {
                dp[i][j] = max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
    }

    cout << dp[N][M];

    return 0;
}