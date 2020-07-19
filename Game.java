/**
 * Name: Eric Truong
 * Date: October 14, 2019
 * Description: A player rolls three dice and gets points based on if the player rolls a three of a kind, a pair, or
 * a series
 */
public class Game {
    public static void main (String[] args) {
        /**create a new player
         *
         */
        Player p1 = new Player();
        boolean choice = true;

        //continue the game until player says otherwise
        while (choice == true) {
            p1.takeTurn();
            System.out.print("Play again? Y/N: ");
            choice = CheckInput.getYesNo();

        }
        System.out.println("Thanks for playing!");
    }
}
