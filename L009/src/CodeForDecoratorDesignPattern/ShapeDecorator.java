package CodeForDecoratorDesignPattern;

public abstract class ShapeDecorator implements Shape {
	private Shape shape;
	
	public ShapeDecorator(Shape shape) {
		this.shape = shape;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		shape.draw();
	}

}
