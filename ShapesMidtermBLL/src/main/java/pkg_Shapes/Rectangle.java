package pkg_Shapes;

import pkg_HelperShapes.Shape;

/**
 * @author Ian Romano
 *
 */
public class Rectangle extends Shape implements Comparable<Rectangle> {
	/**
	 * iWidth -int representing the rectangle instances width.
	 */
	private int iWidth;
	/**
	 *  iLength -int representing the rectangle instances length.
	 */
	private int iLength;
	/**
	 * Public constructor which takes in ints length and width, and builds
	 * a rectangle based on these parameters.
	 * @param iLength
	 * @param iWidth
	 */
	public Rectangle(int iLength, int iWidth) {
		this.iWidth = iWidth;
		this.iLength = iLength;
	}
	/**
	 * getiWidth -Getter for attribute iWidth
	 * @return iWidth
	 */
	public int getiWidth() {
		return iWidth;
	}
	/**
	 * getiWidth -Setter for attribute iWidth
	 * @param iWidth
	 */
	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}
	/**
	 * getiLength -Getter for attribute iLength
	 * @return iLength
	 */
	public int getiLength() {
		return iLength;
	}
	/**
	 * getiLength -Setter for attribute iLength
	 * @param iLength
	 */
	public void setiLength(int iLength) {
		this.iLength = iLength;
	}
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 * compareTo - compares this instance of rectangle's area with another rectangles area.
	 * returns 1 if this rectangle's area is smaller. returns -1 if it is larger.
	 * returns 0 if they are equal.
	 */
	@Override
	public int compareTo(Rectangle rect) {
		if (this.area() > rect.area()) {
			return 1;
		} else if (this.area() < rect.area()) {
			return -1;
		} else {
			return 0;
		}
	}
	/* (non-Javadoc)
	 * @see pkg_HelperShapes.Shape#area()
	 * area -Returns a double area of the rectangle instance. 
	 * Calculated based off of iLength times iWidth.
	 */
	@Override
	public double area() {
		return (double) iLength * iWidth;
	}
	/* (non-Javadoc)
	 * @see pkg_HelperShapes.Shape#perimeter()
	 * perimeter -Returns a double perimeter of the rectangle instance.
	 * Calculated based off of 2 * iLength + 2 * iWidth.
	 */
	@Override
	public double perimeter() {
		return (double) 2 * iLength + 2 * iWidth;
	}
	
	
	
}
