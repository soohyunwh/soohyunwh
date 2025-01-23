class Tkdna {
    String name;

    void attack(){
        System.out.println("기본 공격!");
    }
}
class Dnjfldj extends Tkdna{
    @Override
    void attack(){
        super.attack();
        System.out.println("강력한 검 공격!");
    }
}

class Dkcu extends Tkdna {
    @Override
    void attack() {
        super.attack();
        System.out.println("멀리서 활 공격!");
    }
}

public class animal {
    public static void main(String[] args) {
        Tkdna Dnjfldj = new Dnjfldj();
        Tkdna Dkcu = new Dkcu();

        Dnjfldj.attack();
        Dkcu.attack();
    }
}