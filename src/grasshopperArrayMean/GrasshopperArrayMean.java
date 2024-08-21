package grasshopperArrayMean;

public class GrasshopperArrayMean {
	public static void main(String[] args) {
		int[] numbers = {4, 8, 2, 6};
		int arrayMean = GrasshopperArrayMean.findAverage(numbers);
		System.out.println(arrayMean);
	}
	
    public static int findAverage(int[] nums) {
    	int length = nums.length;
    	int sum = 0;
    	for(int n : nums)
    		sum = sum + n;
        return sum/length;
    }
}
