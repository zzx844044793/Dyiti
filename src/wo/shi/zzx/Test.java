package wo.shi.zzx;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		String c="dsda";
		System.out.println(c.intern());
		/*Father a=new Father();
		a.setName("adsa");
		gai(a);
		System.out.println(a.getName());*/
	}
	public static void gai(Father b) {
		b.setName("ddd");
	}

}
