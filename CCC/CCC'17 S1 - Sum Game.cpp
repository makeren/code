#include <iostream>

using namespace std;

int N, n;
int psa1 [100002], psa2 [100002];

int main() {

    cin >> N;

    for (int i = 1; i<=N; i++) {
        cin >> n;
        psa1[i] = psa1[i-1] + n;
    }

    for (int i = 1; i<=N; i++) {
        cin >> n;
        psa2[i] = psa2[i-1] + n;
    }

    for (int i = N; i>=0; i--) {
        if (psa1[i] == psa2[i]) {
            cout << i;
            break;
        }
    }




    return 0;
}