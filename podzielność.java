import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		   int a;
       int b=0;
       Scanner t = new Scanner(System.in);
       a=t.nextInt();
       if(1<=a && a<=100000){
           int [][] tab = new int[a][3];
           List <Integer> tab1 = new ArrayList<>();
           for(int i =0 ; i< a;i++){
               for(int i1 =0; i1 < 3; i1++){
                   tab[i][i1]=t.nextInt();
               }
           }
           for(int i =0 ; i< a;i++){
               b=0;
               while (tab[i][1]*(b+1)<tab[i][0]){
              b++;
               if((tab[i][1]*b)%tab[i][2]!=0){
                   System.out.print(tab[i][1]*b+" ");
               }
           }
               System.out.println("");
           }
       }
	}
}
