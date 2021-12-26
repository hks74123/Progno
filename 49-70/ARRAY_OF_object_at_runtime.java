package customArrayList; 
public class Student 
{ 
// Create instance variables name, id, and rollNo of data type String, int, and int respectively. 
   String name; 
   int id; 
   int rollNo; 

// Create three parameters constructor with parameters name, id, and rollNo. 
   Student(String name, int id, int rollNo)
   { 
     this.name = name; 
     this.rollNo = rollNo; 
     this.id = id; 
   } 
}
package customArrayList; 
import java.util.ArrayList;  
public class ARRAY_OF_object_at_runtime
{ 
// Create a ArrayList method of generic type 'Student'. 
   ArrayList<Student> studentData()
   { 
// Create three objects of the class Student and pass arguments to the constructor. 
    Student s1 = new Student("Deep", 1234, 04); 
    Student s2 = new Student("Shubh", 4321, 20 ); 
    Student s3 = new Student("Riddhi", 1212, 02); 

// Create the object of ArrayList of generic type 'Student'. 
    ArrayList<Student> studentlist = new ArrayList<Student>(); 

// Now add Student objects in the ArrayList using reference variable studentlist. 
     studentlist.add(s1); 
     studentlist.add(s2); 
     studentlist.add(s3); 

// Return object reference variable 'studentlist' of the array list to the method 'studentValue'. 
     return studentlist; 
   } 
}
 