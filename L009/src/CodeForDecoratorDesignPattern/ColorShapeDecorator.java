package CodeForDecoratorDesignPattern;

public class ColorShapeDecorator extends ShapeDecorator {

	public ColorShapeDecorator(Shape shape) {
		super(shape);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void draw() {
		System.out.print(" With color ");
		super.draw();
	}

}
