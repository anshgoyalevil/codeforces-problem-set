#include<bits/stdc++.h>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    //#ifndef ONLINE_JUDGE
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
    //#endif

    int n;
    cin>>n;

    string str;
    cin>>str;

    if(n%2!=0){
        str = str + " ";
    }

    for (int i = 0; i < n/2; i++)
    {
        if(str[i] == 'L' && str[i+(n/2) == 'R']){
            cout<<i+1<<" "<<i+(n/2)+1<<endl;
        }
        else if(str[i] == 'R' && str[i+(n/2) == 'L']){
            cout<<i+(n/2)+1<<" "<<i+1<<endl;
        }
        else{
            cout<<i+1<<" "<<i+(n/2)+1<<endl;
        }
    }
    

    return 0;
}
