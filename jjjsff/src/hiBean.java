import java.util.HashMap;

public class hiBean
{
	String name = "vireshdevthakurabcdefg641132132165421354sdwfefzzzzzzzz16161316461";

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
		return coffee;
	}
	
	
}