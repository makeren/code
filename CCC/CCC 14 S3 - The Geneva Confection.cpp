#include <iostream>
#include <stack>

using namespace std;

stack <int> mount, branch, empty;

int N, T;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> T;

    for (int t = 0; t<T; t++) {

        cin >> N;
        for (int n = 0; n<N; n++) {
            int car; cin >> car;
            mount.push(car);
        }

        int cur = 1;

        while (cur<=N) {

            if (mount.empty() && cur!=branch.top()) {
                break;
            }

            while (!mount.empty() && mount.top() == cur) {
                mount.pop();
                cur++;
            }

            while (!branch.empty() && branch.top()==cur) {
                branch.pop();
                cur++;
            }

            if (!mount.empty() && cur!=mount.top()) {
                branch.push(mount.top());
                mount.pop();
            }

        }

        if (mount.empty() && branch.empty()) {
            cout << "Y\n";

        } else {
            cout << "N\n";
        }

        mount = empty;
        branch = empty;


    }

    return 0;
}