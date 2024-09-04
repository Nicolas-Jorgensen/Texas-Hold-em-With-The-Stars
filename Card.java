public class Card
{
    // instance variables 
    private char suit;
    private int rank;
    private boolean faceDown;

    // the no-arg constructor 
    public Card() {
        this.suit = 'C';
        this.rank = 1;
        this.faceDown = true;
    }

    // the explicit (parameter) constructor
    public Card(char suit, int rank, boolean faceDown) {
        this.suit = suit;
        this.rank = rank;     
        this.faceDown = faceDown;
    }

// Accessor methods.
    public char getSuit() {
        return this.suit;
    }
    
    public int getRank() {
        return this.rank;
    }
    
    public boolean getFaceDown(){
        return this.faceDown;
    }
   
// Modifier methods.
    public void setSuit(char suit) {
        if(suit == 'C' || suit == 'c' || suit == 'S' || suit == 's' || suit == 'H' || suit == 'h' || suit == 'D' || suit == 'd') {
            this.suit = suit;
        }                    
    }
    
    public void setRank(int rank) {
        if(rank >= 1 && rank <= 13) {
            this.rank = rank;
        }
    }
    
    public void setFaceDown(boolean faceDown){
        this.faceDown = faceDown;
    }
    // the print method.
    public void print() {
        //X is my dummy marker for dummy cards so this if statement
        //just makes sure the method doesn't print dummy cards
        if (suit == 'X' || suit == 'x'){  
        }
        else if(rank == 1) {     // First print out the rank.
            System.out.print("Ace of ");
        }
        else if(rank == 11) {
            System.out.print("Jack of ");                    
        }
        else if(rank == 12) {
            System.out.print("Queen of ");                    
        }
        else if(rank == 13) {
            System.out.print("King of ");                    
        }
        else {
            System.out.print(rank + " of ");
        }
        

        if(suit == 'C' || suit == 'c') {   // Then print out the suit.
            System.out.println("Clubs");
        }
        if(suit == 'S' || suit == 's') {
            System.out.println("Spades");
        }
        if(suit == 'H' || suit == 'h') {
            System.out.println("Hearts");
        }
        if(suit == 'D' || suit == 'd') {
            System.out.println("Diamonds");
        }                     
    }    
    
    public String toString()
    {
        String result;
        if(rank == 1) {     // First print out the rank.
            result = "Ace of ";
        }
        else if(rank == 11) {
            result = "Jack of ";                    
        }
        else if(rank == 12) {
            result = "Queen of ";                    
        }
        else if(rank == 13) {
            result = "King of ";                    
        }
        else {
            result = rank + " of ";
        }
        
        if(suit == 'C' || suit == 'c') {   // Then print out the suit.
            result += "Clubs";
        }
        if(suit == 'S' || suit == 's') {
            result += "Spades";
        }
        if(suit == 'H' || suit == 'h') {
            result += "Hearts";
        }
        if(suit == 'D' || suit == 'd') {
            result += "Diamonds";
        }                    
        return result; 
    }
    
   public void printAscii(){ //This method prints an ascii visual of a card
           
            if(getFaceDown() == true){ //all cards will just be printed facedown
                System.out.println(" _____");
                System.out.println("|\\ ~ /|"); // java can't just print "\" so this line looks weird
                System.out.println("|}}:{{|");
                System.out.println("|}}:{{|");
                System.out.println("|}}:{{|");
                System.out.println("|/_~_\\|"); // here too. I guess "\" is called an escape character
            }
            else{ //if a card isn't facedown this chooses card art for it 
                if(getSuit() == 'C' || getSuit() == 'c') {  
                    if(getRank() == 1) {     
                        System.out.println(" _____");
                        System.out.println("|A _  |");
                        System.out.println("| ( ) |");
                        System.out.println("|(_'_)|");
                        System.out.println("|  |  |");
                        System.out.println("|____V|");
                    }
                    else if(getRank() == 2) {
                        System.out.println(" _____");
                        System.out.println("|2    |");
                        System.out.println("|  &  |");
                        System.out.println("|     |");
                        System.out.println("|  &  |");
                        System.out.println("|____Z|");                    
                    }
                    else if(getRank() == 3) {
                        System.out.println(" _____");
                        System.out.println("|3    |");
                        System.out.println("| & & |");
                        System.out.println("|     |");
                        System.out.println("|  &  |");
                        System.out.println("|____E|");                    
                    }
                    else if(getRank() == 4) {
                        System.out.println(" _____");
                        System.out.println("|4    |");
                        System.out.println("| & & |");
                        System.out.println("|     |");
                        System.out.println("| & & |");
                        System.out.println("|____h|");                     
                    }
                    else if(getRank() == 5) {
                        System.out.println(" _____");
                        System.out.println("|5    |");
                        System.out.println("| & & |");
                        System.out.println("|  &  |");
                        System.out.println("| & & |");
                        System.out.println("|____S|");                     
                    }
                    else if(getRank() == 6) {
                        System.out.println(" _____");
                        System.out.println("|6    |");
                        System.out.println("| & & |");
                        System.out.println("| & & |");
                        System.out.println("| & & |");
                        System.out.println("|____9|");                     
                    }
                    else if(getRank() == 7) {
                        System.out.println(" _____");
                        System.out.println("|7    |");
                        System.out.println("| & & |");
                        System.out.println("|& & &|");
                        System.out.println("| & & |");
                        System.out.println("|____L|");                      
                    }
                    else if(getRank() == 8) {
                        System.out.println(" _____");
                        System.out.println("|8    |");
                        System.out.println("|& & &|");
                        System.out.println("| & & |");
                        System.out.println("|& & &|");
                        System.out.println("|____8|");                     
                    }
                    else if(getRank() == 9) {
                        System.out.println(" _____");
                        System.out.println("|9    |");
                        System.out.println("|& & &|");
                        System.out.println("|& & &|");
                        System.out.println("|& & &|");
                        System.out.println("|____6|");                    
                    }
                    else if(getRank() == 10) {
                        System.out.println(" _____");
                        System.out.println("|10 & |");
                        System.out.println("|& & &|");
                        System.out.println("|& & &|");
                        System.out.println("|& & &|");
                        System.out.println("|___0I|");                    
                    }
                    else if(getRank() == 11) {
                        System.out.println(" _____");
                        System.out.println("|J  ww|");
                        System.out.println("| o {)|");
                        System.out.println("|o o% |");
                        System.out.println("| | % |");
                        System.out.println("|__%%[|");                    
                    }
                    else if(getRank() == 12) {
                        System.out.println(" _____");
                        System.out.println("|Q  ww|");
                        System.out.println("| o {(|");
                        System.out.println("|o o%%|");
                        System.out.println("| |%%%|");
                        System.out.println("|_%%%O|");                    
                    }
                    else if(getRank() == 13) {
                        System.out.println(" _____");
                        System.out.println("|K  ww|");
                        System.out.println("| o {)|");
                        System.out.println("|o o%%|");
                        System.out.println("| |%%%|");
                        System.out.println("|_%%%>|");                     
                    }
                 }
                if(getSuit() == 'S' || getSuit() == 's') {
                    if(getRank() == 1) {     
                        System.out.println(" _____");
                        System.out.println("|A .  |");
                        System.out.println("| /.\\ |"); 
                        System.out.println("|(_._)|");
                        System.out.println("|  |  |");
                        System.out.println("|____V|");
                    }
                    else if(getRank() == 2) {
                        System.out.println(" _____");
                        System.out.println("|2    |");
                        System.out.println("|  ^  |");
                        System.out.println("|     |");
                        System.out.println("|  ^  |");
                        System.out.println("|____Z|");                    
                    }
                    else if(getRank() == 3) {
                        System.out.println(" _____");
                        System.out.println("|3    |");
                        System.out.println("| ^ ^ |");
                        System.out.println("|     |");
                        System.out.println("|  ^  |");
                        System.out.println("|____E|");                    
                    }
                    else if(getRank() == 4) {
                        System.out.println(" _____");
                        System.out.println("|4    |");
                        System.out.println("| ^ ^ |");
                        System.out.println("|     |");
                        System.out.println("| ^ ^ |");
                        System.out.println("|____h|");                     
                    }
                    else if(getRank() == 5) {
                        System.out.println(" _____");
                        System.out.println("|5    |");
                        System.out.println("| ^ ^ |");
                        System.out.println("|  ^  |");
                        System.out.println("| ^ ^ |");
                        System.out.println("|____S|");                     
                    }
                    else if(getRank() == 6) {
                        System.out.println(" _____");
                        System.out.println("|6    |");
                        System.out.println("| ^ ^ |");
                        System.out.println("| ^ ^ |");
                        System.out.println("| ^ ^ |");
                        System.out.println("|____9|");                     
                    }
                    else if(getRank() == 7) {
                        System.out.println(" _____");
                        System.out.println("|7    |");
                        System.out.println("| ^ ^ |");
                        System.out.println("|^ ^ ^|");
                        System.out.println("| ^ ^ |");
                        System.out.println("|____L|");                      
                    }
                    else if(getRank() == 8) {
                        System.out.println(" _____");
                        System.out.println("|8    |");
                        System.out.println("|^ ^ ^|");
                        System.out.println("| ^ ^ |");
                        System.out.println("|^ ^ ^|");
                        System.out.println("|____8|");                     
                    }
                    else if(getRank() == 9) {
                        System.out.println(" _____");
                        System.out.println("|9    |");
                        System.out.println("|^ ^ ^|");
                        System.out.println("|^ ^ ^|");
                        System.out.println("|^ ^ ^|");
                        System.out.println("|____6|");                    
                    }
                    else if(getRank() == 10) {
                        System.out.println(" _____");
                        System.out.println("|10 ^ |");
                        System.out.println("|^ ^ ^|");
                        System.out.println("|^ ^ ^|");
                        System.out.println("|^ ^ ^|");
                        System.out.println("|___0I|");                    
                    }
                    else if(getRank() == 11) {
                        System.out.println(" _____");
                        System.out.println("|J  ww|");
                        System.out.println("| ^ {)|");
                        System.out.println("|(.)% |");
                        System.out.println("| | % |");
                        System.out.println("|__%%[|");                    
                    }
                    else if(getRank() == 12) {
                        System.out.println(" _____");
                        System.out.println("|Q  ww|");
                        System.out.println("| ^ {)|");
                        System.out.println("|(.)%%|");
                        System.out.println("| |%%%|");
                        System.out.println("|_%%%O|");                    
                    }
                    else if(getRank() == 13) {
                        System.out.println(" _____");
                        System.out.println("|K  ww|");
                        System.out.println("| ^ {)|");
                        System.out.println("|(.)%%|");
                        System.out.println("| |%%%|");
                        System.out.println("|_%%%>|");                     
                    }
                }
                if(getSuit() == 'H' || getSuit() == 'h') {
                    if(getRank() == 1) {     
                        System.out.println(" _____");
                        System.out.println("|A_ _ |");
                        System.out.println("|( v )|");
                        System.out.println("| \\ / |");
                        System.out.println("|  o  |");
                        System.out.println("|____V|");
                    }
                    else if(getRank() == 2) {
                        System.out.println(" _____");
                        System.out.println("|2    |");
                        System.out.println("|  o  |");
                        System.out.println("|     |");
                        System.out.println("|  o  |");
                        System.out.println("|____Z|");                    
                    }
                    else if(getRank() == 3) {
                        System.out.println(" _____");
                        System.out.println("|3    |");
                        System.out.println("| o o |");
                        System.out.println("|     |");
                        System.out.println("|  o  |");
                        System.out.println("|____E|");                    
                    }
                    else if(getRank() == 4) {
                        System.out.println(" _____");
                        System.out.println("|4    |");
                        System.out.println("| o o |");
                        System.out.println("|     |");
                        System.out.println("| o o |");
                        System.out.println("|____h|");                     
                    }
                    else if(getRank() == 5) {
                        System.out.println(" _____");
                        System.out.println("|5    |");
                        System.out.println("| o o |");
                        System.out.println("|  o  |");
                        System.out.println("| o o |");
                        System.out.println("|____S|");                     
                    }
                    else if(getRank() == 6) {
                        System.out.println(" _____");
                        System.out.println("|6    |");
                        System.out.println("| o o |");
                        System.out.println("| o o |");
                        System.out.println("| o o |");
                        System.out.println("|____9|");                     
                    }
                    else if(getRank() == 7) {
                        System.out.println(" _____");
                        System.out.println("|7    |");
                        System.out.println("| o o |");
                        System.out.println("|o o o|");
                        System.out.println("| o o |");
                        System.out.println("|____L|");                      
                    }
                    else if(getRank() == 8) {
                        System.out.println(" _____");
                        System.out.println("|8    |");
                        System.out.println("|o o o|");
                        System.out.println("| o o |");
                        System.out.println("|o o o|");
                        System.out.println("|____8|");                     
                    }
                    else if(getRank() == 9) {
                        System.out.println(" _____");
                        System.out.println("|9    |");
                        System.out.println("|o o o|");
                        System.out.println("|o o o|");
                        System.out.println("|o o o|");
                        System.out.println("|____6|");                    
                    }
                    else if(getRank() == 10) {
                        System.out.println(" _____");
                        System.out.println("|10 o |");
                        System.out.println("|o o o|");
                        System.out.println("|o o o|");
                        System.out.println("|o o o|");
                        System.out.println("|___0I|");                    
                    }
                    else if(getRank() == 11) {
                        System.out.println(" _____");
                        System.out.println("|J  ww|");
                        System.out.println("|   {)|");
                        System.out.println("|(v)% |");
                        System.out.println("| v % |");
                        System.out.println("|__%%[|");                    
                    }
                    else if(getRank() == 12) {
                        System.out.println(" _____");
                        System.out.println("|Q  ww|");
                        System.out.println("|   {(|");
                        System.out.println("|(v)%%|");
                        System.out.println("| v%%%|");
                        System.out.println("|_%%%O|");                    
                    }
                    else if(getRank() == 13) {
                        System.out.println(" _____");
                        System.out.println("|K  ww|");
                        System.out.println("|   {)|");
                        System.out.println("|(v)%%|");
                        System.out.println("| v%%%|");
                        System.out.println("|_%%%>|");                     
                    }
                }
                if(getSuit() == 'D' || getSuit() == 'd') {
                    if(getRank() == 1) {     
                        System.out.println(" _____");
                        System.out.println("|A .  |");
                        System.out.println("| / \\ |");
                        System.out.println("| \\ / |");
                        System.out.println("|  .  |");
                        System.out.println("|____V|");
                    }
                    else if(getRank() == 2) {
                        System.out.println(" _____");
                        System.out.println("|2    |");
                        System.out.println("|  v  |");
                        System.out.println("|     |");
                        System.out.println("|  v  |");
                        System.out.println("|____Z|");                    
                    }
                    else if(getRank() == 3) {
                        System.out.println(" _____");
                        System.out.println("|3    |");
                        System.out.println("| v v |");
                        System.out.println("|     |");
                        System.out.println("|  v  |");
                        System.out.println("|____E|");                    
                    }
                    else if(getRank() == 4) {
                        System.out.println(" _____");
                        System.out.println("|4    |");
                        System.out.println("| v v |");
                        System.out.println("|     |");
                        System.out.println("| v v |");
                        System.out.println("|____h|");                     
                    }
                    else if(getRank() == 5) {
                        System.out.println(" _____");
                        System.out.println("|5    |");
                        System.out.println("| v v |");
                        System.out.println("|  v  |");
                        System.out.println("| v v |");
                        System.out.println("|____S|");                     
                    }
                    else if(getRank() == 6) {
                        System.out.println(" _____");
                        System.out.println("|6    |");
                        System.out.println("| v v |");
                        System.out.println("| v v |");
                        System.out.println("| v v |");
                        System.out.println("|____9|");                     
                    }
                    else if(getRank() == 7) {
                        System.out.println(" _____");
                        System.out.println("|7    |");
                        System.out.println("| v v |");
                        System.out.println("|v v v|");
                        System.out.println("| v v |");
                        System.out.println("|____L|");                      
                    }
                    else if(getRank() == 8) {
                        System.out.println(" _____");
                        System.out.println("|8    |");
                        System.out.println("|v v v|");
                        System.out.println("| v v |");
                        System.out.println("|v v v|");
                        System.out.println("|____8|");                     
                    }
                    else if(getRank() == 9) {
                        System.out.println(" _____");
                        System.out.println("|9    |");
                        System.out.println("|v v v|");
                        System.out.println("|v v v|");
                        System.out.println("|v v v|");
                        System.out.println("|____6|");                    
                    }
                    else if(getRank() == 10) {
                        System.out.println(" _____");
                        System.out.println("|10 v |");
                        System.out.println("|v v v|");
                        System.out.println("|v v v|");
                        System.out.println("|v v v|");
                        System.out.println("|___0I|");                    
                    }
                     else if(getRank() == 11) {
                        System.out.println(" _____");
                        System.out.println("|J  ww|");
                        System.out.println("| /\\{)|");
                        System.out.println("| \\/% |");
                        System.out.println("|   % |");
                        System.out.println("|__%%[|");                    
                    }
                    else if(getRank() == 12) {
                        System.out.println(" _____");
                        System.out.println("|Q  ww|");
                        System.out.println("| /\\{(|");
                        System.out.println("| \\/%%|");
                        System.out.println("|  %%%|");
                        System.out.println("|_%%%O|");                    
                    }
                    else if(getRank() == 13) {
                        System.out.println(" _____");
                        System.out.println("|K  ww|");
                        System.out.println("| /\\{)|");
                        System.out.println("| \\/%%|");
                        System.out.println("|  %%%|");
                        System.out.println("|_%%%>|");                     
                    }
                } 
            }
             // thank you ejm98 on asciiart.eu for the card art 
    }
}