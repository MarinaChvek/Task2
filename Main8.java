import java.util.Scanner;


    public class Main8 {

        public static void main(String[] args) {
	System.out.println("������� ����������� ������� � ������� ���������� ������:");
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	double s = in.nextDouble();
	double ro = n/s; // ��������� ��������� �� ������� ����� �������/������� ������.
	System.out.println("��������� ��������� � �����������: " + ro);
    }
}