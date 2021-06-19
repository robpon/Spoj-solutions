#include <iostream>
using namespace std;

int main() {
 int a, b, c =0;
    int d = 5;
    cin >> a;
    if(a<100000){
        int tab [a];
         for (int i = 0; i < a; i++) {
        cin>>b;
                c=0;
                d=5;
                if(b<1073741824) {
                    while(d<=b){
                    c =c+ ( b / d);
                    d=d*5;
                    }
                    tab[i] = c;
                }else{
                    tab[i]=-1;
                }
            }
            for (int i = 0; i < a; i++) {
                if(tab[i]>-1){
                cout << tab[i] <<endl;
                }
            }
    }
	return 0;
}
