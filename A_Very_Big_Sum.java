import java.util.ArrayList;
import java.util.Scanner;

public class A_Very_Big_Sum {
    public static int check(ArrayList<Integer> ar){
        int Con = ar.size();
        long Sum =0;
        for (int i = 0; i < Con; i++) {
            Sum = ar.get(i)+ Sum;
        }
        System.out.println(Sum);
        return 0;
    }
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int arCount = sc.nextInt();
        for (int i = 0; i < arCount; i++) {
            int arItem = sc.nextInt();
            ar.add(arItem);
        }
        check(ar);
    }
}
