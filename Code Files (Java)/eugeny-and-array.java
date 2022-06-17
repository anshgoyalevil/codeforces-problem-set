#include<bits/stdc++.h>
using namespace std;

int main(){

ios_base:: sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);

    int n;
    cin>>n;
        int q;
        cin>>q;
 
        int ones = 0;
        int minusOnes = 0;
 
        for (int i = 0; i<n; i++){
 
            int in;
            cin>>in;
 
            if (in == -1){
                minusOnes++;
            }else if (in == 1){
                ones++;
            }
 
        }
        for (int i = 0; i<q; i++){
            int l;
            int r;
            cin>>l>>r;
 
            int diff = r-l + 1;
 
            if (diff%2!=0){
                cout<<0<<"\n";
            }
            else {
 
                if (diff/2 <= ones && diff/2 <= minusOnes){
                    cout<<1<<"\n";
                }
                else {
                    cout<<0<<"\n";
                }
 
            }
        }

    return 0;

}
