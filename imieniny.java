import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a;
int b;
Scanner t = new Scanner (System.in);
    a=t.nextInt();
    if(1<= a && a <= 500){
        int [][] tab = new int[a][2];
        for(int i =0; i < a; i++){
            tab[i][0]=t.nextInt();
            tab[i][1]=t.nextInt();
        }
        for(int i =0 ; i< a; i++){
            b=0;
            if(1<=tab[i][0] && tab[i][0] <= 1000000000 ){
                if(1<=tab[i][1]&&tab[i][1]<=1000000000){
                    if(tab[i][0]-1==0){
                        System.out.println("TAK");
                    }else{
                    b=tab[i][1]/(tab[i][0]-1);
                    if(b*(tab[i][0]-1)==tab[i][1]){
                        System.out.println("NIE");
                    }else{
                        System.out.println("TAK" );
                    }}
            }}
        }
    }
	}
