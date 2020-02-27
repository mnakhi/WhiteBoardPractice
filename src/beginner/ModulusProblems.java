package beginner;

/**
 * Modulus problems. Remember to write JavaDocs.
 */
public class ModulusProblems {

    // 1. Write a method that checks if an integer is odd.
    public boolean isOdd(int num) {
        if (num % 2 == 1) {
            return true;
        }
        return false;
    }

    // 2. Write a method that checks if an integer is even.
    public boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }
    // 3. Write a method that checks if an integer is odd or even.
    public boolean isOddOrEven(int num){
        if(num%2==0){
            System.out.println(num+" is even");
            return true;
        }else{
            System.out.println(num+" is odd");
            return true;
        }
    }
    // 4. Write a method that prints all of the odd integers from range 1-100.
    public void printOdd(){
        for(int i = 1; i <=100; i++){
            if(i%2 == 1){
                System.out.println(i);
            }
        }
    }
    // 5. Write a method that prints all of the even integers from range 1-X, where X is the upper bound.
    public void printEven(int upperBound){
        for(int i =1; i<=upperBound; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
    // 6. Write a method that checks if an integer is divisible by 3.
    public boolean isDivisibleBy3(int number){
        if(number%3 == 0){
            return true;
        }
        return false;
    }
    // 7. Write a method that checks if an integer is divisible by 5.
    public boolean isDivisibleBy5(int number){
        if(number%5 == 0){
            return true;
        }
        return false;
    }
    // 8. Write a method that prints out foo if an integer is divisible by 3, prints out bar if an integer
    // is divisible by 5, and prints out foobar if an integer is divisible by both 3 and 5.
    public void isDivisibleBy3Or5(int number){
        if(number%3==0){
            System.out.println("foo");
        }else if(number%5==0){
            System.out.println("bar");
        }else if(number%3==0 && number%5==0){
            System.out.println("foobar");
        }else{
            System.out.println("neither divisible by 3 or 5");
        }
    }
    // 9. Similar to #8, but do it from range 1-X, where X is the upper bound.
    public void isDivisibleBy3Or5InRange(int upperBound){
        for(int i=1;i<=upperBound;i++){
            if(i%3==0){
                System.out.println(i+" "+"foo");
            }else if(i%5==0){
                System.out.println(i+" "+"bar");
            }else if(i%3==0 && i%5==0){
                System.out.println(i+" "+"foobar");
            }else{
                System.out.println(i+" "+"neither divisible by 3 or 5");
            }
        }
    }
}