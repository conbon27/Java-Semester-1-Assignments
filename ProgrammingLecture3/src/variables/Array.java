package variables;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums; // declare array variable
		
		// create an int array and assign it to the int[] variable nums
		nums = new int[7];
		
		nums[0] = 6;
		nums[1] = 19;
		nums[2] = 44;
		nums[3] = 42;
		nums[4] = 10;
		nums[5] = 20;
		nums[6] = 1;
		
		for(int i=0; i< nums.length; i++){
			System.out.println("nums[" + i + "] = " + nums [i]);
		} // end loop
	} // end method

} // end class
