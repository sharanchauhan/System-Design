package CodeForSingletonDesignPattern;

public class Singleton {
	private static Singleton inst;
	
	private Singleton() {
	}
	
	public static Singleton getTheSingleInstance() {
		if(inst == null) {
//			synchronized is being used here to handle multi-threaded operations
//			once a thread enter synchronized, another thread cannot enter the synchronized block till the first thread exits the block
			synchronized (Singleton.class) {
				if(inst == null) {
					inst = new Singleton();
				}
			}
		}
		
		return inst;
	}
}