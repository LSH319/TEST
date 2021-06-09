package LSH_Edu;

import java.util.Arrays;

class BankAccount{
	String Name;
	String Account;
	String[][] Log = {{"개설","0","0"}};
	int balance = 0;
	
	public void deposit(int amount) {
		this.balance = this.balance + amount;
		inputlog("입금",amount);
	}
	public void withdraw(int amount) {
		if(this.balance < amount) {
			System.out.println("출금액은 잔액을 넘길 수 없습니다.");
		}
		else {
			this.balance = this.balance - amount;
			inputlog("출금",amount);
		}
	}
	public void inputlog(String input,int amount) {
		String[][] newLog = Arrays.copyOf(this.Log, (this.Log.length) + 1);
		newLog[this.Log.length][0] = input;
		newLog[this.Log.length][1] = Integer.toString(amount);
		newLog[this.Log.length][2] = Integer.toString(this.balance);
		this.Log = newLog.clone();
	}
}

public class BankManager {

}
