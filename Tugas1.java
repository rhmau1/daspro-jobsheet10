import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][6];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("input data responden ke-" + (i + 1));
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("input jawaban pertanyaan ke-" + (j + 1) + " : ");
                int input = sc.nextInt();
                if (input > 0 && input < 6) {
                    arr[i][j] = input;
                } else {
                    System.out.println("hanya menerima input 1-5");
                    j--;
                }
            }
            System.out.println("===================");
        }

        for (int i = 0; i < arr.length; i++) {
            double[] rataResp = new double[10];
            for (int j = 0; j < arr[0].length; j++) {
                rataResp[i] += arr[i][j];
            }
            System.out.println("rata responden ke- " + (i + 1) + ": " + (rataResp[i] / 6));
        }

        for (int i = 0; i < arr[0].length; i++) {
            double[] rataPert = new double[6];
            for (int j = 0; j < arr.length; j++) {
                rataPert[i] += arr[j][i];
            }
            System.out.println("rata pertanyaan ke-" + (i + 1) + ": " + (rataPert[i] / 10));
        }

        double rataKeseluruhan = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                rataKeseluruhan += arr[i][j];
            }
        }
        System.out.println("rata keseluruhan: " + (rataKeseluruhan / 60));
    }
}
