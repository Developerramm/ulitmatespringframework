#include <iostream>
using namespace std;

int main(){

    int rowcount,colcount;
    cout << "Enter row ";
    cin >> rowcount;
    cout << "Enter col ";
    cin >> colcount;

    for(int row = 0; row <rowcount; row++){
        if(row == 0 || row == rowcount -1){
            for(int col = 0; col <colcount; col++){
                cout << "*";
            }
        }else{
            cout << "*";
            for(int i= 0; i<colcount; i++){
                cout << " ";
            }
            cout << "*";
        }
        cout << endl;
    }


    return 0;
}