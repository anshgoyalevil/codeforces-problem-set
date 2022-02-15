#include <iostream>
using namespace std;
int n, b, pres[105];
int main() {
    cin >> n;
    for (int i = 1; i <= n; i++) {
        cin >> b;
        pres[b] = i;
    }
    for (int i = 1; i <= n; i++) {
        cout << pres[i] << " ";
    }
}
