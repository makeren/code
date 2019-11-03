#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int N;
vector <int> yep;


int main() {
    cin >> N;
    for (int i = 0; i<N; i++) {
        int a; cin >> a;
        yep.push_back(a);
    }
    sort (yep.begin(), yep.end());

    cout << (yep[yep.size()-1]-yep[0]) << "\n";

    return 0;
}

