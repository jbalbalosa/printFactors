public class Main {
    public static void main(String[] args) {
        System.out.println("hasSameLastDigit!");

        System.out.println("41,22,71 " + hasSameLastDigit (41,22,71));
        System.out.println("23,32,42 " + hasSameLastDigit (23,32,42));
        System.out.println("9,99,999 " + hasSameLastDigit (9,99,999));

        System.out.println("10" + isValid(10));
        System.out.println("468 " + isValid(468));
        System.out.println("1051 " +  isValid(1051));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3){

        if (num1 < 10 || num1 > 1000){ //Check to see if num1 is within the range of 10-1000
            return false;
        }
        if (num2 < 10 || num2 > 1000){ //Check to see if num1 is within the range of 10-1000
            return false;
        }
        if (num3 < 10 || num3 > 1000){ //Check to see if num1 is within the range of 10-1000
            return false;
        }

        int num1LastDigit = num1 % 10;
        int num2LastDigit = num2 % 10;
        int num3LastDigit = num3 % 10;

        if(num1LastDigit == num2LastDigit){
            return true;
        }else if(num1LastDigit == num3LastDigit){
            return true;
        }
        return num2LastDigit == num3LastDigit;
    }

    public static boolean isValid(int num){
        return (num >= 10 && num <= 1000);
    }
}
