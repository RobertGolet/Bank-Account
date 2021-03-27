public class Account{
	
	private int balance;
	
	public Account(int bal){
		this.balance = bal;
	}
	
	public int getBalance(){
		return balance;
	}
	public void addFunds(int funds){
		balance += funds;
	}
	public boolean withdraw(int sum){
		if(sum <= balance){
			balance -=sum;
			return true;
		}else{
			return false;
		}
	}
}
