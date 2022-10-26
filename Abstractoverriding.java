
abstract class MyClass {
   public static  abstract void display();
}
public class Abstractoverriding extends  MyClass
{
   public void display() {
      System.out.println("This is the subclass implementation of the display method ");
   }
   public static void main(String args[]) {
	   MyClass n=new Abstractoverriding();
	   
	   n.display();
    //  new Abstractoverriding().display();
	   
   }
}


//If you declare a method in a class abstract to use it, you must override this method in the subclass.
//But, overriding is not possible with static methods. Therefore, an abstract method cannot be static.

