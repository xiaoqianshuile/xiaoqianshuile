package 第八次作业;
import java.util.ArrayList;
import java.util.Date;
public class 十一丶8 {

	public static void main(String[] args) {
		Account a = new Account(1122, 1000, "George");
		a.deposit(1000, "First deposit");
		a.deposit(2000, "Second deposit");
		a.deposit(3000, "Third deposit");
		a.withDraw(1, "First withdraw");
		a.withDraw(2, "Sceond withdraw");
		a.withDraw(3, "Third withdraw");
		System.out.print("name :" + a.getName() + " rate: " + a.getAnnualInterestRate() + " balance: " + a.getBalance() + "\n");
		for (Transaction b : a.transactions) {
			System.out.println("date: " + b.date);
			System.out.println("type: " + b.type);
			System.out.println("amount: " + b.amount);
			System.out.println("new balance: " + b.balance);
			System.out.println("description: " + b.description);
		}
	}
}

class Account {
	private int id;
	private double balance;
	private double Rate;
	private Date dateCreated;
	private String name;
	ArrayList<Transaction> transactions;
	public Account() {
		id = 0;
		balance = 0;
		Rate = 0;
		dateCreated = new Date();
		transactions = new ArrayList<Transaction>();
	}

	public Account(int i, double b) {
		id = i;
		balance = b;
		Rate = 0;
		dateCreated = new Date();
		transactions = new ArrayList<Transaction>();
	}

	public Account(int i, double b, String n) {
		id = i;
		balance = b;
		Rate = 0;
		dateCreated = new Date();
		name = n;
		transactions = new ArrayList<Transaction>();
	}

	public int getId() {
		return id;
	}

	public void setId(int j) {
		id = j;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double j) {
		balance = j;
	}

	public double getAnnualInterestRate() {
		return Rate;
	}

	public void setAnnualInterestRate(double j) {
		Rate = j;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		return Rate / 12;
	}

	public double getMonthlyInterest() {
		return Rate / 12 * balance;
	}

	public void withDraw(double m, String s) {
		balance -= m;
		transactions.add(new Transaction('W', m, balance, s));
	}

	public void deposit(double m, String s) {
		balance += m;
		transactions.add(new Transaction('D', m, balance, s));
	}

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}
}

class Transaction{
	public Date date;
	public char type;
	public double amount;
	public double balance;
	public String description;
	public Transaction(char c, double a, double b, String d) {
		date = new Date();
		type = c;
		amount = a;
		balance = b;
		description = d;
	}
}