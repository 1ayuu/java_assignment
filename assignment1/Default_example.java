example
:
interface TestInterface  </br>
{ </br>
    // abstract method  </br>
    public void square(int a);  </br>
  
    // default method  </br>
    default void show()  </br>
    { 
      System.out.println("Default Method Executed");  </br>
    } 
} 
  
class TestClass implements TestInterface  </br>
{ 
    // implementation of square abstract method  </br>
    public void square(int a) 
    {  </br>
        System.out.println(a*a);  </br>
    } 
  
    public static void main(String args[])  </br>
    { 
        TestClass d = new TestClass();  </br>
        d.square(4);  </br>
  
        // default method executed  </br>
        d.show();  </br>
    } 
} 
 </br>

