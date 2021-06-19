import java.util.Scanner;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int a;
Scanner t =  new Scanner(System.in);
a = t.nextInt();
if(a <=100){
    int [][] tab  = new int [a][];
    int [] b = new int[a];
    for(int i =0; i <a ; i++){

        b[i] = t.nextInt();
        tab[i] = new int[b[i]];
        for(int i1 =0; i1 < b[i]; i1++){
            tab[i][i1]=t.nextInt();
        }
    }
    for(int i =0;  i < a; i++){
        for(int i1 = 0; i1 < b[i];i1++){
            if(tab[i][i1]<=100){
                if(i1==b[i]-1){
                    System.out.println("");
                    for(int i2 = 0; i2 < b[i]; i2++){
                        if(i2 >= 1){
                            System.out.print(" ");
                        }else{}
                        System.out.print(tab[i][(b[i])-1-i2]);
                    }
                }
            }else{
                break;
            }
        }
    }
}	
	}
}
