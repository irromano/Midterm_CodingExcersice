package pkg_Shapes;

import java.util.Comparator;

/**
 * @author Ian Romano
 *
 */
public class Cuboid extends Rectangle{
	/**
	 * iDepth -int which represents the cuboid's depth.
	 */
	private int iDepth;
	/**
	 * public constructor which takes in ints iLength and iWidth and calls
	 * rectangles constructor, creating a cuboid of these parameters.
	 * @param iLength
	 * @param iWidth
	 */
	public Cuboid(int iLength, int iWidth, int iDepth) {
		super(iLength, iWidth);
		this.iDepth = iDepth;

	}
	
	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}

	/* (non-Javadoc)
	 * @see pkg_Shapes.Rectangle#area()
	 * returns surface area of all sides of cuboid. 
	 */
	@Override
	public double area() {
		return  2 * (super.area()) + 2 * (super.getiLength() * iDepth)
				+ 2 * (super.getiWidth() * iDepth);
	}
	
	/**
	 * volume -Returns a double representing the cuboid instance's volume.
	 * Calculated by multiplying the length/width side of the cuboid with
	 * the cuboid's depth.
	 * @return volume
	 */
	public double volume() {
		return super.area() * iDepth;
	}
	@Override
	public double perimeter() throws UnsupportedOperationException{
		throw new UnsupportedOperationException("Method perimiter is not applicicable for type Cuboid");
	}
	/**
	 * SortByArea -This embedded class implements Comparator to allow lists of Cuboids to be
	 * sorted by surface area in acending order. The constructor does not hava an access modifier as
	 * per the assignments ULM Diagram.
	 * @author Ian Romano
	 *
	 */
	public class SortByArea implements Comparator<Cuboid>{

		SortByArea() {
			
		}
		@Override
		public int compare(Cuboid cub1, Cuboid cub2) {
			if (cub1.area() > cub2.area()) {
				return 1;
			} else if(cub1.area() < cub2.area()) {
				return -1;
			} else {
				return 0;
			}
		}
		
	}
	/**
	 * SortByVolume -This embedded class implements Comparator to allow lists of Cuboids to be
	 * sorted by volume in acending order. The constructor does not hava an access modifier as
	 * per the assignments ULM Diagram.
	 * @author Ian
	 *
	 */
	public class SortByVolume implements Comparator<Cuboid>{

		SortByVolume() {
			
		}
		@Override
		public int compare(Cuboid cub1, Cuboid cub2) {
			if (cub1.volume() > cub2.volume()) {
				return 1;
			} else if(cub1.volume() < cub2.volume()) {
				return -1;
			} else {
				return 0;
			}
		}
		
	}

}
