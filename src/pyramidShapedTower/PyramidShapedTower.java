package pyramidShapedTower;

import java.util.Arrays;

public class PyramidShapedTower {
	public static void main(String[] args) {
		String[] printPyramid = PyramidShapedTower.towerBuilder(3);
		System.out.println(Arrays.toString(printPyramid));
		
	}
	  public static String[] towerBuilder(int nFloors) {
		  int lengthLastLine = nFloors*2-1;
		  String[] pyramid = new String[nFloors];
		  for(int i = 0; i < nFloors; i++) {
			  pyramid[i] = " ".repeat((lengthLastLine-1)/2-i) + "*".repeat(1+i*2) + " ".repeat((lengthLastLine-1)/2-i);
		  }

	    return pyramid;
	  }
}
