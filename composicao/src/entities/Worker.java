package entities;

import entities.enums.WorkerLevel;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;

public class Worker 
{
	private String name;
	private double baseSalary;
	private Department department;//tipo enumerado
	
	//composi��o de classes
	private WorkerLevel level;
	//como ser� utilizado v�rios contaratos o mesmo n�o ser� incluso no construtor sendo necess�rio instanci�-lo de forma tradicional
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {
	}
	
	public Worker(String name, WorkerLevel level, double baseSalary, Department department)
	{
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setBaseSalary(double baseSalary)
	{
		this.baseSalary = baseSalary;
	}
	
	public double getBaseSalary()
	{
		return baseSalary;
	}
	
	public void setDepartment(Department department)
	{
		this.department = department;
	}
	
	public Department getDepartment()
	{
		return department;
	}
	//*esse metodo n�o pder� ser implementado pois o contrato ser� instanciado como lista vazia e depois poser� ser adicionado ou removido um contrato por meio de m�todos espec�ficos 
	/*
	/*public void setContracts(List<HourContract> contracts)
	/*{
	/*	this.contracts = contracts;
	/*}
	*/
	
	public List<HourContract> getContract()
	{
		return contracts;
	}
	
	public void addContract(HourContract contract)
	{
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract)
	{
		contracts.remove(contract);
	}
	
	public double income(int year, int month)
	{
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for(HourContract c : contracts)
	{
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if(year == c_year &&  month == c_month)
			{
				sum += c.totalValue();
			}
		}
		return sum;
	}
}
