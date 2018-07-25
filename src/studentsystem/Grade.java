package studentsystem;

public class Grade extends Student{
		private int yuwen;
		private int shuxue;
		private int yingyu;
		private int zhuanyeke;
		
		
		public Grade() {
			super();
		}

		public Grade(String name,int num,int password,int yuwen, int shuxue, int yingyu, int zhuanyeke) {
			super();
			super.setName(name);
			super.setNum(num);
			super.setPassword(password);
			this.yuwen = yuwen;
			this.shuxue = shuxue;
			this.yingyu = yingyu;
			this.zhuanyeke = zhuanyeke;
		}

		public int getYuwen() {
			return yuwen;
		}

		public void setYuwen(int yuwen) {
			this.yuwen = yuwen;
		}

		public int getShuxue() {
			return shuxue;
		}

		public void setShuxue(int shuxue) {
			this.shuxue = shuxue;
		}

		public int getYingyu() {
			return yingyu;
		}

		public void setYingyu(int yingyu) {
			this.yingyu = yingyu;
		}

		public int getZhuanyeke() {
			return zhuanyeke;
		}

		public void setZhuanyeke(int zhuanyeke) {
			this.zhuanyeke = zhuanyeke;
		}

		public void aver() {
			System.out.println(super.getName()+"的平均成绩是"+(yuwen+shuxue+yingyu+zhuanyeke)/4);
		}
}
