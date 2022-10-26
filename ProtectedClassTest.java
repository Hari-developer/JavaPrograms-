protected class ProtectedClassTest {
   int i = 10;
   void show() {
      System.out.println("Declare top-level class as protected");
   }
}

public class Test {
   public static void main(String args[]) {
      ProtectedClassTest pc = new ProtectedClassTest();
      System.out.println(pc.i);
      pc.show();
      System.out.println("Main class declaration as public");
   }
}
//we can declare the class as protected,
//it will throw an error says that modifier protected not allowed here.
//So the above code doesn't execute.
//If a top-level class is declared as private the compiler will complain that the modifier private is not allowed here.