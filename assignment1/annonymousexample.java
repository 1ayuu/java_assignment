example:

class Person</br>
{</br>
    String name;               </br>
    public Person(String name) </br>
    {</br>
        this.name = name;</br>
    }</br>
}
public class ArrayMethod3</br> 
{</br>
    public static void main(String[] args)</br>
    {</br>
        Person p1 = new Person("Kumar");</br>
        Person p2 = new Person("Dev");</br>
        method(new Person[] {p1, p2});</br>
    }</br>
     
    public static void method(Person[] array)</br>
    {</br>
        //use Person[] array here</br>           
    }</br>
}
