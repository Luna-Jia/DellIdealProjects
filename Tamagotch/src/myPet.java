public class myPet {

    private String name;
    private int hunger;
    public int boredom;
    private String vocab = "meow";

    public void timeGoesBy (int minute){
        System.out.println(minute + " minute went by");
    }

    public void printInfo() {
        System.out.println("Hi I am "+ name);

        if (hunger < 20 && boredom < 20) {
            System.out.println("I am happy! Leave me alone.");
        }else{
            if (hunger >= 20){
                System.out.println("I am hungry! Feed me!");
            }
            if (boredom >= 20){
                System.out.println("I am bored! Play with me!");
            }
        }
        System.out.println("I can say " + vocab);
    }

}