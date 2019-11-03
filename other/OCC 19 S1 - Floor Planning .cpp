#include <iostream>

using namespace std;
int x1, x2, x3, x4, y1, y2, y3, y4, area1, area2;

int main() {
    cin >> x1 >> y1 >> x2 >> y2;
    cin >> x3 >> y3 >> x4 >> y4;

    area1 = abs(x2-x1)*abs(y2-y1) + abs(x4-x3)*abs(y4-y3);

    if ((((x3<x1 && x1<x4) || (x4<x1 && x1<x3)) && ((y3<y1 && y1<y4)||(y4<y1 && y1<y3))) ||
        (((x3<x2 && x2<x4) || (x4<x2 && x2<x3)) && ((y3<y2 && y2<y4)||(y4<y2 && y2<y3))) ||
        (((x1<x3 && x3<x2) || (x2<x3 && x3<x1)) && ((y1<y3 && y3<y2)||(y2<y3 && y3<y1))) ||
        (((x1<x4 && x4<x2) || (x2<x4 && x4<x1)) && ((y1<y4 && y4<y2)||(y2<y4 && y4<y1)))) {

        if (x2 > x1) {
            if (x4 > x3) {
                if (y4>y2) {
                    if (y1>y2) {
                        area2 = abs(max(x1, x3) - min(x2, x4)) * abs(max(y3, y2) - min(y1, y4));
                    } else {
                        area2 = abs(max(x1, x3) - min(x2, x4)) * abs(max(y3, y1) - min(y2, y4));
                    }

                } else if (y4<y2) {
                    if (y1>y2) {
                        area2 = abs(max(x1, x3) - min(x2, x4)) * abs(max(y4, y2) - min(y1, y3));
                    } else {
                        area2 = abs(max(x1, x3) - min(x2, x4)) * abs(max(y4, y1) - min(y2, y3));
                    }
                }

            } else {
                if (y3<y2) {
                    if (y1>y2) {
                        area2 = abs(max(x1, x4) - min(x2, x3)) * abs(max(y2, y3) - min(y1, y4));
                    } else {
                        area2 = abs(max(x1, x4) - min(x2, x3)) * abs(max(y1, y3) - min(y2, y4));
                    }

                } else if (y3>y1) {
                    if (y1>y2) {
                        area2 = abs(max(x1, x4) - min(x2, x3)) * abs(max(y2, y4) - min(y1, y3));
                    } else {
                        area2 = abs(max(x1, x4) - min(x2, x3)) * abs(max(y1, y4) - min(y2, y3));
                    }

                }
            }
        } else {
            if (x4 > x3) {
                if (y4<y2) {
                    if (y1>y2) {
                        area2 = abs(max(x2, x3) - min(x1, x4)) * abs(max(y4, y2) - min(y1, y3));
                    } else {
                        area2 = abs(max(x2, x3) - min(x1, x4)) * abs(max(y4, y1) - min(y2, y3));
                    }

                } else if (y4>y1) {
                    if (y1>y2) {
                        area2 = abs(max(x2, x3) - min(x1, x4)) * abs(max(y2, y3) - min(y4, y1));
                    } else {
                        area2 = abs(max(x2, x3) - min(x1, x4)) * abs(max(y1, y3) - min(y4, y2));
                    }

                }

            } else {
                if (y3<y1) {
                    if (y1>y2) {
                        area2 = abs(max(x2, x4) - min(x1, x3)) * abs(max(y2, y3) - min(y1, y4));
                    } else {
                        area2 = abs(max(x2, x4) - min(x1, x3)) * abs(max(y1, y3) - min(y2, y4));
                    }

                } else if (y3>y2) {
                    if (y1>y2) {
                        area2 = abs(max(x2, x4) - min(x1, x3)) * abs(max(y2, y4) - min(y1, y3));
                    } else {
                        area2 = abs(max(x2, x4) - min(x1, x3)) * abs(max(y1, y4) - min(y2, y3));
                    }

                }
            }
        }
    }

    // cout << area1 << " " << area2 << "\n";

    cout << area1 - area2;

}
