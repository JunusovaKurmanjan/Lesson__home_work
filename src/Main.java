public class Main {
    public static void main(String[] args) {
        GrandSon grandSon=new GrandSon(33,44);
Father father=new Father(22,"Play",grandSon,44,"programmer");
Father father2 = new Father(45, "read", grandSon, 70, "teacher");
Son son=new Son(33,"RE",grandSon,22,"doctor",2,"Artur");
Son son1=new Son(20,"REX",grandSon,66,"PRO",2,"ROBERT");
father.printFather("doctor");
father.printFather();
son.printFather("engineer");
father2.printFather("teacher");
father2.printFather();
        System.out.println(father.getInfo1());
        System.out.println(son.getInfo1());
        System.out.println(son1.getInfo1());
        System.out.println(father2.getInfo1());

    }
}