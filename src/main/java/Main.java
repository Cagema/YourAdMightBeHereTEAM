public class Main {
    public static void main(String[] args) {
        TestClass.setStr("Maks Paraside is a big pussy");
        TestClass.getStr();
        ARK puk = new ARK();
        puk.checker();
        ARK.valeraInARK = false;
        puk.checker();

        ValerasClass one = new ValerasClass();
        System.out.println(one.name + " is " + one.age);
    }
}
