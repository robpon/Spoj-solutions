import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    String a;
       Scanner t = new Scanner(System.in);
       a=t.nextLine();
String [] tab = a.split(" ");
for(int i =tab.length-1; i>= 0; i--){
    System.out.print(tab[i] + " ");
}	
	}
}
