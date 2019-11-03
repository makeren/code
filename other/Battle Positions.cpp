#include <iostream>

using namespace std;

int I, N, J, scount;
int diff[100005];

int main() {

    cin >> I >> N >> J;

    for (int j = 0; j<J; j++) {
        int i, f, k; cin >> i >> f >> k;
        diff[i]+=k;
        diff[f+1]-=k;

    }

    for (int i = 1; i<=I; i++) {
        diff[i]+=diff[i-1];
        if (diff[i]<N) {
            scount++;
        }
    }

    cout << scount;

    return 0;
}