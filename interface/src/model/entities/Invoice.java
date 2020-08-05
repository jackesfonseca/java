package model.entities;

public class Invoice 
{
	//est� sendo usado o wrapper class (tipo classe) para caso haja integra��o com o banco de dados e estes campos possam aceitar valor nulo ao contr�rio do tipo primitivo
	private Double basicPayment;
	private Double tax;
	
	public Invoice() {
	}
	
	public Invoice(Double basicPayment, Double tax) 
	{
		this.basicPayment = basicPayment;
		this.tax = tax;
	}
	
	public Double getBasicPayment()
	{
		return basicPayment;
	}
	
	public void setBasicPayment(Double basicPayment)
	{
		this.basicPayment = basicPayment;
	}
	
	public Double getTax()
	{
		return tax;
	}
	
	public void setTax(Double tax)
	{
		this.tax = tax;
	}
	
	public Double getTotalPayment()
	{
		return getBasicPayment() + getTax();
	}
}
