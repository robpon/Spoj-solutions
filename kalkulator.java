import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {


        int a;
        int b;
        String c;
        int i=0;
        String d;
        Scanner t = new Scanner(System.in);
        int [] tab = new int[100];
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

            while ((c = r.readLine()) != null && i<=100) {
                String [] tab1 = c.split(" ");
                a = Integer.parseInt(tab1[1]);
                b = Integer.parseInt(tab1[2]);
                d=tab1[0];
                i++;
                switch (d) {
                    case "+":
                        tab[i] = a + b;
                        System.out.println(tab[i]);

                        break;
                    case "-":
                        tab[i] = a - b;
                        System.out.println(tab[i]);

                        break;
                    case "/":
                        tab[i] = a / b;
                        System.out.println(tab[i]);

                        break;
                    case "*":
                        tab[i] = a * b;
                        System.out.println(tab[i]);

                        break;
                    case "%":
                        tab[i] = a % b;
                        System.out.println(tab[i]);

                        break;
                }

            }	
	}
}
