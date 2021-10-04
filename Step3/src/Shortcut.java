public abstract class Shortcut {

    private static int id = 0;

    public static void incrementID() {
        //add one to the current ID
        Shortcut.id++;
        System.out.format("[Shortcut] Story sc-%04d created\n", id);
    }

    public static int getId() {
        //return the ID
        return id;
    }
}
