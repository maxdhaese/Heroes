package be.intecbrussel.entiteit;

public class Tank extends Hero {


    public Tank() {
        this(null,0);

    }

    public Tank(String alias) {
        this.alias = alias;

    }

    public Tank(String alias, int age) {
        this.alias = alias;
        this.age = age;

    }

    @Override
    public void useSuperPower() {
        System.out.println("haha no damage done, stupid enemy");

    }


    @Override
    public String toString() {
        return "Tank{" +
                "age=" + age +
                ", alias='" + alias + '\'' +
                '}';
    }


}
