import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Result {             // class result
	
	private int id;                    //all private variable declaration  
	private String name;
	private String course;
	private int markssub1;
	private int markssub2;
	
		 Result(int id)             // custructor for generate ID automatic
	{
		this.id=id;
		
	}
	 public void setdetail(String name,String course,int msub1,int msub2)  // setdata for a student
	 {
		 this.name=name;
		 this.course=course;
		 this.markssub1=msub1;
		 this.markssub2=msub2;
		 
	 }
	 public float percalc(int msub1,int msub2)  //calculate percentage
	 {
		return (msub1+msub2)/2;
	 }
	 public void getdetial()  //print data
	 {
	System.out.println("Student ID = "+id );
	System.out.println("Name = "+ name);
	System.out.println("Cource = "+course);
	System.out.println("Subject 1 = "+ markssub1);
	System.out.println("Subject 2 = "+markssub2);
	System.out.println("Percenateg = " + percalc(markssub1,markssub2));
	
	
	 }
	 public static void main(String args[]) throws  IOException
	 {
		 BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
		 System.out.print("Enter no. of Student for you want to use");
		 int no =Integer.parseInt(br.readLine());   //no of student want to generate data
		 int i ;
		 String name;
		 String course;
		 int marks1;
		 int marks2;
		 Result stddata[] =  new Result[no+1]; //declaration object arrey
		 
		 
				 
		 for (i=1;i<=no;i++)
		 {
			 System.out.print("Student ID: "+i);
			 System.out.print("Enter Name: ");		
			 name = br.readLine();
					 System.out.print("\n");
			 System.out.print("Enter Cource ");
			 course = br.readLine();
					 System.out.print("\n");
			 System.out.print("Enter Marks of sub 1: ");
			 marks1 =Integer.parseInt(br.readLine());
					 System.out.print("\n");
			 System.out.print("Enter marks of sub 2 ");
			 marks2 =Integer.parseInt(br.readLine());
					 System.out.print("\n");
			
			
			 stddata[i]=new Result(i);          // Initialize  array
			stddata[i].setdetail(name,course,marks1,marks2);
		
		 }
		 for(i=1;i<=no;i++)
		 {
			
			stddata[i].getdetial();  // print array
		
		 }
		 
	 }
}
