package creatures;

public abstract class Creature {
    private String name;
    private boolean sex;   // 1 = male, 0 = female
    private double height; // en cm
    private double weight; // en kilos
    private int age;
    private boolean hungry; // 1 = faim , 0 = pas faim
    private boolean tired;
    private boolean health; // 1 = ok , 0 = pas bon

    public Creature() {
    }

    public Creature(String name, boolean sex, double height, double weight, int age, boolean hungry, boolean tired, boolean health) {
        this.name = name;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.hungry = hungry;
        this.tired = tired;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public boolean isTired() {
        return tired;
    }

    public void setTired(boolean tired) {
        this.tired = tired;
    }

    public boolean isHealth() {
        return health;
    }

    public void setHealth(boolean health) {
        this.health = health;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public String getCreatureType() {
        return this.getClass().getSuperclass().getSuperclass().getSimpleName();
    }

    @Override
    public String toString() {
        return this.getCreatureType() + "={" +
                "type='" + this.getType() + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", height=" + height +
                ", weight=" + weight +
                ", age=" + age +
                ", hungry=" + hungry +
                ", tired=" + tired +
                ", health=" + health +
                '}';
    }


}
