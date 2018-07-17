
public class Shape {
	double area;
	
	public double calculateArea(Circle c) {
		area = Math.PI * c.radius * c.radius;
		return area;	
	}
	
	public double calculateArea(Triangle t) {
		area = 0.5 * t.base * t.height;
		return area;	
	}
	
	public double calculateArea(Square s) {
		area = Math.pow(s.side, 2);
		return area;	
	}
	
	public static void main(String[] args) {
		Shape sp = new Shape();
		Circle c = new Circle(3);
		Triangle t = new Triangle(20, 30);
		Square s = new Square(4);
		System.out.println(sp.calculateArea(c));
		System.out.println(sp.calculateArea(t));
		System.out.println(sp.calculateArea(s));
	}
}
