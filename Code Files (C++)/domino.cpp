#include<bits/stdc++.h>
using namespace std;
#define ll long long

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    #ifndef ONLINE_JUDGE
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
    #endif
    ll n;
    cin>>n;
    ll a[n],b[n],sa=0,sb=0,c=0;
    for(int i=0;i<n;i++){
        cin>>a[i]>>b[i];
        sa+=a[i];
        sb+=b[i];
    }
    if(sa%2==0 && sb%2==0) cout<<0<<"\n";
    else if((sa+sb)%2!=0) cout<<-1<<"\n";
    else{
        for(int i=0;i<n;i++){
            if((a[i]%2==0 && b[i]%2!=0) || (a[i]%2!=0 && b[i]%2==0)){
                c=1;
                break;
            }
        }
        if(c==1) cout<<1<<"\n";
        else cout<<-1<<"\n";
    }
    return 0;
}
