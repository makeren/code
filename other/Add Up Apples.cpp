#include <iostream>
#include <vector>

using namespace std;

int N, total;
vector<int> nums;

void add (int n) {
    if (n==0 && nums.size()!=1) {
        total++;
        cout << N << "=";
        for (int i = nums.size()-1; i>0; i--) {
            cout << nums.at(i) << "+";
        }
        cout << nums.at(0) << "\n";
        return;
    }

    for (int i = 1; i<=n; i++) {
        if (n==N || i<=nums.at(nums.size()-1)) {
            nums.push_back(i);
            add(n - i);
            nums.erase(nums.begin() + nums.size() - 1);
        }

    }
}


int main() {
    cin >> N;
    add(N);
    cout << "total=" << total;

    return 0;
}