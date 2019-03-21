class TestClass {
    private static String truthOfTheWholeWorld;

    public static void setStr(String truthOfTheWholeWorld){
        TestClass.truthOfTheWholeWorld = truthOfTheWholeWorld;
    }

    public static void getStr(){
        System.out.print(truthOfTheWholeWorld);
    }
}
