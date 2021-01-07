/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Arrays;

/**
 *
 * @author Tobsi
 */
public class Sorter
{

    // ---- Konstruktør
    public Sorter()
    {
        
    }
    
    //  ---- Metoder
    public int[] BubbleFrontTBack(int[] ArrayToBeSorted){ // [0,1,2,3] starter ved 3 og slutter ved 0
        int[] SortedArray = new int[ArrayToBeSorted.length];
        SortedArray = ArrayToBeSorted;
        
        // System.out.println("\nStart array: " + Arrays.toString(ArrayToBeSorted));
        // System.out.print("Længte er på: " + ArrayToBeSorted.length + "\n");
        
        for (int om = 0; om < SortedArray.length; om++)
        {
            // System.out.println("\nOmgang [ArrayIndex]: " + om);
            
            for (int i = SortedArray.length-1; i > om; i--)
            {
                // Variabler
                int left, right;
                int indexMOne = i-1;
                
                // Sætter variabler
                left = SortedArray[indexMOne];
                right = SortedArray[i];
                
                
                if (left < right) // hvis den venstre side er mindre end den til højre, sker der ingenting.
                {
                    
                }
                else { // ellers så skifter de plads.
                    SortedArray[i] = left;
                    SortedArray[indexMOne] = right;
                }
                
                // DEBIGGING
                //System.out.println("Index: " + i + ""); // DEBUGGING
                
            }
            
            // System.out.println("Array: " + Arrays.toString(SortedArray));
            
        }
        
        return SortedArray;
    }
    
    // TODO: fix denne del, den laver fejl i den første??? fix det.
    public int[] BubbleBackTFront(int[] ArrayToBeSorted){ // [0,1,2,3] starter ved 0 og slutter ved 3
        
        int[] SortedArrayT = new int[ArrayToBeSorted.length];
        SortedArrayT = ArrayToBeSorted;
        
        // System.out.println("\nStart array: " + Arrays.toString(ArrayToBeSorted));
        // System.out.print("Længte er på: " + ArrayToBeSorted.length + "\n");
        
        for (int omt = 1; omt < SortedArrayT.length; omt++)
        {
            // System.out.println("\nOmgang [ArrayIndex]: " + omt);
            
            for (int it = 0; it < SortedArrayT.length-omt; it++)
            {
                // Variabler
                int left, right;
                int indexPOne = it+1;
                
                // Sætter variabler
                left = SortedArrayT[it];
                right = SortedArrayT[indexPOne];
                
                // DEBUGGING
                // System.out.println("Left: " + left + " indexMOne: " + indexPOne);
                // System.out.println("Right: " + right + " it: " + it);
                
                if (left < right) // hvis den venstre side er mindre end den til højre, sker der ingenting.
                {
                    SortedArrayT[it] = right;
                    SortedArrayT[indexPOne] = left;
                    // System.out.println("=X=X=X=X=X=X=X=X=X=X=X=X=X=X=X=X=X=X=X=X=X=X=X=XSWITCHED");
                }
                
                // DEBIGGING
                //System.out.println("Index: " + i + ""); // DEBUGGING
                
            }
            
            // System.out.println("Array: " + Arrays.toString(SortedArrayT));
            
        }
        
        return SortedArrayT;
        
    }
    
    public double MiddelVar(int[] arr)
    {
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        
        System.out.println("sum: " + sum);
        
        double res = sum/arr.length;
        
        return res;
    }
    
    public double Spreed(double xLine, int[] arr){
        
        double spread = 0;
        double ArrNum = 0;
        double sum = 0;
        
        for (int i = 0; i < arr.length; i++)
        {
            
            ArrNum = arr[i];
            System.out.println("mi: " + ArrNum);
            
            sum += Math.pow(ArrNum-xLine, 2);
            System.out.println("Sum: " + sum);
        }
        spread = Math.sqrt(sum/(arr.length-1));
        System.out.println("s: " + spread);
        return spread;
    }
    
}
