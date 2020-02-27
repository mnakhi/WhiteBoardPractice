package beginner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * String problems. Remember to write JavaDocs.
 */
public class StringProblems {

    // 1. Write a method that checks if two strings are equal, case sensitive.
    // (ex: "test" & "test" -> true; "Test" & "TEST" -> false; "TeSt" & "tEsT -> false; "TeSt" & "TeSt" -> true)
    public boolean isEqual(String word1, String word2){
        if (word1.equals(word2)) {
            return true;
        }else{
            return false;
        }
    }
    // 2. Write a method that checks if two strings are equal, case insensitive.
    // (ex: "test", "test" -> true; "Test", "TEST" -> true; "TeSt" & "tEsT -> true; "TeSt" & "TeSt" -> true)
    public boolean isEqualCaseInsensitive(String word1, String word2){
        if (word1.equalsIgnoreCase(word2)) {
            return true;
        }else{
            return false;
        }
    }
    // 3. Write a method that returns the first and last character of a given string, respectively.
    // (ex: "Brown" -> {'B', 'n'}; "monkey1" -> {'m', '1'})
    public ArrayList<Character> firstNLast(String word){
        ArrayList<Character> firstNLastCharacter = new ArrayList<Character>();
        firstNLastCharacter.add(word.charAt(0));
        firstNLastCharacter.add(word.charAt(word.length()-1));
        return firstNLastCharacter;
    }
    // 4. Write a method that checks if the length of a string is greater than or equal to 3.
    // (ex: "Uh" -> false; "Auditorium" -> true; "Man" -> true);
    public boolean lengthOfWord(String word){
        if(word.length()>=3){
            return true;
        }else{
            return false;
        }
    }

    // 5. Write a method that returns the number of words from a given string. Assume each word is separated by a space.
    // (ex: "This is a sample string" -> 5; "But why?" -> 2; "I cannot wait to go home and lay on my bed" -> 11)
    public int wordCount(String word){
        int count = 0;
        String word2 = word.trim(); // Returns a copy of the string, with leading and trailing whitespace omitted.
        for(int i = 0; i< word2.length();i++){
            if(word.charAt(i)==' '){
                count += 1;
            }
        }
        return count+1;
    }
    // 6. Write a method that returns the first three characters of a given string. Be wary about an edge case.
    public String firstThreeCharacters(String word){
        int count = 0;
        String partialWord ="";
        if(word.length()<=3){
            return word;
        }else {
            for (int i = 0; i < word.length(); i++) {
                count = count + 1;
                if (count <= 3) {
                    partialWord = partialWord + word.charAt(i);
                }
            }
            return partialWord;
        }
    }
    // 7. Write a method that returns the last three characters of a given string. Be wary about an edge case.
    public String lastThreeCharacters(String word){
        int count = 0;
        String partialWord ="";
        if(word.length()<=3){
            return word;
        }
        else {
            for (int i = word.length() - 1; i >= 0; i--) {
                count = count + 1;
                if (count <= 3) {
                    partialWord = partialWord + word.charAt(i);
                }
            }
            StringBuilder word1 = new StringBuilder(partialWord);
            word1 = word1.reverse();
            return String.valueOf(word1);
        }
    }
    // 8. Write a method that concatenates the first and last three characters of a given string. Be wary about an edge case.
    public void concatenatingFirstNLastThreeChars(String word){
        int count1 = 0;
        int count2=0;
        String forward = "";
        String backward="";
        StringBuilder word1 = new StringBuilder(word);
        if(word.length()<=3){
            System.out.println(word+String.valueOf(word1.reverse()));
        }
        else{
            for(int i = 0; i<word.length();i++){
                count1 =count1+1;
                if(count1<=3){
                    forward+=word.charAt(i);
                }
            }
            for(int j = word.length()-1;j>=0;j--){
                count2 =count2 + 1;
                if(count2<=3){
                    backward += word.charAt(j);
                }
            }
            StringBuilder backword2 = new StringBuilder(backward);
            backword2.reverse();
            System.out.println(forward+backword2);
        }
    }
    // 9. Write a method that checks if the given string contains numerical values.
    public boolean hasNumericValue(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    // 10. Write a method that checks if the given string contains alphabetical characters.
    public boolean hasAlphabeticalCharacters(String word){
        for(int i=0;i<word.length();i++){
            if(Character.isLetter(word.charAt(i))){
                return true;
            }
        }
        return false;
    }
    // 11. Write a method that will remove vowels from a given string.
    public void removeVowel(String word){
        word=word.replaceAll("[AaEeOoIiUu]","");
        System.out.println(word);
    }
    // 12. Write a method that returns the number of words from a given string.

    // 13. Write a method that returns the number of words from a file.
    public int file() throws IOException {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        int count = 0;
        try{
            String filename = "C:\\Users\\hp\\IdeaProjects\\JavaPrac\\src\\beginner\\data.txt";
            fileReader = new FileReader(filename);
            bufferedReader = new BufferedReader(fileReader);
            String data = "";

            while ((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
                String[] word= data.split(" ");
                for(int i = 0; i < word.length;i++){
                    count = count+1;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            bufferedReader.close();
            fileReader.close();
        }

        return count;
    }
    // 14. Write a method that checks if a string is a palindrome.
    public boolean isPalindrome(String word){
        word = word.toLowerCase();
        for(int i=0; i<word.length();i++){
            for(int j=word.length()-1;j>=0;j--){
                if (word.charAt(i) == word.charAt(j)) {
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return false;
    }
    // 15. Write a method that checks if two strings are an anagram.
    public boolean isAnagram(String word1, String word2){
        word1 = word1.toLowerCase();
        word2=word2.toLowerCase();
        int count = 0;
        for(int i = 0 ; i<word1.length();i++){
            for(int j = 0; j<word2.length();j++){
                if(word1.charAt(i)==word2.charAt(j)){
                    count = count +1;
                }
            }
        }
        if(count == word1.length()){
            return true;
        }
        return false;
    }
    // 16. Write a method that checks if a string contains duplicate characters.
    public boolean hasDuplicateCharacters(String word){
        for(int i = 0; i<word.length();i++){
            for(int j = i+1; j<word.length();j++){
                if(word.charAt(i)==word.charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }
}