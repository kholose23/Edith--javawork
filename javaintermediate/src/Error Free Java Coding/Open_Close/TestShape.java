package Open_Close;

public class TestShape {
	public static void main(String[]args) {
		Circle C=new Circle ();
		C.setRadius (23.00);
		Rectangle r=new Rectangle();
		r.setLength(10.00);
		r.setWidth(20);
		
		AreaCalculator ac=new AreaCalculator();
		System.out.println(ac.calculateShapeArea(r));
		System.out.println(ac.calculateShapeArea(r));
		
			}
	

}
