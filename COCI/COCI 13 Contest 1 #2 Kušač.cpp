#include <iostream>
using namespace std;

int N, M;

int gcd (int a, int b) {
    if (b==0) {
        return a;
    }
    return gcd(b, a%b);
}

int main() {
    cin >> N >> M;
    N%=M;

    if (N==0) {
        cout << 0;

    } else {
        int div = gcd(M, N);
        cout << (M/div-1)*div;
    }

    return 0;
}