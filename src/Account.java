package sec07;

public class Account {
//Field
	private long balance;


	
//Constructor
//Method
	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) {
		if (balance < money) {
			//예외를 발생
			throw new BalanceInsufficientException("잔고가 부족");
		} else {
		balance -= money;
	}
}
