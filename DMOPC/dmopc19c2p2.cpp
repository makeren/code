#include <iostream>
#include <queue>
using namespace std;

class Coor {
public:
    int r, c;
};

int N, M, a;
int grid [502][502];

int main() {
    cin >> N >> M;
    for (int n = 1; n<=N; n++) {
        for (int m = 1; m<=M; m++) {
            cin >> a;
            grid[n][m] = a;
        }
    }

    for (int i = 2; i<=M+1; i++) {
        grid[0][i] = 1<<30;
    }
    for (int i = 2; i<=N+1; i++) {
        grid[i][0] = 1<<30;
    }

    for (int i = 1; i<=N; i++) {
        for (int j = 1; j<=M; j++) {
            grid[i][j]+= min(grid[i-1][j], grid[i][j-1]);
        }
    }

    cout << grid[N][M] << "\n";

    return 0;
}