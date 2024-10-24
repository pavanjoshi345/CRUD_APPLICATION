package Client_app;
import java.util.*;
import MODEL.Student_pojo;
import Services.Service_IMP;
public class Client_application
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int id,fees;
		String name;
		float per;
		Vector v=new Vector();
		 Service_IMP serv=new Service_IMP();
		
		int choice;
		do
		{
		  System.out.println("Enter the your choice");
		  System.out.println("1: Add New Student");
		  System.out.println("2: View All Students");
		  System.out.println("3: Search Student By Name");
		  System.out.println("4: Delete Student By ID");
		  System.out.println("5: Update Student By Name");
		  choice=sc.nextInt();
		  switch(choice)
		  {
		  case 1:
			  Student_pojo sp=new Student_pojo();
			  System.out.println("Enter the ID name, fees and percentage of Student");
		      id=sc.nextInt();
		      name=sc.next();
		      fees=sc.nextInt();
		      per=sc.nextFloat();
		      sp.setId(id);
		      sp.setName(name);
		      sp.setFees(fees);
		      sp.setPer(per);
		      boolean bcd=serv.isAddStudent(sp);
		      if(bcd)
		      {
		    	  System.out.println("New Student Added Successfully...");
		      }
		      else
		      {
		    	  System.out.println("Student Not Added...");
		      }
		      break;
		  case 2:
	         serv.viewData();
			  break;
		  case 3:
			 Student_pojo sp1=new Student_pojo();
		      boolean bb=serv.SearchName(sp1);
		      if(bb)
		      {
		    	  System.out.println(" Found...");
		      }
		      else
		      {
		    	  System.out.println("Not Found...");
		      }
		     break;
		  case 4:
			  Student_pojo sp11=new Student_pojo();
			  boolean bc=serv.DeleteId(sp11);
			  if(bc)
			  {
				  System.out.println("Student ID deleted Successfully...");
			  }
			  else
			  {
				  System.out.println("Student ID not Found....");
			  }
			  break;
		  case 5:
			  Student_pojo st=new Student_pojo();
			  boolean bl=serv.isUpdate(st);
			  if(bl)
			  {
				  System.out.println("Data Updated Successfully....");
			  }
			  else
			  {
				  System.out.println("Not Updated...");
			  }
			  break;
		  }
		}while(true);
		
	}

}
