package wo.shi.atm;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
//		private Message user=new Message("00", 123123, 1000000);
		Scanner input = new Scanner(System.in);	
//		private Message user2=new Message("11");
		public static ArrayList<Message> a = new ArrayList<>();
		private Message user;
		static {
			a.add(new Message("00",11,1000));
			a.add(new Message("11",11,1000));
			a.add(new Message("22",11,1000));
			a.add(new Message("33",11,1000));
			a.add(new Message("44",11,1000));
		}
		//��¼����		
	public void login() {
	System.out.println("�����������˺�");
	String b= input.next();
	System.out.println("�������������");
	int c = input.nextInt();
	for(int i=0;i<a.size();i++) {
		user=a.get(i);
		if(user.getAccount().equals(b)&&user.getPassword()==c) {
			operate();
			break;
		}
		else if(i==a.size()-1){
			System.out.println("��������");
		}
	}
/*	if(a.equals(user.getAccount())&&b==user.getPassword()) {
		operate();
	}
	else if(a.equals(user.getAccount())==false) {
		System.out.println("��������˻�������");
	}
	else {
		System.out.println("������������");
	}*/
}
//��������
public void  operate() {
	list:
	while(true) {
		System.out.println("��ѡ������Ҫ�ķ���");
		System.out.println("1.��ѯ���");
		System.out.println("2.���");
		System.out.println("3.ȡ��");
		System.out.println("4.ת��");
		System.out.println("5.��������");
		System.out.println("6.����ҵ��");
		System.out.println("7.�˿�");
		int i = input.nextInt();
	switch (i) {
	case 1:
		System.out.println("�������Ϊ"+user.getBalance());
		continue  list;//�ڶ��ַ����ǿ����ڵ���һ��operate������
	case 2:
		cun();
		continue  list;
	case 3:
		qu();
		continue  list;
	case 4:
		zhuanzhang();
		continue  list;
	case 5:
		gaimima();
		continue  list;
	case 6:
		System.out.println("��ѡ������ҵ��");
		continue  list;
	case 7:
		System.out.println("�˿��ɹ�");
		break      list;
	default:
		System.out.println("��������ȷ�ķ���ѡ��");
		continue  list;
	}
	}
}
//����
public void cun() {
	System.out.println("����������");
	double m = input.nextDouble();
	if(m%100==0) {
		double n=user.getBalance()+m;
		System.out.println("���ɹ�");
	}
	else {
		System.out.println("�����100��Ǯ�����ֳ�Ʊ");
	}
	
}
//ȡ���
public void qu() {
	System.out.println("������ȡ����");
	int j = input.nextInt();
	if(j>user.getBalance()) {
		System.out.println("��������ȷ��ȡ����");
	}else if(j%100!=0) {
		System.out.println("������100�ı���");
	}else {
		System.out.println("ȡ��ɹ�");
	}
}
//ת�˷���
public void zhuanzhang() {
	System.out.println("������ת���˻�");
	String zhuanru =input.next();
	for(int i=0;i<a.size();i++) {
		Message user2=a.get(i);
		if(user2.getAccount().equals(zhuanru)) {
			System.out.println("������ת�˽��");
			int j = input.nextInt();
			if(j>user.getBalance()) {
				System.out.println("��������ȷ��ת�˽��");
			}else if(j%100!=0) {
				System.out.println("������100�ı���");
			}else {
				System.out.println("ת�˳ɹ�");
				break;
			}
		}
		if(i==a.size()-1){
			System.out.println("�����˻�������");
		}
	}
}
//������
public void gaimima() {
	System.out.println("��������ԭ�������룺");
	int a = input.nextInt();
	if(a==user.getPassword()) {
		System.out.println("���������޸ĺ�����룺");
		int b = input.nextInt();
		user.setPassword(b);
		System.out.println("�޸ĳɹ�");
	}
	else {
		System.out.println("���������������������");
	}
	
}
}
