package studentsystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Systemjiemian {
		private static ArrayList<Grade> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		static {
			list.add(new Grade("����",1,2,3,4,5,6));
			list.add(new Grade("����",1,2,3,4,5,6));
			list.add(new Grade("����",1,2,3,4,5,6));
			list.add(new Grade("����",1,2,3,4,5,6));
			list.add(new Grade("����",1,2,3,4,5,6));
			list.add(new Grade("�ܰ�",1,2,3,4,5,6));
			list.add(new Grade("���",1,2,3,4,5,6));
		}
		public void login() {
			System.out.println("������ѧ��");
			int stunum=input.nextInt();
			System.out.println("����������");
			int psword = input.nextInt();
			list1:
			for(int i=0;i<list.size();i++) {
			Grade grade=list.get(i);
			if(grade.getNum()==stunum&&grade.getPassword()==psword) {
				list:
				while(true) {
				Random rand = new Random();
				String yanzheng = "abcdefghijklmnopqrstuvwxyz";
				char[] jieshou=yanzheng.toCharArray();
				char a=jieshou[rand.nextInt(26)];
				char b=jieshou[rand.nextInt(26)];
				char c=jieshou[rand.nextInt(26)];
				char d=jieshou[rand.nextInt(26)];
				System.out.println(""+a+""+b+""+c+""+d);
				System.out.println("�������������֤��");
				String e = input.next();
				if(e.equals(""+a+""+b+""+c+""+d)) {
					System.out.println("��½�ɹ�");
					jiemian();
					break list;
				}
				else {
					System.out.println("��¼ʧ�ܣ�������������֤��");
					continue list;
				}
				}
			}
			
			if(i==list.size()-1) {
				System.out.println("���뿨�ź���������");
			}
			}
		}
	public void jiemian() {
		System.out.println("��ӭ����ѧ������ϵͳ");
		System.out.println("��ѡ������Ҫ�ķ���");
		System.out.println("1.��ѯ�ɼ�");
		switch (input.nextInt()) {
		case 1:
			jiemian();
			break;

		default:
			break;
		}
	}
	public void inquire() {
		
	}
}
