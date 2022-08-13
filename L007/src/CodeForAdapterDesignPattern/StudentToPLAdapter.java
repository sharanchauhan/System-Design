package CodeForAdapterDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class StudentToPLAdapter implements IPhoneListSource{
	private StudentDetails empDS;
	
	public StudentToPLAdapter(StudentDetails ds) {
		this.empDS = ds;
	}
	
	@Override
	public List<String> GetPhoneNumbers() {
		List<String> emps = this.empDS.GetStudents();
		List<String> phones = new ArrayList<>();
		
		for(String emp: emps) {
			String[] parts = emp.split("-");
			String phone = parts[2];
			phones.add(phone);
		}
		
		return phones;
	}

}