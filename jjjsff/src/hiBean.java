import java.util.HashMap;

public class hiBean
{
	String name = "vireshdevthakurab";
	String rollno = "2154";
	String job="engg";
	String Fname = "Mr";
	String pname = "efce";
	String gname = "automate";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public HashMap<Integer,String> coffee = new HashMap<Integer,String>();
	
	public HashMap<Integer,String> getCoffee()
	{
		coffee.put(123, "Cappiccuno");
		coffee.put(456,"ice tea");
		coffee.put(789, "green tea");
		System.out.println("check the credit score");
		System.out.println("this will be second coffee check");
		System.out.println("this will be second tea check");
		System.out.println("the new changes at 1222");
		System.out.println("some value");
		System.out.println("some value change for newmaster");
		System.out.println("some value second change for newmaster");
		System.out.println("some value three change for newmaster");
		System.out.println("for master");
		return coffee;
	}
	
	public void takeOff()
	{
		System.out.println("This is the check out");
	}
	
	public void madeIt()
	{
		System.out.println("you have made it");
	}
	
}