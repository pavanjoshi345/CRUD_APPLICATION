package Services;

import java.util.*;

import MODEL.Student_pojo;
public class Service_IMP  implements Service_interface
{
	Vector v=new Vector();
	Scanner sc=new Scanner(System.in);
	@Override
	public boolean isAddStudent(Student_pojo st) 
	{
	    v.add(st);
//	    System.out.println(v.size());
	    if(v.size()>0)
	    {
	     return true;
	    }
	    else
	    {
	    	return false;
	    }
	}

	@Override
	public void viewData() 
	{
		System.out.println("----------------------------------------------------------------");
	    for(Object obj:v)
	    {
	    	Student_pojo spojo=(Student_pojo)obj;
	    	System.out.println(spojo.getId()+"\t\t"+spojo.getName()+"\t\t"+spojo.getFees()+"\t\t"+spojo.getPer());
	    }
	   	System.out.println("----------------------------------------------------------------");
	}

	@Override
	public boolean SearchName(Student_pojo st) 
	{	
		int flag=0;
		 System.out.println("Enter the name of student");
	     String sname=sc.next();
	        for(Object obj:v)
		    {
		    	Student_pojo spojo=(Student_pojo)obj;
		    	if(sname.equals(spojo.getName()))
		    	{
		    		flag=1;
		    		break;
		    	}
		    }
		if(flag==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public boolean DeleteId(Student_pojo st)
	{	
		int flag=0;
	    System.out.println("Enter the index of student");
	    int did=sc.nextInt();
	    for(Object obj:v)
	    {
	    	Student_pojo spj=(Student_pojo)obj;
	    	if(spj.getId()==did)
	    	{
	    		v.remove(did);
	    		flag=1;
	    		break;
	    	}
	    }
	    if(flag==1)
	    {
	    	return true;
	    }
	    else
	    {
	    	return false;
	    }
		
	}

	@Override
	public boolean isUpdate(Student_pojo stud)
	{
		int flag=0;
       System.out.println("Enter the student ID and new Per");
       int uid=sc.nextInt();
       float nper=sc.nextFloat();
       for(Object obj:v)
       {
    	   Student_pojo studp=(Student_pojo)obj;
    	   int index=v.indexOf(studp.getId());
    	  // System.out.println("index"+(index+1));
    	   uid=uid-1;
    	 //  System.out.println("uid"+uid);
    	   if(index==uid)
    	   {
    		    v.set(uid-1,nper);
    		    flag=1;
    		    break;
    	   }
       }
       if(flag==1)
       {
    	   return true;
       }
       else
       {
    	   return false;
       }
	}
	
}
