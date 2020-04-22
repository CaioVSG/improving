public class EntityAtributes {
    private int maxHealth;
    private int stamina;
    private int mana;
    private int phisicalPower;
    private int magicalDamage;
    private int atkSpeed;
    private int criticalChance;
    private int armor;
    private int magicalResistence;
    private int lifeSteal;
    private int phisicalPenetration;
    private int magicalPenetration;

    public EntityAtributes(String classe) {
        if (classe == "warrior") {
            this.maxHealth = 500;
            this.stamina = 300;
            this.mana = 50;
            this.phisicalPower = 60;
            this.magicalDamage = 0;
            this.atkSpeed = 1;
            this.criticalChance = 5;
            this.armor = 25;
            this.magicalResistence = 30;
            this.lifeSteal = 0;
            this.phisicalPenetration = 0;
            this.magicalPenetration = 0;
        }
    }


    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getPhisicalPower() {
        return phisicalPower;
    }

    public void setPhisicalPower(int phisicalPower) {
        this.phisicalPower = phisicalPower;
    }

    public int getMagicalDamage() {
        return magicalDamage;
    }

    public void setMagicalDamage(int magicalDamage) {
        this.magicalDamage = magicalDamage;
    }

    public int getAtkSpeed() {
        return atkSpeed;
    }

    public void setAtkSpeed(int atkSpeed) {
        this.atkSpeed = atkSpeed;
    }

    public int getCriticalChance() {
        return criticalChance;
    }

    public void setCriticalChance(int criticalChance) {
        this.criticalChance = criticalChance;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getMagicalResistence() {
        return magicalResistence;
    }

    public void setMagicalResistence(int magicalResistence) {
        this.magicalResistence = magicalResistence;
    }

    public int getLifeSteal() {
        return lifeSteal;
    }

    public void setLifeSteal(int lifeSteal) {
        this.lifeSteal = lifeSteal;
    }

    public int getPhisicalPenetration() {
        return phisicalPenetration;
    }

    public void setPhisicalPenetration(int phisicalPenetration) {
        this.phisicalPenetration = phisicalPenetration;
    }

    public int getMagicalPenetration() {
        return magicalPenetration;
    }

    public void setMagicalPenetration(int magicalPenetration) {
        this.magicalPenetration = magicalPenetration;
    }
}
