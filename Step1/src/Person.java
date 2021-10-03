public abstract class Person implements Potato{

    protected String name;

    public Person(String name) {
        this.name = name;
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
