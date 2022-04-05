/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class LinearSearch {
    
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        // Todo 01: - complete the implementation of linear search and test your code  
         //         - prvoide asymptotic analysis of the developed solution
         for(int i = 0; i < n; i++)
         {
             if(arr[i] == x)
                 return i;
         }
         return -1;
         
         //f(n) = 1 + n + n + 1 + 1 -> 2n + 3
         //f(n) <= g(n)
         //2n+3 <= 10n
         //upper bound of n
         //2n+3 >= 5n
         // lower bound of n
         //tight bound 
         // c1 <= 2n+3 <= c2
         //theta(n)
    }
    
    public static void main(String[] args) {
        int[] arr = {6,12,56,87,33,2};
        int key = 87;
        int result = search(arr,key);
        if(result == -1)
            System.out.println("key not found.");
        else {
            System.out.println("key at this index: " + result);
        }
        
    }
}
