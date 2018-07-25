package wo.shi.atm;

public class Message {
		private String account;
		private int password;
		private double balance;
		public Message(String account, int password, double balance) {
			super();
			this.account = account;
			this.password = password;
			this.balance = balance;
		}
		public String getAccount() {
			return account;
		}
		public void setAccount(String account) {
			this.account = account;
		}
		public int getPassword() {
			return password;
		}
		public void setPassword(int password) {
			this.password = password;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public Message(String account) {
			super();
			this.account = account;
		}
		
		
}
