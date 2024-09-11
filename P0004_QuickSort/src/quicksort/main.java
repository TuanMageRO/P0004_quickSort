/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quicksort;

public class main {
    public static void main(String[] args) {
        solveData sD = new solveData();
        int size = sD.checkInteger("Enter the size of an Integer array: ", 1, 999999);
        int[] arr = new int[size];
        sD.getRandomIntArray(arr);
        sD.displayArray("The generated array size " + size + ": ",arr);
        sD.quickSort(arr, 0, size-1);
        sD.displayArray("The ascendingly sorted array: ", arr);
    }
}
