#include <iostream>

using namespace std;

int calls = 0;

int fib(int n) {

    calls++;

    if (n == 1) {
        return 1;
    }
    else if (n == 0) {
        return 0;
    }
    return fib(n - 1) + fib(n - 2);
}

int main() {
    int index, x, res = 0;

    cin >> index;

    for (int k = 0; k < index; k++) {
        calls = 0;

        cin >> x;

        if (x >= 0) {

            res = fib(x);

            cout << "fib(" << x << ") = " << calls - 1 << " calls = " << res << endl;

        }
    }

    return 0;
}
