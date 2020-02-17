
## Nested Interfaces
An interface i.e. declared within another interface or class is known as nested interface.
The nested interfaces are used to group related interfaces so that they can be easy to maintain. 
The nested interface must be referred by the outer interface or class. It can't be accessed directly.
**Nested interface must be public if it is declared inside the interface but it can have any access modifier if declared within the 
class.Nested interfaces are declared static implicitely.**
Syntax of nested interface which is declared within the interface:</br>
interface interface_name{ </br> 
 ...  
 interface nested_interface_name{  </br>
  ...  
 }  
}   
Syntax of nested interface which is declared within the class:
class class_name{ </br> 
 ...  
 interface nested_interface_name{ </br> 
  ...  
 }  
}   </br>
 this example, to learn how to declare the nested interface and how we can access it.
interface Showable{  
  void show();  
  interface Message{  
   void msg();  
  }  
}  
class TestNestedInterface1 implements Showable.Message{  
 public void msg(){System.out.println("Hello nested interface");}  
  
 public static void main(String args[]){  
  Showable.Message message=new TestNestedInterface1();//upcasting here  
  message.msg();  
 }  
}  
