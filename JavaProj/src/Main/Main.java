/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import GUI.SplashUI;
import GUI.UI;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author Tobsi
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {        
        // ---- Variabler
        
       /* int ArrLength = 130; // længde af array (NEEDS TO BE 130)
        int[] IntArr = new int[ArrLength]; // array

        RandomNumber RNGNumber = new RandomNumber();
        
        System.err.println("=====" + IntArr.length); // DEBUGGING
        
        IntArr = RNGNumber.GetRandomArray(ArrLength, 130); // gets a random array
        
        System.out.println(Arrays.toString(IntArr)); // printer array til konsollen
        
        Sorter sort = new Sorter(); // Føder objekt.
        
        sort.BubbleFrontTBack(IntArr); // Lavest til størst
        
        System.out.println("\n========================\n");
        
        IntArr = RNGNumber.GetRandomArray(ArrLength, 130); // gets a random array again
        
        sort.BubbleBackTFront(IntArr); // Størst til lavest
        
        IntArr = RNGNumber.GetRandomUneven(ArrLength, 130);
        
        int[] intArrTest = IntArr; //{3, 5, 7, 9};
        
        System.out.println("Uneven Arr: " + Arrays.toString(intArrTest)); // brug den funktion/metode som jeg laver i bunden PrintFormat(DubArr);
        */
        SplashUI splash = new SplashUI();
        
        /*try
        {
            Thread.sleep(5000); // 5 sec
            splash.dispose();
        } catch (Exception e)
        {
            
        }*/
        
        UI ui = new UI(); // GUI Window
        ui.setStringToLable("Press \"New Sort\" to generate a new array.");
        //ui.ArrLabel.setText(RNGNumber.PrintFormatToString(IntArr));
        
        //System.out.println("===================================================\n" + Arrays.toString(IntArr));
        //System.out.println(PrintFormatToString(IntArr) + "===================================================\n");
        
        /*System.out.println("Unsorted");
        RNGNumber.PrintFormat(intArrTest);
        
        sort.BubbleBackTFront(intArrTest); 
        
        System.out.println("\nSorted Arr: " + Arrays.toString(intArrTest));
        System.out.println("Sorted");
        RNGNumber.PrintFormat(intArrTest);*/
        
        //ui.ArrLabelSorted.setText(RNGNumber.PrintFormatToString(IntArr));
        
        /*double mid = 0;
        mid = MiddelVar(IntArr);
        
        System.out.println("mid: " + mid);*/
        
        //double sp = sort.Spreed(sort.MiddelVar(intArrTest), intArrTest);
    }
    
    // ---- Metoder
    
    /*public static int[] GetRandomArray(int ArrLength){ // TODO: Lav double til en int
        
        int[] RetArray = new int[ArrLength];
        
        for (int i = 0; i < ArrLength; i++) // sætter tal ind i array.
        {
            int InNumb = ThreadLocalRandom.current().nextInt(0, 199); // tilfældig int
            
            RetArray[i] = InNumb; // sætter tallet ind på plads [i]
            
        }
        return RetArray;
    }
    
    public static int[] GetRandomUneven(int ArrLength){
        int counter = 0; // Fungere som index
        int tempVar; // Midlertidig variabel
        
        int[] RetArr = new int[ArrLength];
        
        while (counter < ArrLength) 
        {            
            tempVar = ThreadLocalRandom.current().nextInt(0, 199); // TODO: set den til 1, 200 når den skal gives
            
            System.out.println("TempVar: " + tempVar); // DEBUGGING
            
            if (tempVar % 2 != 0)
            {
                RetArr[counter] = tempVar;
                counter++;
            }
            else{
                System.out.println("THIS IS AN EVEN NUMBER!"); // DEBUGGING
            }
        }
        
        return RetArr;
    }
    
    /*
    
    •	Udskriv usorterede array pænt med f.eks. 10 tal på hver linje. Printf() metoden er god til formateret udskrivning.
    
    
    */
    
    /*public static void PrintFormat(int[] arr){
        for (int l = 0; l < arr.length / 10 + 1; l++)
        {
            
            //System.out.println("l: " + l);
            for (int i = 0; i < 10; i++)
            {
                int LocalLine = l * 10;
                int LocalArr = LocalLine + i;
                
                if (LocalArr < arr.length)
                {
                    System.out.printf("[%3d] ", arr[LocalArr]);
                }
                
                
            }
            System.out.println("");
        }
    }
    
    public static String PrintFormatToString(int[] arr){
        
        String RetString = "";
        
        int index = 0;
        
        for (int l = 0; l < arr.length / 10 + 1; l++)
        {
            for (int i = 0; i < 10; i++)
            {
                int LocalLine = l * 10;
                int LocalArr = LocalLine + i;
                
                index++;
                
                if (LocalArr < arr.length)
                {
                    RetString += String.format("[%3d] ", arr[LocalArr]);
                    System.out.printf("[%3d] ", arr[LocalArr]);
                }
                if (index%7 == 0)
                {
                    RetString += "\n";
                }
                
                
            }
            System.out.println("");
            //RetString += " \n";
        }
        return RetString;
    }*/
    
    /*public static double MiddelVar(int[] arr)
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
    
    public static double Spreed(double xLine, int[] arr){
        
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
    }*/
    
}