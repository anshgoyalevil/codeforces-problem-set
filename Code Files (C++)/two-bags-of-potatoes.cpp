#include<bits/stdc++.h>
using namespace std;

int main(){

ios_base:: sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);

    long y;
        long k;
        long n;
cin>>y>>k>>n;
        long c=(n-y+k-1)/k,z=k-y%k;
        bool c1=false,z1=true;
        if(c<1) cout<<-1<<"\n";
        else{
            for (int i = 0; i<c; i++){
                if(z+y>n){c1=true; break;}
                cout<<z<<" ";
                z+=k;
                z1=false;
            }
            if(c1 && z1) cout<<-1<<"\n";
        }

    return 0;

}
