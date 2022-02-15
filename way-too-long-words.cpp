#include <iostream>
using namespace std;
int main(){
    int x;
    cin>>x;
    while(x>0){
        
            x--;
            string s;
    cin>>s;

    int size = s.size();
    string n = s.substr(0, 1) + to_string(size-2) + s.substr(s.size()-1, s.size());
        if(s.size()>10){
        cout<<n<<endl;
        }
        else{
            cout<<s<<endl;
        }
    }
    return 0;
}
