package Week_14th;
import java.util.*;

public class Ex_PrintStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 65;
		float f = 1234.56789f;
		Date d = new Date();

		// ����ȭ�� ���ڿ��� ���� �Ű������� ������ �׻� ��ġ�ؾ� ��.
		System.out.printf("���� %c�� �ڵ�� %d%n", i, i);
		System.out.printf("%d�� 8������ %o, 16������ %x%n", i ,i, i);
		System.out.printf("%3d%3d%3d%n", 100, 90, 80);
		System.out.println();
		System.out.printf("123456789012345678901234567890%n");
		System.out.printf("%s%-5s%5s%n", "123", "123", "123");
		System.out.println();
		System.out.printf("%-8.1f%8.1f %e%n",f,f,f);
		System.out.println();
		System.out.printf("������ %tY�� %tm�� %td�� �Դϴ�.%n", d,d,d );
		System.out.printf("������ %tH�� %tM�� %tS�� �Դϴ�.%n", d,d,d );
		System.out.printf("������ %1$tH�� %1$tM�� %1$tS�� �Դϴ�.%n", d );
		// �Ű������� ��ġ���� ����.
		// �տ� 1$�� ù��° �Ű������� �ǹ���. ���� ���� ù��° �Ű������� �����.
	}

}