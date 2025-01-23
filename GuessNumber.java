import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("학생 수를 입력하세요");
        int gkrtodtn = scanner.nextInt();

        int[] wjatn = new int[gkrtodtn];
        int sum = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for (int i=0; i<gkrtodtn; i++){
            System.out.println("학생"+i+"번의 점수를 입력하세요");
            wjatn[i] = scanner.nextInt();
            sum += wjatn[i];
            if (wjatn[i] < min ) min=wjatn[i];
            if (wjatn[i] > max ) max=wjatn[i];

        }
        double vudrbs = (double) sum/gkrtodtn;
        System.out.printf("평균점수%.2f\n", vudrbs);
        System.out.println("최고점수:"+max);
        System.out.println("최저점수:"+min);

    }
}
