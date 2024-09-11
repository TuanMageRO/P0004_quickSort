
package quicksort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class solveData {
    Scanner sc = new Scanner(System.in);
    
    public int checkInteger(String mess, int min, int max) {
        int n;
        String err = "Only integer in range " + min + " to " + max ;
        while(true) {
            System.out.println(mess);
            try{
                n = Integer.parseInt(sc.nextLine());
                if( n < min || n > max) {
                    System.out.println(err);
                    continue;
                }
                return n;
            } 
            catch(NumberFormatException e) {
                System.out.println(err);
            }
        }
    }
    
    public void getRandomIntArray (int[] arr) {
        Random rand = new Random();
        int n = arr.length;
        for(int i = 0; i < n; ++i) {
            arr[i] = rand.nextInt(n);
        }
    }
    
    public void displayArray ( String mess, int[] arr) {       
        int n = arr.length;
        System.out.println(mess);
        System.out.print("[ ");
        for(int i = 0; i < n-1; ++i) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[n-1] + " ]\n");

    }
    
    public int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        int count = 0;
        int i = left;
        int j = right;
        
        for(int x = left+1; x <= right; x++) {
            if(arr[x] <= pivot) count++;
        }
        
        int pivotIndex = left + count;
        int tmp = arr[pivotIndex];
        arr[pivotIndex] = arr[left];
        arr[left] = tmp;
        
        while(i < pivotIndex && j > pivotIndex) {
            while(arr[i] <= pivot) {
                i++;
            }
            while(arr[j] > pivot) {
                j--;
            }
            if(i < pivotIndex && j > pivotIndex) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                j--;
                i++;
            }
        }
        return pivotIndex;
    }
    
    public void quickSort (int arr[], int l, int r) {
        if(l >= r) return;
        int p = partition(arr, l, r);
        quickSort(arr, l, p-1);
        quickSort(arr, p+1, r);
    }
}
