/*
 * Bob needs a fast way to calculate the volume of a cuboid with three values: the length, width and height of the cuboid. 
 * Write a function to help Bob with this calculation.
 */


package kataGetVolumeOfCuboid;

public class KataGetVolumeOfCuboid {
	public static void main(String[] args) {
		double length = 4; 
		double width = 4;
		double height = 4;
		double volume = KataGetVolumeOfCuboid.getVolumeOfCuboid(length, width, height);
		System.out.println(volume);
		
	}
	  public static double getVolumeOfCuboid(final double length, final double width, final double height) {
		  double volumeOfCuboid = length * width * height;
		  return volumeOfCuboid;
		  }
}
