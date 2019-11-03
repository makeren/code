#include <iostream>
#include <vector>

using namespace std;
string name1, name2;
int v1, v2, temp;
vector<vector<int>> cycle = {{0}, {1}, {2, 4, 8, 6}, {3, 9, 7, 1}, {4, 6}, {5}, {6}, {7, 9, 3, 1}, {8, 4, 2, 6}, {9, 1}};

int main() {
    cin >> name1 >> name2;

    for (int i = 0; i<name1.length(); i++) {
        temp = (tolower(name1.at(i)) - 'a' + 1)%10;
        int pos = (i+1)%(cycle[temp].size());

        if (pos==0) {
            pos = cycle[temp].size()-1;

        } else {
            pos--;
        }

        v1 += cycle[temp][pos];
    }

    for (int i = 0; i<name2.length(); i++) {
        temp = (tolower(name2.at(i)) - 'a' + 1)%10;
        int pos = (i+1)%(cycle[temp].size());

        if (pos==0) {
            pos = cycle[temp].size()-1;

        } else {
            pos--;
        }
        v2 += cycle[temp][pos];
    }

    if (v1%10==0) {
        v1 = 10;
    } else {
        v1%=10;
    }

    if (v2%10==0) {
        v2 = 10;
    } else {
        v2%=10;
    }

    cout << (v1+v2);


    return 0;
}