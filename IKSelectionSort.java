import java.util.Arrays;

public class IKSelectionSort {
	public static void main(String [] args) {
		int inp [] = {5,2,6,1,4,3,9,7,8,0};
		selectionSort(inp);
		System.out.println(Arrays.toString(inp));
	}

	private static void selectionSort(int[] inp) {
	
		if (inp.length <=0 ) {
			return;
		}
		//sorting
		for (int i=0; i<inp.length;i++) {
			for (int j=i+1; j< inp.length; j++) {
				if (inp[j] < inp[i] ) {
					swap(inp,i,j);
				}
			}
		}
	}

	private static void swap(int[] inp, int i, int j) {
		int temp = inp[i];
		inp[i] = inp[j];
		inp[j] = temp;
		
	}

}
