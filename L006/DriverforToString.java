import PracticeOnObject.Car;
import java.util.*;

public class DriverforToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car("A", 100, 200);
		// Car c1 = null;
		System.out.println(c);
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("India", 140);
		map.put("China", 145);
		map.put("USA", 30);
		
		
		System.out.println(map);
	}

}