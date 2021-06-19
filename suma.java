import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws java.lang.Exception {
	BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String c;
     int d;
     int g=0;
        int i1=0;
        while ((c = r.readLine()) != null) {
            d=Integer.parseInt(c);
            if(-100 <= d && d<= 100){
                System.out.println(g=g+d);
            }
}	
		
	}
}
