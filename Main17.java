import java.util.Scanner;

public class Main17 {

    public static void main(String[] args) {
	Scanner aa = new Scanner(System.in);
	System.out.print ("������� ���� ������:");
	byte a = aa.nextByte();
                switch (a) {
                         case 1:
		System.out.println (" �����������");
		break; 
	         case 2:
		System.out.println ("�������");
		break; 
	         case 3:
		System.out.println ("�����");
		break; 
 	         case 4:
		System.out.println ("�������");
		break; 
 	         case 5:
		System.out.println ("�������");
		break;
                         case 6:
		System.out.println ("�������");
		break;  
                         case 7:
		System.out.println ("�����������");
		break; 
	         default:
		System.out.println("�� ����� ������������ �����");
		break;
	} 
     }
}