import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String c ;
        Scanner t = new Scanner(System.in);

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        while ((c = r.readLine()) != null) {
String [] tab = c.split("",c.length());
for(int i =tab.length-1; i>=0; i--){
    System.out.print(tab[i]);
}
            System.out.println();
        }
    }
}
