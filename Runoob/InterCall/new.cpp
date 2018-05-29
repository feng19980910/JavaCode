
#include <iostream>
#define MODE 1000000007
#define ll long long
using namespace std;
ll c(int n);
ll b(int n) {
    if (n == 1) 
        return 1;
    else
        return (c(n - 1) + b(n - 1) + 1) % MODE;
}
ll c(int n) {
    if (n == 1)
        return 2;
    else
        return (2 * c(n - 1) + b(n - 1) + 2) % MODE;
}
int main() {
    int n;
    ll cnt, bnt;
    while (cin >> n) {
        cout << b(n);
        cout << c(n);
    }

    return 0;
}