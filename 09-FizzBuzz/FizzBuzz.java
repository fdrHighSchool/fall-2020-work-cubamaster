public class FizzBuzz{
    public static void main(String[] args) {
        int upperBound = 100;
        for(int i = 1; i <= upperBound; i++){
            System.out.print(i + " ? ");
            if (isFizz(i) && isBuzz(i)) {
                System.out.println("FizzBuzz");
            }
            else if (isFizz(i)) {
                System.out.println("isFizz");
            }
            else if (isBuzz(i)){
                System.out.println("IsBuzz");
            }
            else {
                System.out.println("no one ");
            }
            //insert logic here to execute FizzBuzz and generate output
        }//end for loop

    }//end main method

    //***********************************************************//

    /*
     * N: isFizz
     * P: determine if the number is to be classified as "fizz"
          a number is classified as "fizz" if it's divisible by 3
     * I: an integer
     * R: true/false value
     */
    public static boolean isFizz(int num){
        return (num % 3 == 0);

    }//end isFizz method

    //***********************************************************//

    /*
     * N: isBuzz
     * P: determine if the number is to be classified as "buzz"
          a number is classified as "buzz" if it's divisible by 5
     * I: an integer
     * R: true/false value
     */
    public static boolean isBuzz(int num){
        return (num % 5 == 0);
    }//end isBuzz method

}//end class