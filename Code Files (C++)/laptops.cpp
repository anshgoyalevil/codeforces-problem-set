#include<bits/stdc++.h>
using namespace std;
#define ll long long

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    int n;
    cin>>n;
    bool flag = false;

    vector<pair<int, int>> v(n);

    for(int i = 0; i<n; i++){
        int f;
        int s;
        cin>>f>>s;
        v[i].first = f;
        v[i].second = s;
    }

    sort(v.begin(), v.end());

    for(int i = 0; i<n-1; i++){
        if(v[i].second > v[i+1].second){
            flag = true;
            break;
        }
    }

    if(flag){
        cout<<"Happy Alex"<<"\n";
    }
    else{
        cout<<"Poor Alex"<<"\n";
    }

    return 0;
}
