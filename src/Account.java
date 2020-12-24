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
			//���ܸ� �߻�
			throw new BalanceInsufficientException("�ܰ� ����");
		} else {
		balance -= money;
	}
}
