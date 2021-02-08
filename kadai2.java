package kadai2;
import java.util.Scanner;

public class kadai2 {
	static String[] SUIT_STRING = {"S", "C", "D", "H"};
    static String[] NUMBER_STRING = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    
    private int[] suit = new int[5];
    private int[] number = new int[5];

    private int[]  suitCount = { 0, 0, 0, 0 };  // スーツごとの枚数
    private  int[] numberCount = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public static void main(String[] args) {
        new kadai2();
    }
    public kadai2() {
        cardYomu();
        cardStringKaku();
        hanteiJunbi();
        yakuhantei();
    }

    private void cardYomu() {
        try {
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 5; ++i) {
                suit[i] = sc.nextInt();
                number[i] = sc.nextInt();
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
