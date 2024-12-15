public class Hero {
    private int health;
    private int damage;
    private String superDamage;

    // конструктор 1
    public Hero(int health, int damage, String superDamage) {
        this.health = health;
        this.damage = damage;
        this.superDamage = superDamage;
    }

    // конструктор 2
    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    // гетеры
    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperDamage() {
        return superDamage;
    }

}
