package in.ineuron.dao;

import in.ineuron.pojo.Student;

public interface IStudentDao
{
	public abstract Integer save(Student student); // INSERT new student record

	public abstract Student findById(Integer sid); // select one student details and display to end user

	public abstract String updateById(Student student); // Update existing students details

	public abstract String deleteById(Student student); // delete existing student details
}
