import java.util.Scanner;


    public class Main8 {

        public static void main(String[] args) {
	System.out.println("Введите колличество жителей и площадь территории страны:");
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	double s = in.nextDouble();
	double ro = n/s; // плотность населения по формуле число жителей/площадь страны.
	System.out.println("Плотность населения в государстве: " + ro);
    }
}