public class PartAffil {

    public static void main(String[] args) {
        String party = "r";


        System.out.println("Please enter your political party affiliation");

        if (party == "r") {
            System.out.println("You're a Elephant!");
        } else if (party == "d") {
            System.out.println("You're a Donkey!");
        } else if (party == "i"){
            System.out.println("You're a Independent Man !");
        }
        else if (party == "o"){
            System.out.println("You choose other!");
        }
        else System.out.println("Please enter a valid input");

    }
}
