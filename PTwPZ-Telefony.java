import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 int a;
       Scanner t = new Scanner(System.in);
       a =t.nextInt();
       if(1<=a && a <= 20){
           String [] tab = new String[a];
           for(int i =0; i <a ;i++){
               tab[i]=t.next();
           }
           String [][] tab1 = new String[a][];
           for(int i =0; i < a; i++){
               tab1[i]=tab[i].split("",tab[i].length());
           }
           for(int i =0; i<a; i++) {
               if(4<=tab[i].length()&&tab[i].length()<=20){
               for (int i1 = 0; i1 < tab[i].length(); i1++) {
                   switch (tab1[i][i1]) {
                       case ("A"):
                           System.out.print("2");
                           break;
                       case ("B"):
                           System.out.print("2");
                           break;
                       case ("C"):
                           System.out.print("2");
                           break;
                       case ("D"):
                           System.out.print("3");
                           break;
                       case ("E"):
                           System.out.print("3");
                           break;
                       case ("F"):
                           System.out.print("3");
                           break;
                       case ("G"):
                           System.out.print("4");
                           break;
                       case ("H"):
                           System.out.print("4");
                           break;
                       case ("I"):
                           System.out.print("4");
                           break;
                       case ("J"):
                           System.out.print("5");
                           break;
                       case ("K"):
                           System.out.print("5");
                           break;
                       case ("L"):
                           System.out.print("5");
                           break;
                       case ("M"):
                           System.out.print("6");
                           break;
                       case ("N"):
                           System.out.print("6");
                           break;
                       case ("O"):
                           System.out.print("6");
                           break;
                       case ("P"):
                           System.out.print("7");
                           break;
                       case ("Q"):
                           System.out.print("7");
                           break;
                       case ("R"):
                           System.out.print("7");
                           break;
                       case ("S"):
                           System.out.print("7");
                           break;

                       case ("T"):
                           System.out.print("8");
                           break;
                       case ("U"):
                           System.out.print("8");
                           break;
                       case ("V"):
                           System.out.print("8");
                           break;
                       case ("W"):
                           System.out.print("9");
                           break;
                       case ("X"):
                           System.out.print("9");
                           break;
                       case ("Y"):
                           System.out.print("9");
                           break;
                       case ("Z"):
                           System.out.print("9");
                           break;
                   }

               }
               System.out.println();
           }
           }

       }	
	}
}
