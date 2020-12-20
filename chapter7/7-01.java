class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public boolean equals(Person x) {
        if(this.name == x.name) {
            return true;
        } else {
            return false;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동");
        System.out.println(p1.equals(new Person("홍길동")));
        System.out.println(p1.equals(new Person("최영태")));
    }
}