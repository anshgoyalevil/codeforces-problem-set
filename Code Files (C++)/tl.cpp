#include<bits/stdc++.h>
using namespace std;
#define ll long long

int main(){
    ll n,m;
    cin>>n>>m;
    ll a[n],b[m];
    for(int i=0;i<n;i++) cin>>a[i];
    sort(a,a+n);
    for(int j=0;j<m;j++) cin>>b[j];
    sort(b,b+m);
    if(a[n-1]<b[0] && a[0]*2<b[0]){
        if(a[0]*2<=a[n-1]) cout<<a[n-1]<<"\n";
        else cout<<a[0]*2<<"\n";
    }
    else cout<<-1<<"\n";
    return 0;
}
