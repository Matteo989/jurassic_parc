package creatures;

public abstract class Creatures {
    public String name;
    public boolean sex;   // 1 = male, 0 = female
    public double height; // en cm
    public double weight; // en kilos
    public int age;
    public boolean angry; // 1 = faim , 0 = pas faim
    public boolean tired;
    public boolean health; // 1 = ok , 0 = pas bon

    public Creatures() {
    }

    public Creatures(String name, boolean sex, double height, double weight, int age, boolean angry, boolean tired, boolean health) {
        this.name = name;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.angry = angry;
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

    public boolean isAngry() {
        return angry;
    }

    public void setAngry(boolean angry) {
        this.angry = angry;
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
        return this.getCreatureType() + "{" +
                "type='" + this.getType() + '\'' +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", height=" + height +
                ", weight=" + weight +
                ", age=" + age +
                ", angry=" + angry +
                ", tired=" + tired +
                ", health=" + health +
                '}';
    }


}
