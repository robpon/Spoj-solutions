import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a;
int c=0;
int b=0;
Scanner t = new Scanner(System.in);
a=t.nextInt();
if(1<=a && a <= 10){
    int [][] tab = new int[a][2];
    for(int i =0; i < a; i++){
        tab[i][0]=t.nextInt();
        tab[i][1]=t.nextInt();

    }
    for(int i = 0;i < a;i++){
        b=0;
        c=0;
        b=tab[i][0];
        c=tab[i][1];
        while(b!=c ){
            if(b != 0 ) {
                if( c!=0 ){
                if (b < c) {
                    c = c - b;
                } else {
                    b = b - c;
                }
            }else
                break;
        }else
            break;
        }
        System.out.println(b+c);
    }
}
	}
}
