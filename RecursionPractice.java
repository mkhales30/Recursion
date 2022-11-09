/**
 * class name: RecursionPractice
 * author: Monauver Rahman
 * course: ITEC 2150
 * date: November 8, 2022
 * version 2.0
 * description: Solutions for 
 * https://codingbat.com/prob/p222237?parent=/home/hpark7@ggc.edu/recursion1
 * w/ main method
 */
public class RecursionPractice
{
    public String displayString(String str, int n){
        if(n==1) return str;
        return str + displayString(str,n-1);
    }
    public String getMultiChar(char ch, int n){
        if(n < 1) return "" + ch;
        return getMultiChar(ch, n-1) + ch;
    }
    public long getPowerOfTen(int n){
        if (n==0) return 1;
        return 10 * getPowerOfTen(n-1);
    }
    public int factorial(int n) {
        if (n==0) return 1;
        return factorial(n-1) * n;
    }
    public int numberOfGloves(int peopleOfPlanetU101InARoom){
        if(peopleOfPlanetU101InARoom <=0) return 0;
        return 3+numberOfGloves(peopleOfPlanetU101InARoom-1);
    }
    public long getPowerOfTenLoop(int n){
        long num = 10;
        if (n==0) return 1;
        while(n>1){
            num = num * 10;
            n -= 1;
        }
        return num;
    }
    public int numberOfGlovesNoRecursion(int peopleOfPlanetU101InARoom){
        return peopleOfPlanetU101InARoom * 3;
    }
    public int getNumberOfZerosLoop(int n){
        int count = 0;
        while(n > 0)
        {
            int temp = n % 10;
            if(temp==0)
                count =count+1;
            n = n / 10;
        }
        return count;
    }
    public int getNumberOfZerosRecursion(int n){
        if(n==0) return 0;
        else {
            int temp = getNumberOfZerosRecursion(n / 10);
            if (n % 10 == 0)
                ++temp;
            return temp;
        }
    }
    public static void main(String args[]){
        RecursionPractice rp = new RecursionPractice();

        //displayString
        System.out.println(rp.displayString("#", 3));
        System.out.println(rp.displayString("&", 5));
        System.out.println(rp.displayString("Hello", 7));
        //getMultiChar
        System.out.println(rp.getMultiChar('y', 4));
        System.out.println(rp.getMultiChar('#', 10));
        System.out.println(rp.getMultiChar('i', 15));
        //getPowerOfTen
        System.out.println(rp.getPowerOfTen(5));
        System.out.println(rp.getPowerOfTen(3));
        System.out.println(rp.getPowerOfTen(2));
        //factorial
        System.out.println(rp.factorial(1));
        System.out.println(rp.factorial(2));
        System.out.println(rp.factorial(3));
        //numberOfGloves
        System.out.println(rp.numberOfGloves(0));
        System.out.println(rp.numberOfGloves(1));
        System.out.println(rp.numberOfGloves(3));
        //getPowerOfTenLoop
        System.out.println(rp.getPowerOfTenLoop(5));
        System.out.println(rp.getPowerOfTenLoop(3));
        System.out.println(rp.getPowerOfTenLoop(2));
        //numberOfGlovesNoRecursion
        System.out.println(rp.numberOfGlovesNoRecursion(0));
        System.out.println(rp.numberOfGlovesNoRecursion(1));
        System.out.println(rp.numberOfGlovesNoRecursion(3));
        //getNumberOfZerosLoop
        System.out.println(rp.getNumberOfZerosLoop(2030));
        System.out.println(rp.getNumberOfZerosLoop(200030));
        System.out.println(rp.getNumberOfZerosLoop(1204));
        //getNumberOfZerosRecursion
        System.out.println(rp.getNumberOfZerosRecursion(2030));
        System.out.println(rp.getNumberOfZerosRecursion(200030));
        System.out.println(rp.getNumberOfZerosRecursion(1204));
    }
}
//You only included the methods but not include
//main method in the correct name of the class 
//as assignment description provided.
