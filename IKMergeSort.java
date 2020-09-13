import java.util.Arrays;

public class IKMergeSort {
	public static void main(String [] args) {
		int [] inp = {6,2,4,1,3,5,9,7,8,0};
		mergeSort(inp);
		System.out.println(Arrays.toString(inp));
	}

	private static void mergeSort(int[] inp) {
		mergeSortHelper(inp,0,inp.length-1);
		
	}

	private static void mergeSortHelper(int[] inp, int start, int end) {
		
		//basic validation
		if (start >= end) {
			return;
		}
		int mid = (start + end)/2;

			
			
			mergeSortHelper(inp,start,mid);
			mergeSortHelper(inp,mid+1,end);
			
			int i= start;
			int j = mid+1;
			
			int [] temp = new int [end-start+1];
			int k=0;
			while (i <= mid && j <= end) {
				if (inp[i] < inp[j]) {
					temp[k++] = inp[i++];
				}else {
					temp[k++] = inp[j++];
				}
			}
			while (i <= mid ) {
				temp[k++] = inp[i++];
			}
			while (j <=end) {
				temp[k++] = inp[j++];
			}
			int x=0;
			for ( i=start; i <= end; i++){
				inp[i] = temp[x++];
			}
			
		}
		
	

}
