public class Sale extends Person{
    public Sale(String name) {
        super(name);
    }

    @Override
    public void grumble() {
        System.out.println("[" + name + "] " + "Grmblblblbl");
        System.out.println("[" + name + "] " + "Not gonna hit my target");
    }
}
