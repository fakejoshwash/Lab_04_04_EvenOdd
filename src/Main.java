public class Main{
    public static void main(String[] args) {
        int userInput = 3;
        int numSee;

        numSee = userInput % 2;
        if (numSee == 0)
            System.out.println(userInput + " is even");
        else
            System.out.println(userInput + " is odd");
    }
}