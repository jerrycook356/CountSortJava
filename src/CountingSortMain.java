
public class CountingSortMain {

	public static void main(String[] args) {
		int[] intArray= {2,5,9,8,2,8,7,10,4,3};
		
		countSort(intArray);
		System.out.println("\n\n\nSorted Array");
		print(intArray);

	}
	public static void countSort(int[] input) {
		
		int[] countArray = new int[10];
		//set all elements in count array to 0
		for(int i = 0; i < countArray.length;i++) {
			countArray[i] = 0;
		}
		
		//count the number of each number appearing in input
		//increment the corresponding index in countArray
		for(int i = 0;i < input.length;i++)
		{
			int tempNum = input[i];
			countArray[tempNum-1]++ ;
		}

		int num = 0; //hold the index for inputArray
		
		for(int i = 0; i < countArray.length;i++)
		{
			if(countArray[i] != 0) {
				//add the specified number the correct amount of times.
				for(int j = 0; j< countArray[i];j++) {
					input[num] = i +1;
					num++;
				}
			}
		}
		
		
	}
	public static void print(int[] input) {
		for(int i = 0;i < input.length;i++) {
			System.out.println(input[i]);
		}
	}

}
