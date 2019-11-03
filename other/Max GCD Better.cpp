#include <iostream>
using namespace std;

//it don't work idk why

int gcd (int a, int b) {
    if (b==0) {
        return a;
    }
    return (b, a%b);
}

int N, maxgcd;
int nums [100005], pre [100005], suff [100005];

int main() {

    cin >> N;
    for (int i = 1; i<=N; i++) {
        int a; cin >> a;
        nums[i] = a;
        pre[i] = gcd(pre[i-1], nums[i]);
    }

    for (int i = N; i>=1; i--) {
        suff[i] = gcd(suff[i+1],nums[i]);
        maxgcd = max(maxgcd, gcd(pre[i-1], suff[i+1]));
    }

    cout << maxgcd;

    return 0;
}