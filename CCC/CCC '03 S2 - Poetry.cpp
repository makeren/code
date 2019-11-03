#include <iostream>
#include <algorithm>
#include <cctype>
#include <string>

using namespace std;

int N;
string poem [20];

int main() {

    cin >> N;
    cin.ignore(1,'\n');

    for (int i = 0; i<N*4; i++) {
        string ln; getline(cin, ln);
        transform(ln.begin(), ln.end(), ln.begin(), ::tolower);

        for (int j = ln.length()-1; j>=0; j--) {
            if (ln.at(j) == 'a' || ln.at(j) == 'e' || ln.at(j) == 'i' || ln.at(j) == 'o' || ln.at(j) == 'u' || ln.at(j) == ' ' || j==0) {
                poem[i] = ln.substr(j);
                break;
            }
        }

    }

    for (int i = 0; i<N; i++) {

        if (poem[i*4] == poem[i*4+1] && poem[i*4+2] == poem [i*4+3]) { // perfect or even
            if (poem[i*4+1] == poem [i*4+2]) {
                cout << "perfect\n";

            } else {
                cout << "even\n";
            }

        } else { // cross, shell, or free
            if (poem[i*4] == poem[i*4+2] && poem[i*4+1] == poem[i*4+3]) {
                cout << "cross\n";

            } else if (poem[i*4] == poem[i*4+3] && poem[i*4+1] == poem[i*4+2]) {
                cout << "shell\n";

            } else {
                cout << "free\n";
            }
        }



    }




    return 0;
}