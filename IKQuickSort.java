import java.util.Arrays;
import java.util.Random;

public class IKQuickSort {
	public static void main(String [] args) {
		int [] inp = {4,2,3,1,6,7,5,0,8,9};
		quickSort(inp);
		System.out.println(Arrays.toString(inp));
	}

	private static void quickSort(int[] inp) {
		//basic validation
		quickSortHelper(inp,0,inp.length-1);
		
	}

	private static void quickSortHelper(int[] inp, int start, int end) {
		if (start >= end) {
			return;
		}

		int pivot = inp[start];
		int smaller = start;
		int bigger = start ;
		
		for (bigger = start+1; bigger <= end; bigger++ ) {
			
			if (inp[bigger] < pivot) {
				smaller++;
				swap(inp, smaller,bigger);
				
			}
		}
		swap(inp, start,smaller);
		quickSortHelper(inp,start,smaller-1);
		quickSortHelper(inp,smaller+1,end);
		
	}

	private static void swap(int[] inp, int start, int temp) {
		int tempnum = inp[start];
		inp[start] = inp[temp];
		inp[temp] = tempnum;
		
	}

}
