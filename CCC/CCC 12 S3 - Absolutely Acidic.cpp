#include <iostream>
using namespace std;

int N, R, freq [1002], maxa = -1, mindex = -1, second = -1, sindex = -1, top, bottom;

int main() {
    cin >> N;
    for (int i = 0; i<N; i++) {
        cin >> R;
        freq[R]++;

        if (freq[R]>maxa) {
            mindex = R;
            maxa = freq[R];

        } else if (freq[R]>second) {
            sindex = R;
            second = freq[R];
        }
    }

    for (int i = 1000; i>0; i--) {
        if (freq[i]==maxa) {
            top = i;
            break;
        }
    }

    for (int i = 1; i<=1000; i++) {
        if (freq[i]==maxa) {
            bottom = i;
            break;
        }
    }

    if (top==bottom) {
        int t1, t2;
        for (int i = 1; i<=1000; i++) {
            if (freq[i]==second) {
                t1 = i;
                break;
            }
        }

        for (int i = 1000; i>0; i--) {
            if (freq[i]==second) {
                t2 = i;
                break;
            }
        }

        if (abs(top-t1)>abs(top-t2)) {
            bottom = t1;

        } else {
            bottom  = t2;
        }
    }

    cout << abs(top-bottom) << "\n";


    return 0;
}