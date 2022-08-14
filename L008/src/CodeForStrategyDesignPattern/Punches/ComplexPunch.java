package CodeForStrategyDesignPattern.Punches;

public class ComplexPunch implements IPunchingBehaviour{
	public ComplexPunch next;
	@Override
	public void punch() {
		// TODO Auto-generated method stub
		System.out.println("Hits with a jab");
		next.punch();
	}

}
