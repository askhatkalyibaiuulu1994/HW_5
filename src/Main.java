public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(900);
        boss.setDamage(90);
        boss.setProtection("Magic");
        System.out.println("BOSS HEALTH: " + boss.getHealth() + " BOSS DAMAGE: " + boss.getDamage()
                + " BOSS PROTECTION: " + boss.getProtection());
        for (Hero heroes : createHeroes()) {
            System.out.println("HERO  HEALTH: " + heroes.getHealth() + " HERO  DAMAGE: "
                    + heroes.getDamage() + " HERO  SUPER DAMAGE: " + heroes.getSuperDamage());
        }
    }

    // возвращаемый меод createHeroes
    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(300, 40, "fare");
        Hero hero2 = new Hero(400, 110, "ice");
        Hero hero3 = new Hero(700, 30);
        Hero[] allHeroes = {hero1, hero2, hero3};
        return allHeroes;
    }
}
