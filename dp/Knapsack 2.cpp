#include <iostream>
#include <algorithm>

int N, W, ans, w, v;
int dp [100005];

using namespace std;

int main() {
    cin >> N >> W;

    fill(dp, dp+100005, 1<<30);
    dp[0] = 0;

    for (int n = 0; n<N; n++) {
        cin >> w >> v;
        for (int j = 100000; j >= v; j--) {
            dp[j] = min(dp[j], dp[j - v] + w);
        }
    }

    for (int i = 100000; i>=0; i--) {
        if (dp[i]<=W) {
            ans = i;
            break;
        }
    }

    cout << ans << "\n";

    return 0;
}