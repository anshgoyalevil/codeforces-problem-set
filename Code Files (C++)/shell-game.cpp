#include<bits/stdc++.h>
using namespace std;
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
 

    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);

 
    int ballInitialIndex = 0;
    cin>>ballInitialIndex;
    ballInitialIndex = ballInitialIndex-1;
 
    int arr[3] = {0, 0, 0};
    
    arr[ballInitialIndex] = 1;
        int a1 = 0;
        int b1 = 0;
        int a2 = 0;
        int b2 = 0;
        int a3 = 0;
        int b3 = 0;
 
        cin>>a1>>b1>>a2>>b2>>a3>>b3;
 
        a1 = a1-1;
        b1 = b1-1;
        a2 = a2-1;
        b2 = b2-1;
        a3 = a3-1;
        b3 = b3-1;
 
        int temp11 = arr[a1];
        int temp12 = arr[b1];
        arr[a1] = temp12;
        arr[b1] = temp11;
        int temp21 = arr[a2];
        int temp22 = arr[b2];
        arr[a2] = temp22;
        arr[b2] = temp21;
        int temp31 = arr[a3];
        int temp32 = arr[b3];
        arr[a3] = temp32;
        arr[b3] = temp31;
 
        for (int i = 0; i<3; i++){
            if (arr[i] == 1){
                cout<<i+1;
                break;
            }
        }
 
    return 0;
}
