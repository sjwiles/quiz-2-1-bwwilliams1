package shapes;

public class Square extends Shape {
	private double side;

	/*
	 * Complete the implementation of this class by finishing the constructor
	 * below.  Squares cannot have a negative side length.
	 */
	public Square(double side) throws IllegalArgumentException{
		if(side<0){
			throw new IllegalArgumentException("Side can not be negative");
		}
		this.side=side;
	}
	
	/*
	 * Implement any remaining methods demanded by the superclass.
	 */

	
	public double calculateArea(){
		return this.getSide()*this.getSide();
}
	
	
	
	
	public double getSide() {
		return side;
	}
}
