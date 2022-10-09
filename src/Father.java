public class Father extends GrandFather {
    private int weith;
    private String profession;

    public int getWeith() {
        return weith;
    }

    public String getProfession() {
        return profession;
    }

    public Father(int age, String hobby, GrandSon grandSon, int weith, String profession) {
        super(age, hobby, grandSon, Cars.MERCEDES);
        this.weith = weith;
        this.profession = profession;
    }

    @Override
    public String getInfo1() {
        return super.getInfo1() + " " + getProfession() + " "
                + getWeith() + " " + Cars.MERCEDES;
    }

    public  void printFather(String profession){
        System.out.println("Father profession: " + profession);
    }
    final public void printFather() {
        System.out.println("This is father");
    }
}