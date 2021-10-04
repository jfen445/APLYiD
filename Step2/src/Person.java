public abstract class Person implements Potato{

    protected String name;
    protected String power;

    public Person(String name) {
        this.name = name;
        this.power = "";
    }

    public Person(String name, String power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public void powerLevel() {

    }

    @Override
    public void invokePower() {
        System.out.println("[" + name + "] HIAAAAAAAAA !");
    }

    @Override
    public void greet() {
        System.out.println("[" + name + "] " + "Hi guys, I'm " + name);
    }

    @Override
    public void grumble() {
        System.out.println("[" + name + "] " + "Grmblblblbl");
    }
}
