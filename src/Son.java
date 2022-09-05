public final class Son extends Father {
    private int birthday;
    private String name;

    public Son(int age, String hobby, GrandSon grandSon, int weith, String profession, int birthday, String name) {
        super(age, hobby, grandSon, weith, profession);
        this.birthday = birthday;
        this.name = name;
    }

    public int getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

@Override
public String getInfo1() {
    return super.getInfo1() + "" + getBirthday() +"" + getName() + Cars.BMV;
}
}


