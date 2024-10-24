package Services;

import java.util.List;

import MODEL.Student_pojo;

public interface Service_interface 
{
	public boolean isAddStudent(Student_pojo st);
	public void viewData();
	public boolean SearchName(Student_pojo st);
	public boolean DeleteId(Student_pojo st);
	public boolean isUpdate(Student_pojo stud);
}
