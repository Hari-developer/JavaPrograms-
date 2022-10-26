
public class twomainmethod {

	public static void main(String[] args) {
		
System.out.println("default main");//Yes, we can overload the main method of Java. But JVM will only call the default main method only.
	}
public static void main(String args[])
{
	System.out.println("Scond main");
}
}
