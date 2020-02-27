package beginner;

import java.io.IOException;

/**
 * This class can be used for you to test out your methods. Remember to instantiate your
 * classes in order to use the methods, unless you've made your methods declared as static.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        //System.out.println("PLZ WORK");
        //test code here
        ModulusProblems problems = new ModulusProblems();
        //System.out.println(problems.isEven(6));
       // System.out.println(problems.isOddOrEven(7));
        NumberProblems numberProblems = new NumberProblems();
        //System.out.println(numberProblems.onesPlace(190));
        //System.out.println(numberProblems.tensPlace(17));
        //System.out.println(numberProblems.hundredsPlace(3284));
        //System.out.println(numberProblems.absoluteValue(-23));
        //System.out.println(numberProblems.nonNeg(755));
        int[] num = {24 ,55 ,17 ,87 ,100 };
        //System.out.println(numberProblems.avgNum(num));
//        System.out.println("the smallest integer is "+numberProblems.smallestNumber(num));
        //System.out.println("the smallest integer is "+numberProblems.largestNumber(num));
        //System.out.println(numberProblems.evenNumbers(num));
        //System.out.println(numberProblems.formattedInteger(9.7));
        //System.out.println(numberProblems.nonNegativeNumber(7749));
        //System.out.println(numberProblems.firstDigit(-3453));
        //System.out.println(numberProblems.firstDigitSecondWay(-5654));
        StringProblems problem2 = new StringProblems();
        //System.out.println(problem2.isEqual("test","test"));
        //System.out.println(problem2.isEqualCaseInsensitive("Test","tEsT"));
        //System.out.println(problem2.firstNLast("Brown"));
        //System.out.println(problem2.lengthOfWord("Auditorium"));
        //System.out.println(problem2.wordCount("But why?"));
        //System.out.println(problem2.hasNumericValue("HELL9O"));
        //System.out.println(problem2.hasAlphabeticalCharacters("1111"));
        //System.out.println(problem2.lastThreeCharacters("Hello world"));
        //System.out.println(problem2.con("Automation"));
        //System.out.println(problem2.firstThreeCharacters("Hello"));
        //problem2.concatenatingFirstNLastThreeChars("Automation");
        //System.out.println(problem2.file());
        //System.out.println(problem2.isPalindrome("Automation"));
        //System.out.println(problem2.hasDuplicateCharacters("property"));
        //System.out.println(problem2.isAnagram("cat","act"));
        //System.out.println(problem2.isAnagram("Tan","Ant"));
        problem2.removeVowel("Animal");
    }
}