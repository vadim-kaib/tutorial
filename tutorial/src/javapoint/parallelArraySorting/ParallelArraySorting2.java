package javapoint.parallelArraySorting;

import java.util.Arrays;
import java.util.Optional;
import java.util.StringJoiner;

public class ParallelArraySorting2 {

	public void Test() {
        // Creating an integer array   
        int[] arr = {5,8,1,0,6,9,50,-3};  
        // Iterating array elements  
        for (int i : arr) {  
            System.out.print(i+" ");  
        }  
        // Sorting array elements parallel and passing start, end index  
        Arrays.parallelSort(arr,0,4);  
        System.out.println("\nArray elements after sorting");  
        // Iterating array elements  
        for (int i : arr) {  
            System.out.print(i+" ");  
        }  
	}
}
