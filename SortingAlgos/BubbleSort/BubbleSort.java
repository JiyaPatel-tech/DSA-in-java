package BubbleSort;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String args[])
	{
		int[] arr = {72,23,45,67,12};
		bubble(arr);
		System.out.println(Arrays.toString(arr));
		
	}
    static void bubble(int[] arr)
    {
    	for(int i = 0;i<arr.length;i++)
    	{
    		Boolean swapped = false;
    		for(int j=1;j<arr.length-i;j++)
    		{
    			if(arr[j]<arr[j-1])
    			{
    				int temp = arr[j];
    				arr[j] = arr[j-1];
    				arr[j-1] = temp;
    				swapped = true;
    			}
    		}
    		if(!swapped)
    		{
    			break;
    		}
    	}
    }
    
}
