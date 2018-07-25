package studentsystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Systemjiemian {
		private static ArrayList<Grade> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		static {
			list.add(new Grade("张三",1,2,3,4,5,6));
			list.add(new Grade("李四",1,2,3,4,5,6));
			list.add(new Grade("王五",1,2,3,4,5,6));
			list.add(new Grade("赵六",1,2,3,4,5,6));
			list.add(new Grade("孙七",1,2,3,4,5,6));
			list.add(new Grade("周八",1,2,3,4,5,6));
			list.add(new Grade("吴九",1,2,3,4,5,6));
		}
		public void login() {
			System.out.println("请输入学号");
			int stunum=input.nextInt();
			System.out.println("请输入密码");
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
				System.out.println("请输入上面的验证码");
				String e = input.next();
				if(e.equals(""+a+""+b+""+c+""+d)) {
					System.out.println("登陆成功");
					jiemian();
					break list;
				}
				else {
					System.out.println("登录失败，请重新输入验证码");
					continue list;
				}
				}
			}
			
			if(i==list.size()-1) {
				System.out.println("输入卡号和密码有误");
			}
			}
		}
	public void jiemian() {
		System.out.println("欢迎来到学生教务系统");
		System.out.println("请选择你需要的服务");
		System.out.println("1.查询成绩");
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
