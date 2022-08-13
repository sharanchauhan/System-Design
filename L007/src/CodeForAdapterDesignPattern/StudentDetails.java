package CodeForAdapterDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class StudentDetails {
	public List<String> GetStudents(){
		List<String> emps = new ArrayList<>();
		
		emps.add("1-ABC-9999786543");
		emps.add("2-DEF-9876523456");
		emps.add("3-GHI-9321499876");
		emps.add("4-JKL-9985432121");
		emps.add("5-MNO-9211345667");
		emps.add("5-MNO-9211345627");
		emps.add("5-MNO-9211233667");
		emps.add("5-MNO-9211323663");
		
		return emps;
	}
}