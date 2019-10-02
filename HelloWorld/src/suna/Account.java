package suna;

public class Account {
	long deposit;
	
public void deposit(int deposit) {
	this.deposit += deposit ;
	
}
public long getBalance() {
	return deposit;
}

public void withdraw(int money) throws BaException{
	if(deposit<money) {
		throw new BaException("잔고부족: "+(money-balance)+"모자람");
	}
}
}
