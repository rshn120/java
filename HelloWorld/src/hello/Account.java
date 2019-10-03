package hello;

public class Account {
	private String owner;
	private String ano;
	private int balance;
	static final int Min_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;

	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	public Account() {	}

	
	public String getOwner() {return owner;}
	public void setOwner(String owner) {this.owner = owner;}
	public String getAno() {return ano;}
	public void setAno(String ano) {this.ano = ano;}
	public int getBalance() {return balance;}
	public void setBalance(int balance) {
//		if(balance >= Min_BALANCE && balance<=MAX_BALANCE) {
//			this.balance=balance;
//			}
		this.balance+=balance;
	}
	
}