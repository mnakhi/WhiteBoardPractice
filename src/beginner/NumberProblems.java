package beginner;

import java.util.ArrayList;

/**
 * Number problems. Remember to write JavaDocs.
 */
public class NumberProblems {

    // 1. Write a method that returns the ones' place of an integer. (ex: 3284 -> 4; 17 -> 7; 190 -> 0; 5 -> 5)
    public int onesPlace(int number){
        return number%10;
    }
    // 2. Write a method that returns the tens' place of an integer. (ex: 3284 -> 8; 17 -> 1; 190 -> 9; 5 -> error)
    public int tensPlace(int number){
        return ((number/10)%10);
    }
    // 3. Write a method that returns the hundreds' place of an integer.
    public int hundredsPlace(int number){
        return ((number/100)%10);
    }
    // 4. Write a method that returns the absolute value of an integer. (ex: -192 -> 192; 121 -> 121; -8 -> 8)
    public int absoluteValue(int number){
        if(number<0){
            return Math.abs(number);
        }
        return number;
    }
    // 5. Write a method that returns the first digit of a non-negative number. Do not incorporate String. (ex: 432 -> 4)
    public int nonNegativeNumber(int number){
        if(number/10 <10){
            return number/10;
        }
        return (nonNegativeNumber(number/10));
    }
    public int firstDigitNonNegativeNumber(int number){
        while(number>=10){
            number/=10;
        }
        return number;
    }
    // 6. Write a method that returns the first digit of an integer. Do not incorporate String. (ex: 432 -> 4; -7819 -> 7)
    //by calling the nonNegativeNumber method
    public int firstDigit(int number){
        if(number<0){
            number=number*(-1);
            return nonNegativeNumber(number);
        }
        return nonNegativeNumber(number);
    }
    //another way of doing
    public int firstDigitSecondWay(int number){
        if(number<0){
            number=number*(-1);
            if((number/10)<10){
                return number/10;
            }
            return firstDigitSecondWay(number/10);
        }
        else{
            if((number/10)<10){
                return number/10;
            }
            return firstDigitSecondWay(number/10);
        }
    }
    // 7. Write a method that returns the average number from a list of integers.
    public double averageOfNumbers(int[]list){
        int sum = 0;
        int count = 0;
        for(int i =0 ; i<list.length;i++){
            sum += list[i];
            count +=1;
        }
        return (double)sum/count;
    }
    // 8. Write a method that returns the smallest number from a list of integers.
    public int smallestNumber(int []list){
        int compare = list[0];
        for(int i = 0; i<list.length;i++){
            if(compare>list[i]){
                compare = list[i];
            }
        }
        return compare;
    }
    // 9. Write a method that returns the largest number from a list of integers.
    public int largestNumber(int []list){
        int compare = list[0];
        for(int i = 0; i<list.length;i++){
            if(compare<list[i]){
                compare = list[i];
            }
        }
        return compare;
    }
    // 10. Write a method that returns a list of even numbers from a given list of integers. (ex: {3, 2, 5, 8, 9} -> {2, 8})
    public ArrayList<Integer> evenNumbers(int[]list){
        ArrayList<Integer>list1 = new ArrayList<Integer>();
        for(int i=0; i <list.length;i++){
            if(list[i]%2 ==0){
                list1.add(list[i]);
            }
        }
        return list1;
    }
    // 11. Write a method that returns the rounded integer, floor and ceiling, respectively, from a double.
    // (ex: 9.7 -> {10, 9, 10}; 5.4 -> {5, 5, 6}; 13.55 -> {14, 13, 14})
    public ArrayList<Integer> formattedInteger(double number){
        int rounded = (int) Math.round(number);
        int floor = (int) Math.floor(number);
        int ceiling = (int) Math.ceil(number);
        ArrayList<Integer>list = new ArrayList<Integer>();
       list.add(rounded);
       list.add(floor);
       list.add(ceiling);
       return list;
    }
}
