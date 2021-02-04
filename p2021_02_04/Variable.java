package p2021_02_04;

import java.util.ArrayList;
import java.util.List;

public class Variable {

	public static void main(String[] args) {
		
		// ���� : �޸� �� �����͸� �����ϱ� ���� ��� ����
		// ������ ����� ���� : �ڷ��� ������ = ������(��);
		// ���������� ���ÿ����� ����
		
		// �⺻ �ڷ���			
		// 1. ������ ����
			byte b1 = 10;		//	-128 ~ 127
			short s = 100;		//	-32768 ~ 32767
			int i = 1000;		//	�� -21�� ~ 21��
			long l = 10000;		//	-
			
			System.out.println("b1= " + b1);
			System.out.println("s= " + s);
			System.out.println("i= " + i);
			System.out.println("l= " + l);

		// 2. �Ǽ��� ����
			float ft1 = 3.14f;		//	float���� f�� �ٿ��� �Ѵ�. (��ҹ��� ��� X) , �Ҽ����� ������� �������� ������.
			double d = 42.195;		//	�Ҽ��� 16�ڸ����� ��������
			
			System.out.println("ft1: " + ft1);
			System.out.println("d: " + d);
			System.out.printf("%.1f\n" , d);		//	�Ҽ��� ù���ڸ����� ���
			System.out.printf("%.2f\n" , d);		//	�Ҽ��� �Ѥ��ڸ����� ���
			
		// 3. ������ ����
			char c1 = 'A';
			char c2 = '��';
			
			System.out.println("c1= " + c1);
			System.out.println("c2= " + c2);
			
		// 4. ���� ����
			boolean bn1 = true;
			boolean bn2 = false;
			System.out.println("bn1: " + bn1);
			System.out.println("bn2: " + bn2);
			
		// ������ : �迭, Ŭ����, �������̽�(Collection) >>  �������� �� �޸𸮿��� ������ ����
			
		// 5. ������ ���� : �迭 - ������ �ڷ����� �����͸� �����ϴ� ������ �ڷᱸ��
			
		// for(�ʱⰪ; ���ǽ�; ������)
			int[] score = {80, 90, 100};
			for(int j=0; j<score.length; j++) {
				System.out.print(score[j]+ "\t");
			}
			System.out.println();
		// 6. ������ ���� : Ŭ����
			String s1 = "�ڹ�";
			String s2 = new String("�ڹ�");
			System.out.println("s1= " + s1);
			System.out.println("s2= " + s2);
			
			if( s1==s2) { // �ּҰ� ��
				System.out.println("���� �ּ�");
			} else { 
				System.out.println("�ٸ� �ּ�");
			}
			
			if(s1.equals(s2)) { // ������ �� ��
				System.out.println("���� ��");
			} else {
				System.out.println("�ٸ� ��");
			}
			
			
		// 7. ������ ���� : �������̽�(List)
		//	1) �������� �ڷ� 
		//	2) �������� �ڷ����� �����͸� ��� ������ �� �ִ�.
		//	3) �������� ������ ũ�⸦ �ø� �� �ִ�.
			
		//	List list = new List();		(X)		<< �������̽��� ��ü������ ��ü ���� �Ұ�
		//	https://docs.oracle.com/javase/8/docs/api/ 8������ �� ���� ���Ƽ� �̿�.	
			
			List list = new ArrayList();		// �� ��ȯ (��ĳ����) ���ʰ� �������� �ٸ�.
			
//			ArrayList li = new ArrayList();
			list.add(30);
			list.add(3.14);
			list.add('j');
			list.add(true);
			list.add("�ڹ�");
			System.out.println(list);
			System.out.println(list.get(1));
			
			for(int k=0; k<list.size(); k++) {
				System.out.print(list.get(k) + "\t");		//	\t  : ���򰣰� ������ (tapŰ ����ŭ)
			}
			
			
	}

}
