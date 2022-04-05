/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */


public class Problem01 {

static int count = 2;

    public static long getSumOfPrimes(int n){
    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time  
        if(count <= n)
        {
        if(n % count == 0)
        {
            count++;
            return getSumOfPrimes(n-1);
        }
        
        return n + getSumOfPrimes(n-1);
        }
        return 0;
    }
    
    public static void main(String[] args) {
        int sumOfPrimes = (int)getSumOfPrimes(11);
        System.out.println("sum:" + sumOfPrimes);
    }
}
