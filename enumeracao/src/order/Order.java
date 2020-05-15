package order;
import java.util.Date;
import entities.OrderStatus;

public class Order 
{
	//instancia��o de atributos
	private Integer id;
	private Date moment;
	private OrderStatus status;
	//instancia��o de construtores
	public Order(){
	}
	
	public Order(Integer id, Date moment, OrderStatus status)
	{
		this.id = id;
		this.moment = moment;
		this.status = status;
	}
	//instancia��o de getter s e setters
	public void setId(Integer id)
	{
		this.id = id;
	}
	
	public Integer getId()
	{
		return id;
	}
	
	public void setMoment(Date moment)
	{
		this.moment = moment;
	}
	
	public Date getMoment()
	{
		return moment;
	}
	
	public void setStatus(OrderStatus status)
	{
		this.status = status;
	}
	
	public OrderStatus getStatus()
	{
		return status;
	}
	//instancia��o toString

	public String toString() 
	{
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
	
}
