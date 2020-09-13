import java.util.Arrays;

public class IKInsertionSort {
	public static void main(String [] args) {
		int [] inp = {0,6,3,4,8,7,1,2,5,9};
		insertionSort(inp);
		System.out.println(Arrays.toString(inp));
	}

	private static void insertionSort(int[] inp) {
		
		//basic validation
		if (inp.length <=0) {
			return;
		} else {
			int i=0;
			int j =0;
			for ( i=1; i<inp.length; i++) {
				int ith = inp[i];
				for ( j= i-1; j>=0 && inp [j] > ith; j--) {
					inp[j+1] = inp[j];
					}
				inp[j+1] = ith;
			}
		}
		
	}

}
