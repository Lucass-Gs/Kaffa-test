import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[][] ch = new int[15][14];
        int[][] rect1;
        int[][] rect2;

        for (int i = ch.length - 2; i >= 0; i--) {
            for (int j = 0; j < ch[i].length + 2; j++) {
                if (j == 0 || j % 5 == 0 && i == 0) {
                    System.out.print("|");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
