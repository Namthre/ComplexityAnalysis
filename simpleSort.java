// Class:   Discrete Struct Comp
// Name:	   Chase Neely    
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class simpleSort
{
   static int bs = 0;
   static int is = 0;
   static int ss = 0;
   
   public static void main (String [] Args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("Amount of values in array: ");
      int num = scan.nextInt();
      System.out.print("Highest value in the array: ");
      int high = scan.nextInt();
            
      /////////////////////////////////////////////// 
      double bstotal = 0; 
      System.out.println("\nBubble Sorted values: ");
      int [] arr2 = bsArray(num,high);
      for (int x=0; x<1000; x++){
         arr2 = bsArray(num,high);
         long startTimeBS = System.currentTimeMillis();   
         bubbleSort(arr2);
         long endTimeBS = System.currentTimeMillis();
         long durationBS = (endTimeBS - startTimeBS);
         bstotal = bstotal + durationBS;
         }
      for(int i=0; i<arr2.length; i++){
         System.out.print(arr2[i] + "  ");
      }
      double bsavg = bstotal/1000;
      System.out.println();
      System.out.print("Bubble Sort Swaps: " + bs);
      System.out.println();
      System.out.print("Duration of Bubble Sort: " + bsavg + " nanoseconds");
      
      /////////////////////////////////////////////////
      double istotal = 0; 
      System.out.println("\nInsertion Sorted values: ");
      int [] arr3 = isArray(num,high);
      for (int x=0; x<1000; x++){
         arr3 = isArray(num,high);
         long startTimeIS = System.nanoTime();   
         insertSort(arr3);
         long endTimeIS = System.nanoTime();
         long durationIS = (endTimeIS - startTimeIS);
         istotal = istotal + durationIS;
         }
      for(int i=0; i<arr3.length; i++){
         System.out.print(arr3[i] + "  ");
      }
      double isavg = istotal/1000;
      System.out.println();
      System.out.print("Insertion Sort Swaps: " + is);
      System.out.println();
      System.out.print("Duration of Insertion Sort: " + isavg + " nanoseconds");
      
      /////////////////////////////////////////////////
      double sstotal = 0; 
      System.out.println("\nSelection Sorted values: ");
      int [] arr4 = ssArray(num,high);
      for (int x=0; x<1000; x++){
         arr4 = bsArray(num,high);
         long startTimeSS = System.nanoTime();   
         selectionSort(arr4);
         long endTimeSS = System.nanoTime();
         long durationSS = (endTimeSS - startTimeSS);
         sstotal = sstotal + durationSS;
         }
      for(int i=0; i<arr4.length; i++){
         System.out.print(arr4[i] + "  ");
      }
      double ssavg = sstotal/1000;
      System.out.println();
      System.out.print("Selection Sort Swaps: " + ss);
      System.out.println();
      System.out.print("Duration of Selection Sort: " + ssavg + " nanoseconds");
   }
   
   public static int [] bsArray(int num, int high)
   {
      int[] arr = new int[num];
        
      for (int i=0; i<arr.length; i++){
         arr[i] = (int)(Math.random() * high);
      }
      return arr;
   }
   
   public static int [] isArray(int num, int high)
   {
      int[] arr = new int[num];
        
      for (int i=0; i<arr.length; i++){
         arr[i] = (int)(Math.random() * high);
      }
      return arr;
   }      
   
   public static int [] ssArray(int num, int high)
   {
      int[] arr = new int[num];
        
      for (int i=0; i<arr.length; i++){
         arr[i] = (int)(Math.random() * high);
      }
      return arr;
   }
   
   public static void bubbleSort(int[] arr2)
   {
      for (int i=0; i<arr2.length-1; i++){
         for (int j = i+1; j<arr2.length; j++){
            if (arr2[j] < arr2[i]){
               int temp = arr2[j];
               arr2[j] = arr2[i];
               arr2[i] = temp;
               bs++;
            }
         }
      }
   }
   
   public static void insertSort(int[] arr3)
   {
      for (int i=1; i<arr3.length; i++){
         int key = arr3[i];
         int p = i;
         
         while (p>0 && key<arr3[p-1]){
            arr3[p] = arr3[p-1];
            p--;
            is++;
         }
         arr3[p] = key;
      }
   }
   
   public static void selectionSort(int arr4[])
   { 
      for (int i=0; i<arr4.length-1; i++){
         int minPos = i;
         for (int j=i+1; j<arr4.length; j++){
            if (arr4[j] < arr4[minPos])
               minPos = j;
         }
         if (i != minPos && minPos < arr4.length){
            int temp = arr4[minPos];
            arr4[minPos] = arr4[i];
            arr4[i] = temp;
            ss++;
         }
      } 
   }
}