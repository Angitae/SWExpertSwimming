import java.util.Scanner;
import java.io.IOException;
import java.util.*;
 
public class Solution {
    static int TC;
    // TestCase
    static int day1, month1, month3, year;
    // �� �ش��ϴ� �̿밡��
    static int plan[] = new int[12];
    // ���� ��ȹ
    static int sum;
 
    // �� ���
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TC = sc.nextInt();
        for (int T = 0; T <= (TC + 1); T++) {
            day1 = sc.nextInt();
            month1 = sc.nextInt();
            month3 = sc.nextInt();
            year = sc.nextInt();
            for (int i = 0; i < 12; i++) {
                plan[i] = sc.nextInt();
            }
            sum = 3000;
            calculate(0, 0);
            System.out.println("#" + (T + 1) + " " + sum);
        }
    }
 
    static void calculate(int x, int y) {
        if (x >= 12) {
            sum = Math.min(sum, y);
            return;
        }
        calculate(x + 1, y + plan[x] * day1); // 1��ġ ����
        calculate(x + 1, y + month1); // 1��ġ ����
        calculate(x + 3, y + month3); // 3��ġ ����
        calculate(x + 12, y + year); // 1��ġ ����
 
    }
}