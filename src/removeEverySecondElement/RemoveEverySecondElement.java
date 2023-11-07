//Take an array and remove every second element from the array. Always keep the first element and start removing with the next element.
//None of the arrays will be empty, so you don't have to worry about that!

package removeEverySecondElement;

import java.util.Arrays;

public class RemoveEverySecondElement {
	public static void main(String[] args) {
		Object[] keepRemove = {"Keep", "Remove", "Keep", "Remove", "Keep"};
		Object[] withoutSecond = RemoveEverySecondElement.removeEveryOther(keepRemove);
		System.out.println(Arrays.toString(withoutSecond));
		
	}
	  public static Object[] removeEveryOther(Object[] arr) {
		  int length = arr.length % 2 == 0 ?arr.length/2 : arr.length/2+1;
		  Object[] newObject = new Object[length];
		  for(int i = 0, j = 0; i < arr.length; i+=2, j++) {
			  newObject[j] = arr[i];
		  }
		  return newObject;
		  }
}
