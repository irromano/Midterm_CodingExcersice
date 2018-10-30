package pkg_HelperShapes;

/**
 * @author Ian Romano
 *
 */
public abstract class Shape {
	
	/**
	 * Shape no-argument constructor for abstract class shape
	 * 
	 * 
	 */
	public Shape() {
	}
	
	
	/**
	 * calculates the area of the shape. Calculation varies depending on the subclass.
	 * 
	 * @return double representing the area of the shape
	 */
	public abstract double area();
	
	/**
	 * calculates the perimeter length of the shape. Calculation varies depending on the subclass.
	 * @return double representing the perimeter length of the shape
	 */
	public abstract double perimeter();

}
