import java.util.Scanner;

public class Main14 {

    public static void main(String[] args) {
	Scanner aa = new Scanner(System.in);
	Scanner bb = new Scanner(System.in);
                 System.out.println("������� ����� a");
	int a = aa.nextInt();
                 System.out.println("������� ����� b");
	int b = bb.nextInt();
	if(b % a == 0) {
	    System.out.println("�������� ���������");
    }
	else{
        System.out.println("�� �������� ���������");
    }
    }
}
