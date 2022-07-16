public class Main {

    public static Hero[] creatHer() {

        Hero adilW = new Hero(50, 100);
        Hero adilR = new Hero(48, 48);
        Hero adilB = new Hero(48, 48, "fire");
        Hero[] creatHero = new Hero[]{adilW, adilR, adilB};
        return creatHero;
    }

    public static void main(String[] args) {
        Boss bob = new Boss();
        bob.setHealth(300);
        bob.setDamage(300);
        bob.setSuperpower(" : freeze");
        System.out.println("Boss");
        System.out.println("Health" + bob.getHealth());
        System.out.println("Damage" + bob.getDamage());
        System.out.println("Superpower" + bob.getSuperpower());
        System.out.println("Hero");

        for (int i = 0; i < creatHer().length; i++) {
            System.out.println(creatHer()[i].getHealth() + creatHer()[i].getDamage() + creatHer()[i].getSuperpower());

        }


    }


}