#include <iostream>
#include <algorithm>
#include <vector>

const int BIG = 2147483647;

using namespace std;

int N;
int nums [100001];
vector<int> rprime;


int GCD (int a, int b) {
    if (b==0) {
        return a;
    }
    return GCD(b, a%b);
}

int main() {
    cin >> N;

    for (int i = 0; i < N; i++) {
        int a;
        cin >> a;
        nums[i] = a;
    }
    sort(nums, nums + N);

    if(N>2) {
        int min1a = BIG, min2a = BIG, minindex = -1;

        for (int i = 1; i < N; i++) {
            int temp = GCD(nums[i], nums[0]);
            if (temp == 1) {
                rprime.push_back(i);
            }

            if (temp < min1a) {
                min2a = min1a;
                min1a = temp;
                minindex = i;

            } else if (temp < min2a && temp >= min1a) {
                min2a = temp;
            }

        }

        if(N>3) {

            int min1b = BIG, min2b = BIG;
            bool one = false;

            for (int i = minindex + 1; i < N; i++) {
                int temp = GCD(nums[i], nums[minindex]);

                if (temp == 1 && find(rprime.begin(), rprime.end(), i) != rprime.end()) {
                    one = true;
                    break;
                }

                if (temp < min1b) {
                    min2b = min1b;
                    min1b = temp;

                } else if (temp < min2b && temp >= min1b) {
                    min2b = temp;
                }

            }

            if (one) {
                cout << 1;

            } else if (min1a==1 && min2a==1) {
                cout << min1b;

            } else if (min2b > min2a) {
                cout << min2b;

            } else {
                cout << min2a;
            }

        } else {
            int gcd = GCD(nums[2], nums[1]);

            if (gcd>min2a) {
                cout << gcd;

            } else {
                cout << min2a;
            }
        }

    } else {
        cout << nums[1];
    }

    return 0;
}