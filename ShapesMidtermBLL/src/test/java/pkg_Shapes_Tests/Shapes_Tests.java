package pkg_Shapes_Tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.lang.reflect.*;

import org.junit.Test;

import pkg_Shapes.Cuboid;
import pkg_Shapes.Cuboid.SortByArea;
import pkg_Shapes.Cuboid.SortByVolume;
import pkg_Shapes.Rectangle;

public class Shapes_Tests {

	/**
	 * Rectangle_Test1 -Tests the Rectangle constructor creates an instance of Rectangle.
	 */
	@Test
	public void Rectangle_Test1() {
		Rectangle rect1 = new Rectangle(3, 4);
		assertTrue(rect1 instanceof Rectangle);
	}
	/**
	 * RectanglegetiLength_Test1 -Tests if getiLength returns an int of value 3.
	 */
	@Test
	public void RectanglegetiLength_Test1() {
		Rectangle rect1 = new Rectangle(3, 4);
		assertTrue(rect1.getiLength() == 3);
	}
	/**
	 * RectanglesetiLength_Test1 -Tests if setiLength changes iLength to 5.
	 */
	@Test
	public void RectanglesetiLength_Test1() {
		Rectangle rect1 = new Rectangle(3, 4);
		rect1.setiLength(5);
		assertTrue(rect1.getiLength() == 5);
	}
	/**
	 * RectanglegetiWidth_Test1 -Tests if getiWidth returns an int of value 4.
	 */
	@Test
	public void RectanglegetiWidth_Test1() {
		Rectangle rect1 = new Rectangle(3, 4);
		assertTrue(rect1.getiWidth() == 4);
	}
	/**
	 * RectanglesetiWidth_Test1 -Tests if setiWidth changes iLength to 6.
	 */
	@Test
	public void RectanglesetiWidth_Test1() {
		Rectangle rect1 = new Rectangle(3, 4);
		rect1.setiWidth(6);
		assertTrue(rect1.getiWidth() == 6);
	}
	/**
	 * RectangleArea_Test1 -Tests if area returns a double of value iLength * iWidth.
	 */
	@Test
	public void RectangleArea_Test1() {
		Rectangle rect1 = new Rectangle(3, 4);
		assertTrue(rect1.area() == 12.0);
	}
	/**
	 * RectanglePerimeter_Test1 -Tests if perimeter returns a double of value 2*iLenth + 2*iWidth.
	 */
	@Test
	public void RectanglePerimeter_Test1() {
		Rectangle rect1 = new Rectangle(4, 8);
		assertTrue(rect1.perimeter() == 24.0);
	}
	/**
	 * RectangleCompareTo_Test1 -Tests if the compareTo method is properly overridden
	 *  to sort rectangles by area in ascending order.
	 */
	@Test
	public void RectangleCompareTo_Test1() {
		Rectangle rect1 = new Rectangle(4, 8);
		Rectangle rect2 = new Rectangle(2, 3);
		Rectangle rect3 = new Rectangle(3, 4);
		ArrayList<Rectangle> rectList = new ArrayList<Rectangle>();
		rectList.add(rect1);
		rectList.add(rect2);
		rectList.add(rect3);
		Collections.sort(rectList);
		assertTrue(rectList.get(0).area() == 6);
		assertTrue(rectList.get(1).area() == 12);
		assertTrue(rectList.get(2).area() == 32);
	}
	/**
	 * Cuboid_Test1 -Tests the Cuboid constructor creates an instance of Cuboid.
	 */
	@Test
	public void Cuboid_Test1() {
		Cuboid cub1 = new Cuboid(3, 4, 5);
		assertTrue(cub1 instanceof Cuboid);
	}
	/**
	 * CuboidiLength_Test1 -Tests if getiLength returns an int of value 3.
	 */
	@Test
	public void CuboidiLength_Test1() {
		Cuboid cub1 = new Cuboid(3, 4, 5);
		assertTrue(cub1.getiLength() == 3);
	}
	/**
	 * CuboidsetiLength_Test1 -Tests if setiLength changes iLength from 3 to 2.
	 */
	@Test
	public void CuboidsetiLength_Test1() {
		Cuboid cub1 = new Cuboid(3, 4, 5);
		cub1.setiLength(2);
		assertTrue(cub1.getiLength() == 2);
	}
	/**
	 * CuboidiWidth_Test1 -Tests if getiWidth returns an int of value 4.
	 */
	@Test
	public void CuboidgetiWidth_Test1() {
		Cuboid cub1 = new Cuboid(3, 4, 5);
		assertTrue(cub1.getiWidth() == 4);
	}
	/**
	 * CuboidsetiWidth_Test1 -Tests if setiWidth changes iLength from 4 to 2.
	 */
	@Test
	public void CuboidsetiWidth_Test1() {
		Cuboid cub1 = new Cuboid(3, 4, 5);
		cub1.setiWidth(2);
		assertTrue(cub1.getiWidth() == 2);
	}
	/**
	 * CuboidiDepth_Test1 -Tests if getiDepth returns an int of value 5.
	 */
	@Test
	public void CuboidgetiDepth_Test1() {
		Cuboid cub1 = new Cuboid(3, 4, 5);
		assertTrue(cub1.getiDepth() == 5);
	}
	/**
	 * CuboidsetiDepth_Test1 -Tests if setiDepth changes iLength from 5 to 6.
	 */
	@Test
	public void CuboidsetiDepth_Test1() {
		Cuboid cub1 = new Cuboid(3, 4, 5);
		cub1.setiDepth(6);
		assertTrue(cub1.getiDepth() == 6);
	}
	/**
	 * CuboidArea_Test1 -Tests if area returns a double of value 
	 * 		super.area()*2 + (iLength * iDepth)*2 + (iWidth * iDepth)*2
	 */
	@Test
	public void CuboidArea_Test1() {
		Cuboid cub1 = new Cuboid(3, 4, 5);
		assertTrue(cub1.area() == 94.0);
	}
	/**
	 * CuboidPerimeter_Test1 -Tests that ensures that calling perimeter for an instance Cuboid
	 * throws an exception.
	 * @throws UnsupportedOperationException
	 */
	@Test
	public void CuboidPerimeter_Test1() {
		boolean thrownE = false;
		try {
			Cuboid cub1 = new Cuboid(3, 4, 5);
			cub1.perimeter();
		} catch(UnsupportedOperationException unsupportedOperationException) {
			thrownE = true;
		}
		assertTrue(thrownE);
	}
	/**
	 * CuboidVolume_Test1 -Tests that volume returns the double value iLength * iWidth * iDepth.
	 */
	@Test
	public void CuboidVolume_Test1() {
		Cuboid cub1 = new Cuboid(3, 4, 5);
		assertTrue(cub1.volume() == 60.0);
	}
	/**
	 * CuboidCompareTo_Test1 -Tests to ensure the comparators SortByArea and SortByVolume can be 
	 * used to sort Cuboids by area in ascending order and volume in ascending order. Reflections
	 * is used to call the default constructors of SortByArea and SortByVolume.
	 */
	@Test
	public void CuboidCompareTo_Test1() {
		Cuboid cubCompare = new Cuboid(0, 0, 0);
		Cuboid cub1 = new Cuboid(3, 4, 5);
		Cuboid cub2 = new Cuboid(4, 5, 6);
		Cuboid cub3 = new Cuboid(1, 3, 12);
		ArrayList<Cuboid> cubList1 = new ArrayList<Cuboid>();
		cubList1.add(cub1);
		cubList1.add(cub2);
		cubList1.add(cub3);
		SortByArea sortByArea;
		try {
			Class<?> clsSortbyarea = Class.forName("pkg_Shapes.Cuboid$SortByArea");
			Constructor<?> constrSortbyarea = clsSortbyarea.getDeclaredConstructor(new Class[] {Cuboid.class});
			constrSortbyarea.setAccessible(true);
			sortByArea = (SortByArea) constrSortbyarea.newInstance(cubCompare);
			Collections.sort(cubList1, sortByArea);
			assertTrue(cubList1.get(0).area() == 94.0);
			assertTrue(cubList1.get(1).area() == 102.0);
			assertTrue(cubList1.get(2).area() == 148.0);
		} catch (NoSuchMethodException | SecurityException e) {

			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}  catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		SortByVolume sortByVolume;
		try {
			Class<?> clsSortbyvolume = Class.forName("pkg_Shapes.Cuboid$SortByVolume");
			Constructor<?> constrSortbyvolume = clsSortbyvolume.getDeclaredConstructor(new Class[] {Cuboid.class});
			constrSortbyvolume.setAccessible(true);
			sortByVolume = (SortByVolume) constrSortbyvolume.newInstance(cubCompare);
			Collections.sort(cubList1, sortByVolume);
			assertTrue(cubList1.get(0).volume() == 36.0);
			assertTrue(cubList1.get(1).volume() == 60.0);
			assertTrue(cubList1.get(2).volume() == 120.0);
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}  catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
	/**
	 * CuboidCompareTo_Test2 -Tests if the compareTo method properly sorts
	 *  Cuboids by surface area in ascending order.
	 */
	@Test
	public void CuboidCompareTo_Test2() {
		Cuboid cub1 = new Cuboid(3, 4, 5);
		Cuboid cub2 = new Cuboid(4, 5, 6);
		Cuboid cub3 = new Cuboid(1, 3, 12);
		ArrayList<Cuboid> cubList1 = new ArrayList<Cuboid>();
		cubList1.add(cub1);
		cubList1.add(cub2);
		cubList1.add(cub3);
		Collections.sort(cubList1);
		assertTrue(cubList1.get(0).area() == 94.0);
		assertTrue(cubList1.get(1).area() == 102.0);
		assertTrue(cubList1.get(2).area() == 148.0);

	}

}
