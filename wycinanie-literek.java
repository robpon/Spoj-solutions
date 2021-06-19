import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws java.lang.Exception {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
String c;
String d;
int i1=0;
        while ((c = r.readLine()) != null) {
            i1++;
            if(i1==1){
                System.out.println();
            }
            String [] tab = c.split(" ");
            List<String> tab1 = new ArrayList<>();
            tab1.addAll(Arrays.asList(tab[1].split("", tab[1].length())));
            tab1.removeAll(Collections.singleton(tab[0]));
            d="";
            for(int i =0; i< tab1.size();i++){
                d+=tab1.get(i);
            }
            System.out.println(d);
        }
	}
}
