## How to create your own exception class ?
Create a new class whose name should end with Exception like ClassNameException.
This is a convention to differentiate an exception class from regular ones.
Make the class extends one of the exceptions which are subtypes of the java.lang.Exception class.
Generally, a custom exception class always extends directly from the Exception class.
Create a constructor with a String parameter which is the detail message of the exception.
In this constructor, simply call the super constructor and pass the message.

example:

public class StudentNotFoundException extends Exception </br>{
 
    public StudentNotFoundException(String message) { </br>
        super(message); </br>
    } </br>
} </br>
And the following example shows the way a custom exception is used is nothing different than built-in exception: </br>

public class StudentManager { </br>
 
    public Student find(String studentID) throws StudentNotFoundException { </br>
        if (studentID.equals("123456")) { </br>
            return new Student(); </br>
        } else { </br>
            throw new StudentNotFoundException( </br>
                "Could not find student with ID " + studentID); </br>
        } </br>
    }
} </br>
And the following test program handles that exception: </br>

public class StudentTest { </br>
    public static void main(String[] args) { </br>
        StudentManager manager = new StudentManager(); </br>
 
        try { </br>
 
            Student student = manager.find("0000001"); </br>
 
        } catch (StudentNotFoundException ex) { </br>
            System.err.print(ex);
        } </br>
    } </br>
}
 </br>

