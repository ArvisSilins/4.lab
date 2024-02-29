// 231RDB024 Arvis Siliņš 10

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.home"));
        Scanner sc = new Scanner(System.in);
        System.out.println("231RDB024 Arvis Siliņš 10. grupa");

        String fileName;
        System.out.println("input file name:");
        fileName = sc.nextLine();
        sc.close();

        // nolasīt failu
        FileReader fr = new FileReader(fileName);
        sc = new Scanner(fr);
        String str;
        int n = 0;
        int number;
        int sum = 0;
        int avg_grade = 0;
        while (sc.hasNext()) {
            if (sc.hasNextInt()){
                number = sc.nextInt();
                n += 1;
                sum += number;
                System.out.println(number);
            }
            else 
            str = sc.next();
            
           
        }
        sc.close();
        System.out.println("summa" + sum);
        // ievadīto no tastatūras faila nosaukumu fileName nemodificēt,
        // nepievienot mapes vārdu, nepievienot tipu txt

        System.out.println("result:");

        // izvadīt rezultātus

    }

}