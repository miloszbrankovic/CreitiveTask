/**
 * Created by milos on 08/02/2018.
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.println(factirial(5));
    }



    private static int factirial(int n) {
        if (n <= 0){
            return 1;
        }else {
            return n * factirial(n-1);
        }
    }

}
