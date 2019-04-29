package be.intecbrussel.entiteit;

public class Energizer extends Hero {


    public Energizer() {
        this(null,0);

    }

    public Energizer(String alias) {
        this.alias = alias;

    }

    public Energizer(String alias, int age) {
        this.alias = alias;
        this.age = age;

    }

    @Override
    public void useSuperPower() {
        System.out.println("charging... , attacks enemy with charged superpowers");

    }

    @Override
    public String toString() {
        return "Energizer{" +
                "age=" + age +
                ", alias='" + alias + '\'' +
                '}';
    }


}
