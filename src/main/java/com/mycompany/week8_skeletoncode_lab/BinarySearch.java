/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
    //ToDo 2: Call the above method and test the algorithm  
    // provide time and space analysis 
    public static void main(String[] args) {
        int[] test = {2,5,6,11,23,44,56,91,99};
        int key = 11;
        int size = test.length;
        
        int indexOfKey = runBinarySearchIteratively(test,key,0,size); 
        if(indexOfKey == -1)
            System.out.println("could not find specified key in array.");
        else 
            System.out.println("Key element found at index: " + indexOfKey); 
   }
}
