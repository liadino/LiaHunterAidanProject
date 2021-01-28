import java.util.*;
import java.io.*;


 
  public class student
	   {
	   String firstName;
	   String lastName;
	   String class1;
	   String grade1;
	   String class2;
	   String grade2;
	   String class3;
	   String grade3;
		   
		   student(String fn,  String ln,  String c1,  String g1,  String c2,  String g2,  String c3,  String g3)
		   {
			    firstName = fn;
			    lastName = ln;
			    class1 = c1;
			    grade1 = g1;
			    class2 = c2;
			    grade2 = g2;
			    class3 = c3;
			    grade3 = g3;
		   }
	   
	
 
   
   public static void populateObjs() throws IOException
  	{
	   int counter = 0;
	   //create a new Scanner connected to the data file - file.dat
	   Scanner file = new Scanner( new File( "StudentList.txt" ) );
   	//runs through each line of text 
	
	   while(file.hasNextLine()) 
	   {
		   counter++;
		   
		student student = new student(file.next() , file.next(), file.next() , file.next(), file.next() , file.next(), file.next() , file.next());
	   }
  	}
   
   public static void populateAryList() throws IOException
 	{
	   
 	}
   

}
