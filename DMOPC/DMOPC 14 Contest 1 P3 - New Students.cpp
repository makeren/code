#include <iostream>

using namespace std;

int I, S, mark;
double sum = 0;

int main() {
    cin >> I;
    for (int i = 0; i<I; i++) {
        cin >> mark;
        sum+=mark;
    }

    cin >> S;
    for (int i = 1; i<=S; i++) {
        cin >> mark;
        sum+=mark;
        cout << (sum/(I+i)) << "\n";
    }


    return 0;
}