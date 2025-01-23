import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Student {
    String name; // 학생이름
    int score; // 학생점수
    String grade; // 학생학점

    Student(String name, int score) { // 생성자: 학생 이름과 점수를 초기화하고 학점을 계산
        this.name =name; // 입력받은 이름을 클래스의 nmae에 저장
        this.score = score; // ''
        this.grade = calculateGrade(score); // 점수에 따라 학점을 계산하여 gkrwja변수에 저장
    }
    // 학점 계산 메서드 : 점수를 받아 학점을 반환
    private String calculateGrade(int score){
        if (score>=90){
            return "A+";
        } else if (score>=80) {
            return "A";

        } else if (score>=70) {
            return "B";

        } else if (score>=60) {
            return "C";

        }else{
            return "F";
        }
    }


}

public class Student2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student>students = new ArrayList<>();

        System.out.println("학생 수를 입력하세요");
        int gkrtodtn = 0;

        while (true){
            try{
                gkrtodtn = scanner.nextInt();
                scanner.nextLine(); // 입력 버퍼 비우기
                if (gkrtodtn <= 0) {
                    System.out.println("학생수는 1명 이상이여야합니다");
                    System.out.println("다시 입력해주세요");
                }else{
                    break; //올바른 학생수가 입력되면 반복 종료
                }
            }catch (InputMismatchException e){
                System.out.println("유효한 숫자를 입력하세요");
                scanner.nextLine(); // 잘못된 입력값 제거
            }
        }

        for (int i=1; i<=gkrtodtn; i++){
            System.out.println(i+"번 학생의 이름을 입력하세요");
            String name = scanner.nextLine(); // 이름 입력받기

            int score = 0;
            while (true){ //점수 유효성 검사
                System.out.println(i+"번 학생 점수를 입력하세요");
                try {
                    score = scanner.nextInt();
                    scanner.nextLine();
                    if(score<0 || score>100) { //점수 범위 확인
                        System.out.println("점수는 0에서 100 사이입니다");
                    }else{
                        break;
                    }
                } catch (InputMismatchException e){
                    System.out.println("유효한 숫자를 입력하세요");
                    scanner.nextLine(); // 잘못된 입력값 제거
                }
            }

            students.add(new Student(name,score));
        }
        System.out.println("\n학생 점수 및 학점");
        for (Student student : students){ //리스트에 있는 모든 학생 정보 출력
            System.out.println("이름: "+student.name+ "/점수: "+student.score+ ", 학점: "+student.grade);

        }
    }
}
