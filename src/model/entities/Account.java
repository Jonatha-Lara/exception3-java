package model.entities;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance, Double withdraw) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdraw;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdraw() {
		return withdrawLimit;
	}
	
	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(double amount) {
		balance += withdrawLimit + amount;
	}
	
	public void withdraw(double amount) {
		if (amount > withdrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		if (amount > balance) {
			throw new DomainException("Not enough balance");
		}
		balance -= amount;
	}
	
}
