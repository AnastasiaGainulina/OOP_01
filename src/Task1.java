import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {

        ArrayList<BaseHero> farmer = new ArrayList<>();
        String[] farmerNames = {"Альфред", "Клод", "Борщ", "Пи", "Британец"};
        for (String name : farmerNames) {
            farmer.add(new Farmer(name));
        }
        for (BaseHero character : farmer) {
            System.out.println(character);
        }
        System.out.println("============================");


        ArrayList<BaseHero> crossbowman = new ArrayList<>();
        String[] crossbowmanNames = {"Альфред", "Клод", "Борщ", "Пи", "Британец"};
        for (String name : crossbowmanNames) {
            crossbowman.add(new Crossbowman(name));
        }
        for (BaseHero character : crossbowman) {
            System.out.println(character);
        }
        System.out.println("============================");

        ArrayList<BaseHero> magician = new ArrayList<>();
        String[] magicianNames = {"Альфред", "Клод", "Борщ", "Пи", "Британец"};
        for (String name : magicianNames) {
            magician.add(new Magician(name));
        }
        for (BaseHero character : magician) {
            System.out.println(character);
        }
        System.out.println("============================");

        ArrayList<BaseHero> monk = new ArrayList<>();
        String[] monkNames = {"Альфред", "Клод", "Борщ", "Пи", "Британец"};
        for (String name : monkNames) {
            monk.add(new Monk(name));
        }
        for (BaseHero character: monk){
            System.out.println(character);
        }
        System.out.println("============================");

          ArrayList<BaseHero> rogue = new ArrayList<>();
        String[] rogueNames = {"Альфред", "Клод", "Борщ", "Пи", "Британец"};
        for (String name : rogueNames) {
            rogue.add(new Rogue(name));
        }
        for (BaseHero character: rogue){
            System.out.println(character);
        }
        System.out.println("============================");

        ArrayList<BaseHero> sniper = new ArrayList<>();
        String[] sniperNames = {"Альфред", "Клод", "Борщ", "Пи", "Британец"};
        for (String name : sniperNames) {
            sniper.add(new Sniper(name));
        }
        for (BaseHero character: sniper){
            System.out.println(character);
        }
        System.out.println("============================");

        ArrayList<BaseHero> spearman = new ArrayList<>();
        String[] spearmanNames = {"Альфред", "Клод", "Борщ", "Пи", "Британец"};
        for (String name : spearmanNames) {
            spearman.add(new Spearman(name));
        }
        for (BaseHero character: spearman){
            System.out.println(character);
        }
        System.out.println("============================");
    }
}