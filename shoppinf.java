import java.util.ArrayList; // 물건 이름을 저장할 수 있는 리스트
//쇼핑리스트를 저장할 수 있는 동적 배열을 사용하기위해 가져옴

import java.util.Scanner;

public class shoppinf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // 입력받을 준비 완료
        ArrayList<String> shoplist = new ArrayList<>(); // 물건이름을 차례로 저장하는 리스트
        // 쇼핑리스트를 저장할 공간 생성

        System.out.println("쇼핑리스트에 추가할 물건을 입력하세요\n끝을 입력하면 종료됩니다 ");

        System.out.println("물건이름: ");
        while (true) {
            String item = scanner.nextLine(); // 입력받은 내용을 item 변수에 저장

            if (item.equals("끝")){
                break;
            }
            shoplist.add(item); //사용자가 입력한 물건을 리스트에 추가
        }
        System.out.println("쇼핑리스트:");
        for (int i=0; i<shoplist.size(); i++) { // 리스트에 저장된 물건의 개수를 반환
            System.out.println((i+1)+". "+shoplist.get(i)); // 리스트에서 i번째 물건 이름을 가져옴
        }
    }
}
