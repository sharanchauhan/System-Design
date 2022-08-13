package CodeForAdapterDesignPattern;

import java.util.List;

// Data consumer
public class Intranet {
	IPhoneListSource source; // Loosely coupled, any adapter which implements IPhoneListSource interface can be stored in this reference
	
	public Intranet(IPhoneListSource source) {
		this.source = source;
	}
	
	public void printPhoneNumbers() {
		List<String> phones = this.source.GetPhoneNumbers();
		System.out.println(phones);
	}
}