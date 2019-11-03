#include <iostream>

using namespace std;
long N, ccount;

int main() {
    cin >> N;

    bool flag = false;
    string s = to_string(N);
    for (char c : s) {
        if (c!='2' && c!='3') {
            flag = true;
            break;
        }
    }

    if (!flag) ccount++;

    int maxd = N/11;
    int max = maxd*3;

    for (long n = N; n>0; n--) {

        bool flag = false;

        for (char c : s) {
            if (c!='2' && c!='3') {
                flag = true;
                break;
            }
        }

        if (!flag) {
            ccount++;
        }

    }

    cout << ccount;
    return 0;
}