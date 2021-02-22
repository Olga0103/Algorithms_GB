package lession_5;



public class HW5 {

    public static void main(String[] args) {

        System.out.println(exponentiation(5, 7));
        System.out.println(exponentiation(6, 0));
        System.out.println(exponentiation(9, 6));
        System.out.println(exponentiation(2, -3));

    }

    public static int exponentiation(int value, int rank) {
        if (value == 0) {
            if (rank > 0)
                return 0;
            else
                throw new IllegalArgumentException("Invalid rank " + rank + " for digit = 0");
        }
        if (rank < 0) {
            return 1 / (value * exponentiation(value, -rank - 1));
        }
        else if (rank > 0) {
            return value * exponentiation(value, rank - 1);
        }
        else {
            return 1;
        }
    }


}
