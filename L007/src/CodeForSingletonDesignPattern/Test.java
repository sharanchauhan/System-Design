package CodeForSingletonDesignPattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton s1 = Singleton.getTheSingleInstance();
//		Now when we are calling through s2 then it will not be null therefore it will return the same object as s1
		Singleton s2 = Singleton.getTheSingleInstance();
		
		System.out.println(s1 == s2);
	}

}