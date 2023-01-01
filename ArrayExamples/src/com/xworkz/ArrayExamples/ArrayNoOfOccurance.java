package com.xworkz.ArrayExamples;

public class ArrayNoOfOccurance {

	  public static void main(String[] args) {
		    int[] arr = {1, 2, 3, 1, 2, 3, 3};  
		    int element = 1;
		    int element1 = 2;
		    int element2 = 3;
		    int count = 0; 
		    int count1 = 0;
		    int count2 = 0;
		    for (int i = 0; i < arr.length; i++) {
		      if (arr[i] == element) {
		        count++;
		      }
		      if (arr[i] == element1) {
			        count1++;
			      }
		      if (arr[i] == element2) {
			        count2++;
			      }
		    }

	
		    System.out.println("Number of occurrences of " + element + ": " + count);
		    System.out.println("Number of occurrences of " + element1 + ": " + count1);
		    System.out.println("Number of occurrences of " + element2+ ": " + count2);
			  
	  }
		}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//	public static void main(String[] args) {
//		int[] arr = {1, 2, 3, 1, 2, 3, 3};
//		int element = 3;
//		int element1 =2;
//		int element2 =1;
//		int count=1;
//		int count1=1;
//		int count2=1;
//		// element to find the number of occurrences for
//	//	int count = 0;  // variable to store the count
//
//		for (int i = 0; i < arr.length; i++) {
//		  if (arr[i] == element) {
//		    count++;
//     if(arr[i] == element1)
//     {
//    	 count1++;
//     if(arr[i] == element2)
//     {
//    	 count2++;
//     }
//     
//		  }
//		
//     System.out.println("Number of occurrences of " + element + ": " + count);
//     System.out.println("Number of occurrences of " + element1 + ": " + count1);
//	 
//     System.out.println("Number of occurrences of " + element2 + ": " + count2);
//		  }
//
//
//		}
//	}
//}
//		//		 for(int i=0;i<arr.length;i++) {
////			 int count =1;
////			 for(int j=i+1;j<arr.length;j++) {
////				 if(arr[i]==arr[j]) {
////					++count;
////				 }
////				 
////				 
////			 }
////			 System.out.println(count +"           "+"main");
////			 
////			 
////			 
////		 }
////}
////}
////		int [] a = {10,20,30,10,50,60,70,20};
////for(int i=0;i<a.length;++i)
////{
////
////	int x=a[i];
////	int count=0;
////	if(x==-1)continue;
////	for(int j=0;j<a.length;++j)
////	{
////		if(a[j]==x)
////		{
////			++count;
////			a[j]=-1;
////		}
////	}
////System.out.println(count);
////}
////
////}
////}
//
//	
//		
//		
//		