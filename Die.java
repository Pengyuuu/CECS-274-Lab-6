public class Die {

    /**number of sides on a dice
     *
     */
    private int sides;

    /**value of a dice
     *
     */
    private int dieVal;

    /**
     * Constructor
     * @param s The number of sides a die has
     */
    public Die(int s){
        sides = s;
        dieVal = roll();
    }

    /**
     * Rolls the die and returns the result
     * @return  result of the roll
     */
    public int roll(){
        dieVal = (int) (Math.random() * sides) + 1;
        return dieVal;
    }

    /**
     * Gets value of the dice
     * @return  value of the dice
     */
    public int getDieVal(){
        return dieVal;
    }

    /**
     * Sets the dice to the parameter value
     * @param value value to set the dice to
     * @return      value of the dice
     */
    public boolean setDiceVal(int value){
        if (value > 0 && value <= sides){
            dieVal = value;
            return true;
        }
        return false;
    }

    /**
     * Compares if two die values are equal
     * @param other second dice value
     * @return      returns true or false
     */
    public boolean equals(Die other){
        return (dieVal == other.getDieVal() && sides == other.sides);
    }

    /**
     * Compares two die values to see if they're less or greater than each other
     * @param other second dice value
     * @return      returns a 1, -1, or 0
     */
    public int compareTo(Die other){
        if (dieVal < other.getDieVal()){

            return dieVal - other.getDieVal();
        }
        else if (dieVal > other.getDieVal()) {

            return dieVal - other.getDieVal();
        }
        return 0;
    }
}
