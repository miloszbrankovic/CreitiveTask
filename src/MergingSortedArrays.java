import java.util.ArrayList;

/**
 * Created by milos on 08/02/2018.
 */
public class MergingSortedArrays {
    public static void main(String[] args) {
        int niz1[] = {1, 2, 3, 5, 7};
        int niz2[] = {1, 4, 6, 7, 8};
        sortiranje(niz1, niz2);

    }

    public static void sortiranje(int n1[], int n2[]){
        int i = 0;
        int j = 0;
        ArrayList<Integer> n3 = new ArrayList<Integer>();
        for (int brojac = 0; brojac < n1.length + n2.length; brojac++){
            if (i < n1.length && j < n2.length){
                if (n1[i] < n2[j]){
                    n3.add(n1[i]);
                    i++;
                }
                else if (n1[i] > n2[j]){
                    n3.add(n2[j]);
                    j++;
                }else if (n1[i] == n2[j]){
                    n3.add(n1[i]);
                    i++;
                    j++;
                }
            }
            else if (j < n2.length){
                n3.add(n2[j]);
                j++;
            }
            else if (i < n1.length){
                n3.add(n1[i]);
                i++;
            }
        }
        for (int brojac = 0; brojac < n3.size(); brojac++) {
            System.out.print(n3.get(brojac) + ", ");
        }
    }
}
