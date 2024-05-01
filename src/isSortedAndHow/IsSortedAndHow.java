//Complete the method which accepts an array of integers, and returns one of the following:
//    "yes, ascending" - if the numbers in the array are sorted in an ascending order
//    "yes, descending" - if the numbers in the array are sorted in a descending order
//    "no" - otherwise
//You can assume the array will always be valid, and there will always be one correct answer.

package isSortedAndHow;

public class IsSortedAndHow {
	public static void main(String[] args) {
		int[] numbers = { 5 };
		String result = IsSortedAndHow.isSortedAndHow(numbers);
		System.out.println(result);
	}

	public static String isSortedAndHow(int[] array) {
		if(array.length == 0||array.length == 1) return "no";
		boolean isDescending = true;
		boolean isAscending = true;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i + 1] > array[i]) {
				isDescending = false;
			}
			if (array[i + 1] < array[i]) {
				isAscending = false;
			}

		}
		if (isAscending == true) {
			return "yes, ascending";
		}
		if (isDescending == true) {
			return "yes, descending";
		}

		return "no";
	}
}
//Lösung von Codewars mit Listen
//public static String isSortedAndHow(int[] array) {
//    List<Integer> dupe = new ArrayList<Integer>();
//    for (var x : array){
//      dupe.add(x);
//    }
//    Collections.sort(dupe);
//    int[] arr = dupe.stream().mapToInt(i -> i).toArray();
//    if (Arrays.equals(arr,array)){
//      return "yes, ascending";
//    }
//    Collections.reverse(dupe);
//    int[] revarr = dupe.stream().mapToInt(i -> i).toArray();
//    if (Arrays.equals(array, revarr)){
//      return "yes, descending";
//    }
//    return "no";
//  }