#include <iostream>
#include <string>

using namespace std;

int main() {

    string word; cin >> word;
    while (word!="X") {
        unsigned long length = word.length()/2 + 1;

        for (unsigned long i = 0; i<length; i++) {
            int index = word.find("ANA");

            while (index!=string::npos) {
                word.replace(index, 3, "A");
                index = word.find("ANA");
            }

            index = word.find("BAS");

            while (index!=string::npos) {
                word.replace(index, 3, "A");
                index = word.find("BAS");
            }

        }

        if (word=="A") {
            cout << "YES\n";

        } else {
            cout << "NO\n";
        }

        cin >> word;

    }



    return 0;
}