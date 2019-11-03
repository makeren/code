#include <iostream>
#include <vector>
#include <algorithm>

int factors [1000010];
std::vector<int> numfactors[100010];
int T, K, A, B, count;

int binsearchup (std::vector<int> arr, int key) {
    int l = 0, r = arr.size()-1;

    while (l<=r) {
        int mid = l+(r-l+1)/2;

        if (arr[mid]<key) {
            l = mid+1;
        } else {
            r = mid-1;
        }
    }

    return l;

}

int binsearchdown (std::vector<int> arr, int key) {
    int l = 0, r = arr.size()-1;

    while (l<=r) {
        int mid = l+(r-l)/2;

        if (arr[mid]<key) {
            l = mid+1;
        } else {
            r = mid-1;
        }
    }

    return l;

}


int main() {

    std::fill_n(factors, 100010, 2);
    factors[1] = 1;

    for (int i = 2; i<=50000; i++) {
        for (int j = i*2; j<=100000; j+=i) {
            factors[j]++;
        }
    }

    for (int i = 1; i<=100000; i++) {
        numfactors[factors[i]].push_back(i);
    }

//    for (int i = 0; i<10; i++) {
//        for (int j = 0; j<numfactors[i].size; j++) {
//
//        }
//    }

    std::cin >> T;

    for (int q = 0; q<T; q++) {
        std::cin >> K >> A >> B;
      //  int count = binsearchdown(numfactors[K], B) - binsearchup(numfactors[K], A);
        std::cout << count << "\n";

    }




    return 0;
}