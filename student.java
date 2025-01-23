import java.util.ArrayList;
import java.util.Scanner;

public class student {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<>(); // 리스트에 점수 저장

        System.out.println("학생 수를 입력하세요");
        int gkrtodtn = scanner.nextInt();

        for (int i =1; i<= gkrtodtn; i++){ // 1부터 학생수까지 반복
            System.out.println(i+"번 학생의 점수를 입력하세요");
            int score = scanner.nextInt();
            scores.add(score); // 입력받은 점수를 scores에 저장 //score, scores 별개
        }
        System.out.println("\n학생 점수 및 학점");
        for (int i=0; i< scores.size(); i++){ //sxores.size : 리스트에 저장된 점수의 갯수
            // 점수의 갯수만큼 반복
            int score = scores.get(i); // 리스트에서 i번째 점수를 가져옴
            //ex)첫번째 반복 -> 리스트의 첫번째 점수 가져옴
            String gkrwja; // 학점을 저장할 변수

            if (score >= 90){
                gkrwja = "A+"; // 조건을 확인해서 해당되는 학점을 반환

            } else if (score >= 80) {
                gkrwja = "A";

            } else if (score >= 70) {
                gkrwja = "B";

            } else if (score >= 60) {
                gkrwja = "C";

            }else{
                gkrwja = "F";
            }
            System.out.println((i+1)+"번 학생 : \n점수 = "+score+", 학점 = "+gkrwja);
        }
    }
}
