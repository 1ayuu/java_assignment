

example:
interface hello1 </br>
{ 
    void m1();</br> 
} </br>
  
interface hello2</br>
{ 
    void m2(); </br>
} 
  
// class implements both interfaces 
// and provides implementation to the method. 
class sample implements hello1,hello2</br>
{ </br>
    
    public void m1() </br>
    { 
        System.out.println("Welcome: inside the method m1"); 
    } </br>
  
   
    public void m2() </br>
    { 
        System.out.println("Welcome: inside the method m2"); </br>
    } 
} 
  
class hellodemo
{ 
    public static void main (String[] args) 
    { 
        sample ob1 = new sample(); 
  
        // calling the method implemented 
        // within the class. 
        ob1.m1(); 
        ob1.m2(); 
    } 
} 
