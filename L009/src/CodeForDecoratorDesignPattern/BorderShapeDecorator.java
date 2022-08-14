package CodeForDecoratorDesignPattern;

public class BorderShapeDecorator extends ShapeDecorator {

	public BorderShapeDecorator(Shape shape) {
		super(shape);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void draw() {
		System.out.print(" With border ");
		super.draw();
	}
	
}
