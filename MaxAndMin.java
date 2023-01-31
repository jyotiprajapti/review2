package com.inter;

public class MaxAndMin {
	public static void main(String[] args) {
		int [] array = {1,2,3,9,4,7};
		int min = array[0];
		int max = array[0];
		 for(int i = 1; i < array.length; i++) {
	            if(array[i] > max)
	                max = array[i];
	            else if (array[i] < min)
	                min = array[i];
	                
	        }
	        
	        System.out.println("Largest Number : " + max);
	        System.out.println("Smallest Number : " + min);
		
		}
		
	}


