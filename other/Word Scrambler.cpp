#include <iostream>
#include <algorithm>

using namespace std;

char letter [5];
int length;

void anagram (string str) {
    if (str.length() == length) {
        cout << str << "\n";
    }

    for (int i = 0; i<length; i++) {
        if (str.find(letter[i])==string::npos) {
            str+=letter[i];
            anagram(str);
            str = str.substr(0, str.length()-1);
        }

    }

}

int main() {
    string ln; getline(cin, ln);
    length = ln.length();

    for (int i = 0; i<length; i++) {
        letter[i] = ln.at(i);
    }

    sort(letter, letter+length);

    anagram("");

    return 0;
}