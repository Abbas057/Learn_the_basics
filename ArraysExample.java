package java_basics;

import java.util.Scanner;

import java.util.Arrays;

public class ArraysExample {

	// 1. print an array
	static void printAnArray() {
		int[] arr = {1,2,3,4,5};
		for(int n : arr) {
			System.out.print(n+" ");
		}
	}
	// 2. Find the Largest Element

	public int LargestElement(int[] arr) {
		
		int max = arr[0];
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		

		return max;
	}
	
	// 3. Search element
	
	static int searchElement(int s) {
		
		int[] as = {23,45,25,34};
		
		
		boolean found = false;
		
		for(int i=0;i<as.length;i++) {
			
			if(as[i] == s) {
				found=true;
				break;
			}
			
		}
		
		if(found)
		System.out.println(s+" is exists in array");
		else
			System.out.println(s+" is not found in array");	
		
		return s;
		
	}
	
	// 4. Method to remove duplicates
    public static int[] removeDuplicates(int[] arr) {
        Arrays.sort(arr); // Sort array
        int n = arr.length;

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1]; // last element

        // Create final array with correct size
        return Arrays.copyOf(temp, j);
    }
    
    // 5. Merge two arrays

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];

        // Copy arr1
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }

        // Copy arr2
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }

        Arrays.sort(merged); // Optional: sort merged array
        return merged;
    }


	

	public static void main(String[] args) {

		// 1. print an array
		printAnArray();
		
		// 2. Find the Largest Element
		int[] ar = {12,34,57,18,17};
		
		Arrays_example obj = new Arrays_example();
		int largest = obj.LargestElement(ar);
		System.out.println();
		System.out.println("Largest element: " + largest);
		
		// 3.Search element
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to Search: ");
	//	int search = scanner.nextInt();
	//	searchElement(search);
		
		//4. Remove duplicate
		
		int[] arr = {1, 2, 2, 3, 4, 4, 5};

        int[] result = removeDuplicates(arr);

        System.out.print("Array after removing duplicates: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
       // 5.Merge arrays
        
        
        
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        int[] results = mergeArrays(arr1, arr2);

        System.out.print("Merged array: ");
        for (int num : results) {
            System.out.print(num + " ");
        }
		
		

	}

}

