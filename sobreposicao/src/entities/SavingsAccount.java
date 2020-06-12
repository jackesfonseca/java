package entities;

//final => impede que a classe seja herdada
public final class SavingsAccount extends Account
{
	private double interestRate;
	
	public SavingsAccount()
	{
		
	}
	
	public SavingsAccount(Integer number, String holder, double balance, double interestRate)
	{
		super(number, holder, balance);
		this.interestRate = interestRate;
	}
	
	public double getInterestRate()
	{
		return interestRate;
	}
	
	public void updateBalance(double amount)
	{
		balance += amount;
	}
	
	/**
	"@Override" => nota��o que indica sobreposi��o
	final => impede que o m�todo seja sobreposto
	*/
	@Override
	public final void withdrow(double amount)
	{
		balance -= amount;
	}
}
