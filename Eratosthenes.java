import java.sql.SQLOutput;
import java.util.ArrayList;

public class Eratosthenes {

    public static ArrayList<Integer> eratosthenes(int n) {

        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            nums.add(i);
        }

        for (int j = 0; j < nums.size(); j++) {
            int p = nums.get(j);
            for (int i = nums.size() - 1; i > j; i--) {

                if (nums.get(i) % p == 0) {
                    nums.remove(i);
                }
            }
        }

        return nums;
    }

    public static void Goldbach(int n) {

        if (n % 2 != 0) {
            System.out.println("NA");
        }

        if (n % 2 == 0) {

            for (int i = 0; i < eratosthenes(n).size(); i++) {
                int y = 0;
                int z = 0;
                int w = 0;
                int x = eratosthenes(n).get(i);

                y = n - x;

                if (eratosthenes(n).contains(y)) {
                    z = eratosthenes(n).indexOf(y);
                    w = eratosthenes(n).get(z);
                    System.out.println(w + ", " + x);
                    break;
                }


            }


//            for (int j = 0; j < eratosthenes(n).size(); j++) {
//                int y = eratosthenes(n).get(j);
//
            //            for (int i = 0; i < eratosthenes(n).size(); i++) {
//
//                  int x = eratosthenes(n).get(i);
//
//                    if (y + x == n) {
//                        System.out.println(x + "," + y);
//                    }
//                }
//            }
        }
    }

    public static ArrayList<Integer> add(ArrayList<Integer> a, ArrayList<Integer> b) {

        ArrayList<Integer> sum = new ArrayList<Integer>();


        int y = 0;
        int n = b.size() - 1;
        int z = 0;


        for (int i = a.size() - 1; i >= 0; i--) {

            int x = 0;
            int w = 0;

            x = a.get(i);
            if (n >= 0) {
                z = b.get(n);
            } else z = 0;


            w = x + z + y;

            if (w >= 10) {
                w = (w - 10);
                sum.add(0, w);
                y = 1;
            } else {
                w = w;
                sum.add(0, w);
                y = 0;
            }
            if (n == 0) {
                n = -1;
            }
            if (n > 0) {
                n--;
            }
        }return sum;


    }




    public static void main(String[] args) {
        System.out.println(eratosthenes(25));
        Goldbach(100);
        ArrayList<Integer> num1 = new ArrayList<Integer>();
        num1.add(9);
        num1.add(0);
        num1.add(0);
        num1.add(9);
        num1.add(7);
        ArrayList<Integer> num2 = new ArrayList<Integer>();
        num2.add(7);
        num2.add(1);
        num2.add(0);
        num2.add(0);
        num2.add(7);

        System.out.println(add(num1, num2));
       // System.out.println(num1);
    }

}
