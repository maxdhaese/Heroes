package be.intecbrussel.app;

import be.intecbrussel.entiteit.*;
import be.intecbrussel.util.AllTheHeroes;

/**
 * Created by Mrrobot on 31/10/2017 heroes.
 *
 * Hier in deze klasse zullen jullie enkele zaken moeten aanvullen.
 */
public class HeroApp {

    public static void main (String[] args) {
        AllTheHeroes heroes = new AllTheHeroes();

        /*
        Kunnen jullie een instantie van de klasse AllTheHeroes maken?
        noem deze referentie variabele heroes
         */



        /*
        ik heb ook een verwijzing naar de Array uit deze instantie nodig
        misschien is er al een methode voorzien hiervoor?
        */
        Hero[] listOfHeroes = new Hero[4];


        //Ik maak alvast enkele instanties van je subklassen aan
        ArmoredHero ironMan = new ArmoredHero("Iron Man", 54);
        Tank hulk = new Tank("Hulk", 55);
        Energizer ironFist = new Energizer("Iron Fist",43);
        Shapeshifter misterFantastic = new Shapeshifter("Mister Fantastic",56);
        Energizer havok = new Energizer("Havok",48);
        Shapeshifter mystique = new Shapeshifter("Mystique",39);

        /*
        Nu we enkele instanties/objecten hebben kunnen jullie deze even opslaan?
        Maak misschien gebruik van een reeds bestaande methode
        */
        for (Hero hero: listOfHeroes){
            //        heroes.addSuperHero(ironMan);
//        heroes.addSuperHero(hulk);
//        heroes.addSuperHero(ironFist);
//        heroes.addSuperHero(misterFantastic);
//        heroes.addSuperHero(havok);
//        heroes.addSuperHero(mystique);
        }



        listOfHeroes[0] = new ArmoredHero("Iron Man",55);
        listOfHeroes[1] = new Tank("Hulk",55);
        listOfHeroes[2] = new Energizer("Iron Fist",43);
        listOfHeroes[3] = new Shapeshifter("Mister Fantastic",56);


        /*
        Onderstaande methode kan je gebruiken om onze array af te printen.
        Ik vrees echter dat deze methode nog niet volledig af is.
        Los jij dit even op?
        */

        print(listOfHeroes);



        /*
        Iron fist en Mister Fantastic stellen teleur!
        verwijder deze uit de array.
         */
        heroes.removeSuperHero(ironFist);
        heroes.removeSuperHero(misterFantastic);

        /*
        Misschien kunnen we havok en mystique beter gebruiken in ons team
        voeg deze toe aan onze array met heroes
         */


        /*
        Niet vergeten deze methode had nog wat werk nodig!!!
         */
        print(listOfHeroes);
    }

    private static void print(Hero[] listOfHeroes) {
        printHeader();

        /*
        Ik ben vergeten om de krachten van de heroes te gebruiken
        kan jij dit even oplossen?
         */
        for(int i = 0; i < listOfHeroes.length; i++)
            if (listOfHeroes[i] != null) {
                System.out.println(listOfHeroes[i]);
//                System.out.println(Hero.useSuperPower());
                fancyLines(55);
            }
    }

    private static void printHeader() {
        fancyLines(45);
        System.out.println("\t\t\t\tLIST OF HEROES\n");
        fancyLines(45);
    }

    private static void fancyLines (int numbOfLines){
        for (int i = 0; i < numbOfLines; i++){
            System.out.print("-");
            if (i == (numbOfLines-1)){
                System.out.println("|\n");
            }
        }
    }

}
