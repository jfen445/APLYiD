//import src.*;

class Main {
    public static void main(String[] args) {
        Person dmitry = new Dev("Dmitry", "Destroys some PR");
        Dev milad = new Dev("Milad", "Cries and pet Bailee");
        Dev andrew = new Dev("Andrew", "Is having merge conflicts");
        Person loz = new Sale("Lawrence");

        dmitry.greet();
        loz.greet();
        milad.greet();
        System.out.println("");

        dmitry.grumble();
        loz.grumble();
        System.out.println("");

        milad.takeNewStory();
        milad.work();
        milad.finishStory();
        System.out.println("");

        milad.takeNewStory();
        milad.work();
        milad.finishStory();
        System.out.println("");

        dmitry.invokePower();
        milad.invokePower();
        System.out.println("");

        andrew.work();
        andrew.finishStory();
        andrew.takeNewStory();
        andrew.takeNewStory();
        andrew.work();
        andrew.invokePower();
        andrew.finishStory();
        System.out.println("");

        dmitry.invokePower();
        andrew.getDummyTrophy();
        loz.getDummyTrophy();
    }
}