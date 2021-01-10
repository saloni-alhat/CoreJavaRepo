package sat.defaultExample;

public interface AirLines {

	public abstract void reservation();
	default void airLine()
	{
		System.out.println("****AIRLINES****");
		System.out.println("Welcome to AIRLINES.. Have a Safe Journey!");
		
	}
}
