package taskfour;

/*Invoking Math.random() returns a (pseudo)random number of type double from
the half-open interval [0; 1). Use this generator to draw cards from a standard deck.
First, draw an integer from the interval [1; 4] (corresponding to suit: clubs, diamonds,
hearts, spades) and then another number from the interval [2; 14] (deuce, trey, four,
five, . . . , ten, Jack, Queen, King, Ace). Using the switch expression, define strings
describing cards and display five such random cards on the console*/

public class TaskFour {
    public static void main (String[] args){

        for(int i=0; i<5 ; i++){
            int col = 1 + (int)((Math.random()*4));
            int rnk = 2 + (int)((Math.random()*13));

            String color = switch(col){
                case 1 -> "Clubs";
                case 2 -> "Diamonds";
                case 3 -> "Hearts";
                case 4 -> "Spades";
               default -> "Error, Something wrong";
            };

            String rank = switch (rnk){
                case 2 -> "Deuce";
                case 3 -> "Trey";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                case 9 -> "Nine";
                case 10 -> "Ten";
                case 11 -> "Jack";
                case 12 -> "Queen";
                case 13 -> "King";
                case 14 -> "Ace";
                default -> "Error, Option not correct";
            };

            System.out.println(rank + " of " + color );
        }
    }
}
