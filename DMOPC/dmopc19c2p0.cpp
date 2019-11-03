#include <iostream>
using namespace std;

int N, hmin, hmax, kids;

int main() {
    cin >> N >> hmin >> hmax;
    for (int i = 0; i<N; i++) {
        int h; cin >> h;
        if (hmin <= h && h<=hmax) {
            kids++;
        }
    }

    cout << kids << "\n";


    return 0;
}