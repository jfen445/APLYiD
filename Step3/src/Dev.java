public class Dev extends Person{

    private static boolean working;

    public Dev(String name) {
        super(name);
        working = false;
    }

    public Dev(String name, String power) {
        super(name, power);
        working= false;
    }

    public void takeNewStory() {
        if (!working) {
            Shortcut.incrementID();
            working = true;
            System.out.format("[Shortcut] Story sc-%04d created\n", Shortcut.getId());
            System.out.format("[" + name + "] " + "Ok, working on sc-%04d\n", Shortcut.getId());
        } else {
            System.out.format("[" + name + "] " + "I need to finish my task before taking another one\n");
        }

    }

    public void work() {
        if (working) {
            System.out.format("[" + name + "] " + "I am working on sc-%04d, PR up soon!\n", Shortcut.getId());
        } else {
            System.out.format("[" + name + "] " + "I need a new story!\n");
        }

    }

    public void finishStory() {
        if (working) {
            System.out.format("[" + name + "] " + "sc-%04d done, PR up !\n", Shortcut.getId());
            working = false;
        } else {
            System.out.format("[" + name + "] " + "I can't finish something I haven't started\n");
        }
    }

    @Override
    public void getDummyTrophy() {
        System.out.format("[" + name + "] " + "I've been a potato and deserve my dummy trophy\n");
    }
}
