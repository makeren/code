#include <iostream>

using namespace std;

int X, Y, H, V, T;

int main() {

    cin >> X >> Y >> H >> V >> T;

    int layer = (X+Y)/3;
    if ((X+Y)%3!=0) {
        layer++;
    }

    while (layer>(X+H-1) || X>(2*layer) || (X<layer && Y>layer*2)) {
        layer++;
        if ((layer<=X && X<=2*layer) || ((layer-1)*2<Y && layer*2>=Y)) break;
    }

    if (layer<T) {
        cout << "YES";
    } else {
        cout << "NO";
    }

    return 0;
}