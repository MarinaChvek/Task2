
//� ���������� ���������� ������� ����������� ��� "��", ����� ��� "�" � ����� ��� "���", ���� ������� �������� �� ������� ��������
//! - ���������� �������� ��
//& - ���������� �������� �
//| - ���������� �������� ���
public class Main10 {
    public static void main(String[] args) {
         boolean x = false;
         boolean y = false;
         boolean z = true;
         System.out.println("X - ����,Y - ����, Z - ������" );
              boolean a = x | y & !z;
              boolean b = !x & !y;
              boolean v = !(x & z) | y;
              boolean g = x & !y | z;
              boolean d = x & (!y | z);
              boolean e = x & (!(y | z));
               System.out.println("a) " + a);
    System.out.println("�) " + b);
    System.out.println("�) " + v);
    System.out.println("�) " + g);
    System.out.println("�) " + d);
    System.out.println("�) " + e);

    }
}
