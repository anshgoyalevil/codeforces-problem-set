#include<iostream>
#include<cstdio>
#include<cmath>
#include<algorithm>
using namespace std;
typedef long long ll;
#define sf scanf
#define pf printf

int main()
{
    ll a, b, c, l, r;
    cin >> l >> r;
    if(l%2!=0)
    {
        l+=1;
    }
    if(r-l<2)
    {
        cout <<"-1" << endl;
    }
    else
    {
        a = l;
        b = l+1;
        c = l+1+1;
        cout << a <<" "<< b <<" " << c << endl;
    }
    return 0;
}
