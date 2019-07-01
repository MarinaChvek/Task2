import java.util.Scanner;

public class Main14 {

    public static void main(String[] args) {
	Scanner aa = new Scanner(System.in);
	Scanner bb = new Scanner(System.in);
                 System.out.println("¬ведите число a");
	int a = aa.nextInt();
                 System.out.println("¬ведите число b");
	int b = bb.nextInt();
	if(b % a == 0) {
	    System.out.println("явл€етс€ делителем");
    }
	else{
        System.out.println("Ќе €вл€етс€ делителем");
    }
    }
}
