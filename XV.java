import java.util.Scanner;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner t = new Scanner(System.in);
        for (int i = 0; i < 1000; i++) {
         String a1 = t.nextLine();
         if(!a1.equals("0") ) {
             if (a1.length() <= 1000) {
                 String[] tab = a1.split("", a1.length());
                 long number = 0;
                 for (String t1 : tab) {
                     number = number + Integer.parseInt(t1);
                 }
                 if (number % 3 == 0) {
                     if (Integer.parseInt(tab[tab.length-1]) == 0 || Integer.parseInt(tab[tab.length-1]) == 5) {
                         System.out.println("TAK");
                     } else
                         System.out.println("NIE");
                 } else
                     System.out.println("NIE");
             }
         }
         else
             break;
    }	
	}
}
