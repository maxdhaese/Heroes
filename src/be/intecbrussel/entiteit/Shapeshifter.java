package be.intecbrussel.entiteit;

public class Shapeshifter extends Hero {


    public Shapeshifter() {
        this(null,0);

    }

    public Shapeshifter(String alias) {
        this.alias = alias;

    }

    public Shapeshifter(String alias, int age) {
        this.alias = alias;
        this.age = age;

    }

    @Override
    public void useSuperPower() {
        System.out.println("disguises as enemy, attacks enemy from behind");

    }

    @Override
    public String toString() {
        return "Shapeshifter{" +
                "age=" + age +
                ", alias='" + alias + '\'' +
                '}';
    }


}
