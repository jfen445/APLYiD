public class Dev extends Person{

    public Dev(String name) {
        super(name);
    }

    public Dev(String name, String power) {
        super(name, power);
    }


    public void powerLevel() {
        System.out.println("[" + name + "] MY POWER LEVEL IS OVER 9000 HAHAHA");
    }
}
