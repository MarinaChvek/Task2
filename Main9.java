import java.util.Scanner;

    public class Main9 {

        public static void main(String[] args) {
	System.out.println("�) ������� �������� a,b,c:");
	Scanner in= new Scanner(System.in);
	Double a = in.nextDouble();
	Double b = in.nextDouble();
	Double c = in.nextDouble();
	Double z;
	System.out.println("a=" + a + " b=" + b + " c=" + c );
	z = a;
	a = b;
	b = c;
	c = z;
	System.out.println("����� ������ �����������:" + "a=" + a + " b=" + b + " c=" + c );
                System.out.println("�) ������� �������� a,b,c:");
                Double f;
                Double q = in.nextDouble();
	Double p = in.nextDouble();
	Double m = in.nextDouble();
                System.out.println("a=" + q + " b=" + p + " c=" + m );
                f = m;
	m = p;
	p = q;
	q = f;
                System.out.println("����� ������ �����������:" + "a=" + q + " b=" + p + " c=" + m );
    }

}