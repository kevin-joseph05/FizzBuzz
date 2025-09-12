package lab1;

public class Reduce {
    public static void main(String[] args) {

    }

    public static int reduce(int number){
        int count = 0;
        while (number > 0) {
            if (number % 2 == 0) {
                count ++;
                number = number / 2;
            }
            else {
                count ++;
                number--;
            }
        }
        return count;
    }
}
