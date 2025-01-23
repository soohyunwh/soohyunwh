class Animal {
    String name;

    Animal() {
        this.name = "동물";
    }

    Animal(String name) {
        this.name = name;

    void makesound(){
        System.out.println(name+"이(가) 소리를 냅니다");
    }

    void move(){
        System.out.println(name+"이(가) 이동합니다.");
    }
}

class Lion extends Animal{
    Lion(String name){
        super(name);
    }
    @Override
    void makesound(){
        System.out.println(name+"이(가) 으르렁거립니다!");
    }
    @Override
    void move (){
        System.out.println(name+"spqkffh rjfdjeksla");
    }
}

class Bird extends Animal {
    Bird(String name){
        super(name);
    }
    @Override
    void makesound(){
        System.out.println(name+"wlwjrnla");
    }
    @Override
    void move(){
        System.out.println(name+"skffkeksla");
    }
}

public class Ehdanfdnjs {
    public static void main(String[] args) {
        Animal lion = new Lion("사자");
        Animal bird = new Bird("새");

        lion.makesound();
        lion.move();

        bird.makesound();
        bird.move();
    }
}
