public class Player {

    /**array of dice
     *
     */
    private Die dice[];

    /**player points
     *
     */
    private int points;

    /**
     * Constructor to make 3 dies with 6 sides
     */
    public Player(){

        dice = new Die[3];

        for (int i = 0; i < dice.length; i++){
            dice[i] = new Die(6);
        }
        points = 0;
    }

    /**
     * Player takes a turn, seeing if the die rolled makes a pair, three of a kind, or a series
     */
    public void takeTurn(){
        for (int i = 0; i < dice.length; i++){
            dice[i].roll();
        }
        sort();
        System.out.println(this);
        if (isThreeOfAKind()){
            System.out.println("You got three of a kind!");
            points += 3;
        }
        else if (isPair()){
            System.out.println("You got a pair!");
            points += 1;
        }
        else if (isSeries()){
            System.out.println("You got a series of three!");
            points += 2;
        }
        else{
            System.out.println("Aww. Too bad.");
        }
        System.out.println("Score = "+points+" points");

    }

    /**
     * Retrieves player's points
     * @return  returns player's points
     */
    public int getPoints(){
        return points;
    }

    /**
     * Given the 3 dies, sort them from decreasing to increasing
     */
    public void sort(){
        int min;
        for (int i = 0; i < dice.length - 1; i++){
            min = i;
            for(int j = 1; j < dice.length; j++){
                if (dice[j].compareTo(dice[min]) < 0){
                    min = j;
                }
            }
            if (min != i){
                Die temp = dice[i];
                dice[i] = dice[min];
                dice[min] = temp;
            }
        }

    }

    /**
     * Determines if player has 3 of a kind
     * @return  returns true or false
     */
    public boolean isThreeOfAKind(){
        return (dice[0].equals(dice[1]) && dice[1].equals(dice[2]));
    }

    /**
     * Determines if player has a matching pair
     * @return  returns true or false
     */
    public boolean isPair(){
        return (dice[0].equals(dice[1])) || (dice[0].equals(dice[2])) || (dice[1].equals(dice[2]));
    }

    /**
     * Determines if player has a series
     * @return  returns true or false
     */
    public boolean isSeries(){
        return (((dice[0].compareTo(dice[1])) == -1) && ((dice[1].compareTo(dice[2])) == -1));
    }

    /**
     * Converts the values of the dies into a string
     * @return  values of the 3 dies in a structured sentence
     */
    public String toString(){
        return "Rolling... D1 = "+dice[0].getDieVal()+" D2 = "+dice[1].getDieVal()+" D3 = "+dice[2].getDieVal();
    }

}
