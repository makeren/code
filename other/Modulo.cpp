#include <iostream>

using namespace std;
int X, Y, Z;

int gcd (int a, int b) {
    if (b==0) {
        return a;
    }
    return gcd(b, a%b);
}

int main() {
    cin >> X >> Y >> Z;

    if (X%Y==0 && Z!=0) {
        cout << "NO";

    } else if (Z%gcd(X, Y)==0){
        cout << "YES";

    } else {
        cout << "NO";
    }

    return 0;
}