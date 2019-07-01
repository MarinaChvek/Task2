import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
     System.out.println("a) ");
     int a = 5;
     int b = 10;
     String c = "7 см";
     System.out.println(a + " " + b + "\n" + c); // "\n" - переход на новую строку
     System.out.println("b) ");
     int d = 100;
     int e = 1949;
     Scanner t = new Scanner(System.in);
     Scanner v = new Scanner(System.in);
     System.out.println(d + " " + t.nextLine() + "\n" + e + " " + v.nextLine());
     System.out.println("c) ");
     int f = 25;
     Scanner x = new Scanner(System.in);
     Scanner y = new Scanner(System.in);
     int z = x.nextInt();
     System.out.println(z  + " " + f + "\n" + z + " " + y.nextLine());

    }
}