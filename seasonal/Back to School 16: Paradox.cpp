#include <iostream>
#include <set>
#include <string>

using namespace std;

set<bool> dox;
int C;

int main() {
    cin >> C;

    for (int q = 0; q<C; q++) {
        int com; string s; bool E;
        cin >> com;

        if (com == 1) {
            cin >> s; E = (s=="false" ? false:true);
            cout << (dox.insert(E).second ? "true":"false") << "\n";

        } else if (com == 2) {
            cin >> s; E = (s=="false" ? false:true);
            cout << (dox.erase(E)? "true":"false") << "\n";

        } else if (com == 3) {
            cin >> s; E = (s=="false" ? false:true);
            cout << (dox.find(E) == dox.end() ? -1 : *dox.find(E)) << "\n";

        } else {
            for (bool b:dox) {
                cout << (b ? "true":"false") << " ";
            }
            cout << "\n";

        }
    }


    return 0;
}