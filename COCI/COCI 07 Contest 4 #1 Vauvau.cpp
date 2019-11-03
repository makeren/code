#include <iostream>

using namespace std;

int A, B, C, D;

int main() {

    cin >> A >> B >> C >> D;

    for (int i = 0; i<3; i++) {
        int man; cin >> man;
        int dog1 = man%(A+B), dog2 = man%(C+D);
        if (dog1>0 && dog1<=A && dog2>0 && dog2<=C) {
            cout << "both\n";
        } else if ((dog1>0 && dog1<=A) || (dog2>0 && dog2<=C)) {
            cout << "one\n";
        } else {
            cout << "none\n";
        }
    }


    return 0;
}