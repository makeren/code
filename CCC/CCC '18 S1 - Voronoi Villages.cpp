#include <iostream>
#include <vector>
#include <algorithm>
#include <math.h>
#include <iomanip>

int N, v;
double neighbourhood, min = 2000000001;
std::vector <double> villages;

int main() {

    std::cin >> N;

    for (int i = 0; i<N; i++) {
        std::cin >> v;
        villages.push_back(v);
    }

    sort(villages.begin(), villages.end());

    for (int i = 1; i<N-1; i++) {
        neighbourhood = (villages.at(i+1) - villages.at(i-1))/2;
        min = fmin(min, neighbourhood);
    }

    std::cout << std::fixed << std::setprecision(1) << min;

    return 0;
}