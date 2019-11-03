#include <iostream>
#include <string>

using namespace std;

class letter {
public:
    char letter;
    int amount;
};

string S;
int L, K, avg;
letter alpha [26];

int main() {

    getline(cin, S);
    cin >> L >> K;

    for (char c:S) {
        alpha[c-'a'].letter = c;
        alpha[c-'a'].amount++;
    }

    for (int i = 0; i<26; i++) {
        avg+=alpha[0].amount;
    }
    avg/=26;

    struct frequency {
        inline bool operator() (const letter l1, const letter l2) {
            return (l1.amount < l2.amount);
        }
    };

    return 0;
}