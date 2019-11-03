#include <iostream>
#include <cstring>
#include <algorithm>

using namespace std;

string X;
bool flag1, flag2;

int main() {

    cin >> X;
    char cx [X.length()]; strcpy(cx, X.c_str());

    for (int i = X.length()-1; i>=1; i--) { // first where value drops down (going r to l)
        if (cx[i-1]<cx[i]) {
            flag1 = true;
            char swap = cx[i-1];

            for (int j = X.length()-1; j>=0; j--) { // find next greatest number (going r to l) (this will be the first number greater than swap (since it's ascending r to l until there anyway)
                if (cx[j]>swap) { // swap the two numbers
                    flag2 = true;
                    cx[i-1] = cx[j];
                    cx[j] = swap;

                    for (int k = 0; k<(X.length()-i+1)/2; k++) { // reverse the numbers to the right of the one you swapped (because it's already established that those numbers are increasing anyway, and you put a smaller number there when you swap)
                        char swap1 = cx[i+k];
                        cx[i+k] = cx[X.length()-1-k];
                        cx[X.length()-1-k] = swap1;
                    }

                    break; // so you stop at the first
                }
            }

            if (flag2) break;

        }

    }

    if (flag1 && flag2) {
        for (char c:cx) {
            cout << c;
        }
    } else {
        cout << 0;
    }



    return 0;
}