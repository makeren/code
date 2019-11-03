#include <iostream>

using namespace std;

double N, n, a, b, t;

int main() {

    cin >> N;

    for (int q = 0; q<N; q++) {
        cin >> n >> a >> b >> t;

        int yes = (t+b*n)/(a+b);
        double dd = (t+b*n)/(a+b);
        if (dd!=yes) {
            yes++;
        }

        if (n*a<t) {
            cout << "-1\n";

        } else {
            cout << yes << "\n";
        }

    }


    return 0;
}