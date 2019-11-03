#include <iostream>
#include <queue>

const int MAX = 2147483647;

using namespace std;

class Cost {
public:
    int d, l, r;
};

class Coor {
public:
    int r, c;
};

int N;
char grid [1002][1002];
Cost cost [1002][1002];
int total [1002][1002];

int main() {

    cin >> N;

    for (int r = 1; r<=N; r++) {
        for (int c = 1; c<=N; c++) {
            total[r][c] = MAX;
        }
    }
    total[1][1] = 0;

    for (int r = 1; r<=N; r++) {
        for (int c = 1; c<=N; c++) {
            char n; cin >> n;
            grid[r][c] = n;
        }
    }

    queue<Coor> q;
    Coor cur{}; cur.r = 1; cur.c = 1;
    q.push(cur);

    while (!q.empty()) {
        cur = q.front(); q.pop();
        int r = cur.r, c = cur.c, cl = cost[r][c].l, cr = cost[r][c].r, cd = cost[r][c].d;

        cd++;
        if (total[r+1][c]>(cl*cl + cr*cr + cd*cd) && grid[r+1][c]=='.') { // down
            cost[r+1][c].l = cl; cost[r+1][c].r = cr; cost[r+1][c].d = cd;

            total[r+1][c] = cl*cl + cr*cr + cd*cd;
            Coor next{}; next.r = r+1; next.c = c;
            q.push(next);
        }
        cd--;

        cr++;
        if (total[r][c+1]>(cl*cl + cr*cr + cd*cd) && grid[r][c+1]=='.') { // right
            cost[r][c+1].l = cl; cost[r][c+1].r = cr; cost[r][c+1].d = cd;

            total[r][c+1] = cl*cl + cr*cr + cd*cd;
            Coor next{}; next.r = r; next.c = c+1;
            q.push(next);
        }
        cr--;

        cl++;
        if (total[r][c-1]>(cl*cl + cr*cr + cd*cd) && grid[r][c-1]=='.') { // left
            cost[r][c-1].l = cl; cost[r][c-1].r = cr; cost[r][c-1].d = cd;

            total[r][c-1] = cl*cl + cr*cr + cd*cd;
            Coor next{}; next.r = r; next.c = c-1;
            q.push(next);
        }

    }

    if (total[N][N]==MAX) {
        cout << -1 << "\n";

    } else {
        cout << total[N][N] << "\n";
    }

    return 0;
}