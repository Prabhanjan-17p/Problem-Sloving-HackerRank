import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {

        // Write your code here
        int  index1=0,index5=0,index9 = 0,index3=0,index7=0,Res1=0,Res2=0,Res=0;
//        List<Integer>  index1,index5,index9,index3,index7,Res1,Res2,Res;
//        int [][]aer = new int[arr.size()][arr.size()];
        int sizeOfarr = arr.size();
        System.out.println(sizeOfarr);
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < sizeOfarr; j++) {
                if (i ==0 && j==0 ){
                    index1 = arr.get(i).get(j);
                } else if (i ==0 && j==2) {
                    index3 = arr.get(i).get(j);
                } else if (i==1 && j ==1) {
                    index5 = arr.get(i).get(j);
                } else if (i==2 && j==0) {
                    index7 = arr.get(i).get(j);
                } else if (i ==2 && j==2) {
                    index9 = arr.get(i).get(j);
                }
            }
        }
        Res1 = index1+index9+index5;
        Res2 = index3+index7+index5;
        Res = Res1-Res2;
        return Res;
    }

}

public class Diagonal_Difference {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
