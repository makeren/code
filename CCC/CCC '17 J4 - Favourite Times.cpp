#include <iostream>

int D, total, count;
int led [] = {1, 2, 0, 0};

void checkTime() {

    if (led[0]==1 && led[1]==3) {
        led[0] = 0;
        led[1] = 1;
    }

    if (led[3]==10) {
        led[2]++;
        led[3] = 0;
        checkTime();
    }

    if(led[2] == 6) {
        led[1]++;
        led[2] = 0;
        checkTime();
    }

    if (led[1] == 10) {
        led[0]++;
        led[1] = 0;
        checkTime();
    }

}

bool check() {
    return (led[0] == 0 && (led[3] - led[2]) == (led[2] - led[1])) ||
           ((led[3] - led[2]) == (led[2] - led[1]) && (led[2] - led[1]) == (led[1] - led[0]));

}



int main() {
    std::cin >> D;

    for (int i = 0; i<720; i++) {
        if (check()) {
            total++;
        }
        led[3]++;
        checkTime();

    }

    count += (D/720)*total;
    led[0] = 1;
    led[1] = 2;
    led[2] = 0;
    led[3] = 0;

    for (int i = 0; i<=D%720; i++) {
        if (check()) {
            count++;
        }
        led[3]++;
        checkTime();
    }

    std::cout << count;

    return 0;
}
