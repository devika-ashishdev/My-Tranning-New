package InterfaceExample;

public interface Bike1 {
	void run();
	default void msg()
	{
		System.out.println("Default method");
	}

}
