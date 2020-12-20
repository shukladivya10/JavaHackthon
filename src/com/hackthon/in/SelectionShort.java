package com.hackthon.in;

public class SelectionShort {
		// TODO Auto-generated method stub
int len = arr.lenth:
	for(int i=0; i<len-1;i++) {
		int min =i
				for(int j = i+1; j < len; j++)
					if(arr [j] < arr[min])
						min=j;
		//swapping 
		int temp = arr[min];
		arr[min]= arr[i];
		arr[i]=temp;
		 
		void printArr(intarr[]) {
		
			for (inti=0; i<arr.lenth;i++)
				System.out.println(arr[i]+" ");
			System.out.println();
		}
		public static void main(String[] args) {
			 SelectionShort obj = new SelectionShort();
		        int numarr[] = {1,5,7,3,2,9,10,15};
		        
		        System.out.print("Original array: ");
		        obj.printArr();
		       
		      
		}
	}

       
 
    
 