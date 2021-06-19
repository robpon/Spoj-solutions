import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Main
        {
            public static void main (String[] args) throws java.lang.Exception
            {
                List<String> wagaM = new ArrayList<>();
                List<String> wagaN = new ArrayList<>();
                List<String> wagaD = new ArrayList<>();
                Scanner scanner = new Scanner(System.in);
                int a = scanner.nextInt();
                if(a<=100) {
                    for (int i = 0; i < a; i++) {
                        String name = scanner.next();
                        int weight = scanner.nextInt();
                        int height = scanner.nextInt();
                        if(name.length()<=20 && height <= 200 && weight <=200 && height>0 && weight>0) {
                            double heightInMeters = (double) height / 100;
                            double BMI = weight / (heightInMeters * heightInMeters);
                            if (BMI < 18.5) {
                                wagaM.add(name);
                            } else if (BMI >= 25) {
                                wagaD.add(name);
                            } else {
                                wagaN.add(name);
                            }
                        }
                    }
                    System.out.println("niedowaga");
                    for (String t : wagaM) {
                        System.out.println(t);
                    }
                    System.out.println("\nwartosc prawidlowa");
                    for (String t : wagaN) {
                        System.out.println(t);
                    }
                    System.out.println("\nnadwaga");
                    for (String t : wagaD) {
                        System.out.println(t);
                    }
                }
            }

}
