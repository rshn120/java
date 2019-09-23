package hello;

public class Account {
	private String owner;
	private String ano;
	private int balance;

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
		this.balance += balance;}
	
}