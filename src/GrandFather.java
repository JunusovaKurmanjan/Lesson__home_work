public abstract class GrandFather {
    private int Age;
    private String Hobby;
    private GrandSon grandSon;
    Cars cars;
    public GrandFather(int age, String hobby, GrandSon grandSon, Cars cars ) {
        Age = age;
        Hobby = hobby;
        this.grandSon = grandSon;
    }

    public int getAge() {
        return Age;
    }

    public String getHobby() {
        return Hobby;
    }
    public String getInfo1(){
        return "Возраст :"+Age +"\nХобби :"+Hobby + "\nGrandson age : " + grandSon.getAge()+ "\nGrandson growth: "
                +grandSon.getGrowth() + " Cars: " + Cars.LEXUS;
    }

}
