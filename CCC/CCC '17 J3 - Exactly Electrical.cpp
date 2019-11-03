#include <iostream>

using namespace std;

int a, b, c, d, t, x, y;

int main() {

    cin >> a >> b >> c >> d >> t;

    x = abs(a-c);
    y = abs(b-d);

    if (t-x-y<0 || (t-x-y)%2!=0) {
        cout << "N\n";

    } else {
        cout << "Y\n";
    }

    return 0;
}