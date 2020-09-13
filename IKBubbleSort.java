import java.util.Arrays;

public class IKBubbleSort {
public static void main(String [] args) {
	int [] inp = {4,3,6,2,1,7,0,9,8,5};
	bubbleSort(inp);
	System.out.println(Arrays.toString(inp));
}

private static void bubbleSort(int[] inp) {
	//validation
	if (inp.length <= 0) {
		return;
	}
	for (int i=0; i < inp.length; i++) {
		
		int min = i;
		for (int j= inp.length-1; j>i; j--) {
			if (inp[j] < inp[min]) {
				min = j;
			}
			
		}
		swap(inp,i,min);
	}
	
}

private static void swap(int[] inp, int i, int min) {
	int temp = inp[i];
	inp[i] = inp[min];
	inp[min]=temp;
	
}
}
