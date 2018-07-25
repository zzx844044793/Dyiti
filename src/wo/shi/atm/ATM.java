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
		//登录界面		
	public void login() {
	System.out.println("请输入您的账号");
	String b= input.next();
	System.out.println("请输入你的密码");
	int c = input.nextInt();
	for(int i=0;i<a.size();i++) {
		user=a.get(i);
		if(user.getAccount().equals(b)&&user.getPassword()==c) {
			operate();
			break;
		}
		else if(i==a.size()-1){
			System.out.println("输入有误");
		}
	}
/*	if(a.equals(user.getAccount())&&b==user.getPassword()) {
		operate();
	}
	else if(a.equals(user.getAccount())==false) {
		System.out.println("您输入的账户不存在");
	}
	else {
		System.out.println("输入密码有误");
	}*/
}
//操作界面
public void  operate() {
	list:
	while(true) {
		System.out.println("请选择您需要的服务");
		System.out.println("1.查询余额");
		System.out.println("2.存款");
		System.out.println("3.取款");
		System.out.println("4.转账");
		System.out.println("5.更改密码");
		System.out.println("6.其他业务");
		System.out.println("7.退卡");
		int i = input.nextInt();
	switch (i) {
	case 1:
		System.out.println("您的余额为"+user.getBalance());
		continue  list;//第二种方法是可以在调用一次operate方法；
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
		System.out.println("请选择其他业务");
		continue  list;
	case 7:
		System.out.println("退卡成功");
		break      list;
	default:
		System.out.println("请输入正确的服务选项");
		continue  list;
	}
	}
}
//存款方法
public void cun() {
	System.out.println("请输入存款金额");
	double m = input.nextDouble();
	if(m%100==0) {
		double n=user.getBalance()+m;
		System.out.println("存款成功");
	}
	else {
		System.out.println("请存入100块钱的那种钞票");
	}
	
}
//取款方法
public void qu() {
	System.out.println("请输入取款金额");
	int j = input.nextInt();
	if(j>user.getBalance()) {
		System.out.println("请输入正确的取款金额");
	}else if(j%100!=0) {
		System.out.println("请输入100的倍数");
	}else {
		System.out.println("取款成功");
	}
}
//转账方法
public void zhuanzhang() {
	System.out.println("请输入转入账户");
	String zhuanru =input.next();
	for(int i=0;i<a.size();i++) {
		Message user2=a.get(i);
		if(user2.getAccount().equals(zhuanru)) {
			System.out.println("请输入转账金额");
			int j = input.nextInt();
			if(j>user.getBalance()) {
				System.out.println("请输入正确的转账金额");
			}else if(j%100!=0) {
				System.out.println("请输入100的倍数");
			}else {
				System.out.println("转账成功");
				break;
			}
		}
		if(i==a.size()-1){
			System.out.println("输入账户不存在");
		}
	}
}
//改密码
public void gaimima() {
	System.out.println("请输入您原来的密码：");
	int a = input.nextInt();
	if(a==user.getPassword()) {
		System.out.println("请输入您修改后的密码：");
		int b = input.nextInt();
		user.setPassword(b);
		System.out.println("修改成功");
	}
	else {
		System.out.println("输入错误，请重新输入密码");
	}
	
}
}
