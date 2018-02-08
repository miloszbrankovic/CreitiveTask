/**
 * Created by milos on 08/02/2018.
 */
public class DevOps {
    public static void main(String[] args) {


        devOps();


    }

    private static void devOps() {
        for (int i = 1; i <= 100; i ++){

            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("DevOps");
            } else if (i % 3 == 0){
                System.out.println("Dev");
            } else if (i % 5 == 0){
                System.out.println("Ops");
            } else {
                System.out.println(i);
            }
        }
    }


}
