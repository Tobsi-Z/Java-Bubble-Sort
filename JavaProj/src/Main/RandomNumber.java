/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Formatter;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Tobsi
 */
public class RandomNumber
{
    
    public RandomNumber(){
        
    }
    
    public int[] GetRandomArray(int ArrLength, int maxRange){ // TODO: Lav double til en int
        
        int MaxRangePOne = maxRange + 1; // for at sætte det til det brugeren vælger. så når de vælger 200, så er det ikke 199
        int[] RetArray = new int[ArrLength];
        
        for (int i = 0; i < ArrLength; i++) // sætter tal ind i array.
        {
            int InNumb = ThreadLocalRandom.current().nextInt(1, MaxRangePOne); // tilfældig int
            
            RetArray[i] = InNumb; // sætter tallet ind på plads [i]
            
        }
        return RetArray;
    }
    
    public int[] GetRandomUneven(int ArrLength, int maxRange){
        
        int MaxRangePOne = maxRange + 1; // for at sætte det til det brugeren vælger. så når de vælger 200, så er det ikke 199
        int counter = 0; // Fungere som index
        int tempVar; // Midlertidig variabel
        
        int[] RetArr = new int[ArrLength];
        
        while (counter < ArrLength) 
        {            
            tempVar = ThreadLocalRandom.current().nextInt(1, MaxRangePOne); // TODO: set den til 1, 200 når den skal gives
            //System.out.println("TempVar: " + tempVar); // DEBUGGING
            
            if (tempVar % 2 != 0)
            {
                RetArr[counter] = tempVar;
                counter++;
            }
            else{
                //System.out.println("THIS IS AN EVEN NUMBER!"); // DEBUGGING
            }
        }
        
        return RetArr;
    }
    
    /*
    
    •	Udskriv usorterede array pænt med f.eks. 10 tal på hver linje. Printf() metoden er god til formateret udskrivning.
    
    
    */
    
    public void PrintFormat(int[] arr){
        for (int l = 0; l < arr.length / 10 + 1; l++)
        {
            
            //System.out.println("l: " + l);
            for (int i = 0; i < 10; i++)
            {
                int LocalLine = l * 10;
                int LocalArr = LocalLine + i;
                
                /*System.out.println("l: " + l);
                System.out.println("i: " + i);
                System.out.println("LocalArr: " + LocalArr);*/ // DEBIGGING
                
                if (LocalArr < arr.length)
                {
                    System.out.printf("[%3d] ", arr[LocalArr]);
                }
                
                
            }
            System.out.println("");
        }
    }
    
    public String PrintFormatToString(int[] arr){
        
        StringBuilder StrBuilder = new StringBuilder();
        Formatter StrFormatter = new Formatter(StrBuilder);
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
                    //System.out.printf("[%3d] ", arr[LocalArr]);
                }
                if (index%10 == 0) // styre hvor mange Array "Kasser" der skal være på en linje
                {
                    RetString += "\n";
                }
                
                
            }
            //System.out.println("\n" + RetString);
            //RetString += " \n";
        }
        System.out.println("" + RetString);
        return RetString;
    }
}
