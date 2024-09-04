import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList; //using ArrayLists in this one
public class TexasHoldEmWithTheStars
{
    public static void main(String [] args)
             throws FileNotFoundException,InterruptedException
    {     
        ArrayList<Card> deck = new ArrayList<Card>();
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Card> playerHand = new ArrayList<Card>();
        ArrayList<Card> computerHand = new ArrayList<Card>();
        ArrayList<Card> community = new ArrayList<Card>();
        int playerScore = 0;
        int computerScore = 0;
        makeDeck(deck);
        System.out.println("Dealing::::::");
        System.out.println("");
        
        cardDeal(2, deck, playerHand); //deals 2 cards from deck to the playerHand
        cardDeal(2, deck, computerHand); //same for the computerHand
        cardDeal(5, deck, community); //deals 5 cards to the community hand
        playerHand.get(0).setFaceDown(false);
        playerHand.get(1).setFaceDown(false);
        
        waitSeconds(1);
        System.out.println("Hey");
        
        waitSeconds(1);
        int whichFace = randomInt(0,3);
        creepyFace(whichFace);
        String enemyName = weirdName(whichFace);
        
        waitSeconds(2);
        System.out.println("My name's " + enemyName);
        waitSeconds(1);
        System.out.println("Don't ya wanna look at yer hand");
        System.out.println("Yes or No?");
        String answer1 = keyboard.next();
        //the the star wonders why you aren't looking at your cards
        if (answer1.equals("yes") == true || answer1.equals("Yes") == true){
            printHand(playerHand);
            waitSeconds(2);
            System.out.println("\n\nWow \n great!");
                waitSeconds(1);
                System.out.println("great choice");
        }
        else{
               System.out.println("Confident. \n Sure you don't want to say 'yes'?"); 
            
            String answer2 = keyboard.next();
            waitSeconds(1);
            System.out.println(".....");
            waitSeconds(1);
            if (answer2.isEmpty() == false){
                System.out.println("");
                printHand(playerHand);
            }
            waitSeconds(1);
            if(answer2.equals("yes") == true || answer2.equals("Yes") == true){
                System.out.println("Wow \n great!");
                waitSeconds(1);
                System.out.println("great choice");
            }
            else{
                System.out.println("But... you just looked...");
                waitSeconds(3);
                System.out.println("Are you still looking??");
            }
        }
        //the community cards are shown face down first then you get to bet
        waitSeconds(1);
        
        System.out.println("\n\nDealing the community cards");
        printHand(community);
        System.out.println("Dealer: \n All of the community cards are face down");
        System.out.println("Dealer: \n Place your initial bets.");
        //betting is completely pointless
        int bet = keyboard.nextInt();
        waitSeconds(1);
        System.out.println("You bet " + bet + "\nand " + enemyName + " bet " + bet*2);
        int pot = bet*3;
        
        waitSeconds(1);
        creepyFace(whichFace);
        waitSeconds(2);
        System.out.println("what can I say? \n I'm kind of a high roller");
        //Three of the community cards get turned over
        waitSeconds(2);
        System.out.println("\n\nDealer: \n It's time for The Flop");
        community.get(0).setFaceDown(false);
        community.get(1).setFaceDown(false);
        community.get(2).setFaceDown(false);
        waitSeconds(1);
        printHand(community);
        
        System.out.println("Don't ya wanna look at yer hand");
        System.out.println("Yes or No?");
        String answer3 = keyboard.next();
        if(answer3.equals("yes") == true || answer3.equals("Yes") == true){
            printHand(playerHand);
        }
        System.out.println("Dealer: \n Place your bets.");
        bet = keyboard.nextInt();
        System.out.println("You bet " + bet + "\nand " + enemyName + " bet " + bet*2);
        pot += bet*3;
        
        waitSeconds(1);
        creepyFace(whichFace);
        System.out.println("Wow");
        waitSeconds(2);
        System.out.println("so exciting");
        System.out.println("");
        waitSeconds(1);
        
        //Another community card is shown
        System.out.println("Dealer: \n Bets are closed.");
        waitSeconds(1);
        System.out.println("Dealer: \n It's time for The Turn");
        waitSeconds(1);
        community.get(3).setFaceDown(false);
        printHand(community);
        
        System.out.println("Don't ya wanna look at yer hand");
        System.out.println("Yes or No?");
        String answer4 = keyboard.next();
        if(answer4.equals("yes") == true || answer4.equals("Yes") == true){
            printHand(playerHand);
        }
        waitSeconds(3);
        System.out.println("Dealer: \n Place your final bets.");
        bet = keyboard.nextInt();
        System.out.println("You bet " + bet + "\nand " + enemyName + " bet " + bet*2);
        pot += bet*3;
        
        waitSeconds(1);
        creepyFace(whichFace);
        System.out.println("Man");
        waitSeconds(2);
        System.out.println("Maybe I shouldn't have bet so much...");
        waitSeconds(1);
        
        System.out.println("Dealer: \n Bets are closed.");
        waitSeconds(1);
        System.out.println("Dealer: \n It's time for The River");
        waitSeconds(1);
        //all the community cards are shown
        community.get(4).setFaceDown(false);
        printHand(community);
        
        System.out.println("Time to show your hands, folks");
        waitSeconds(1);
        System.out.println("Your Hand:");
        printHand(playerHand);
        
        //everyone has to show their cards
        computerHand.get(0).setFaceDown(false);
        computerHand.get(1).setFaceDown(false);
        waitSeconds(1);
        creepyFace(whichFace);
        System.out.println("Well");
        waitSeconds(2);
        System.out.println("Here goes nothing");
        waitSeconds(1);
        System.out.println(enemyName + "'s Hand:");
        printHand(computerHand);
        System.out.println("");
        waitSeconds(2);
        
        //both hands are calculated with the community cards
        playerScore = score(playerHand, community);
        computerScore = score(computerHand, community);
        if(playerScore == 90){
            System.out.println("You got a Straight Flush!");
        }
        else if(playerScore == 80){
            System.out.println("You got a Four of a Kind!");
        }
        else if(playerScore == 70){
            System.out.println("You got a Full House!");
        }
        else if(playerScore == 60){
            System.out.println("You got a Flush!");
        }
        else if(playerScore == 50){
            System.out.println("You got a Straight!");
        }
        else if(playerScore == 40){
            System.out.println("You got a Three of a Kind!");
        }
        else if(playerScore == 30){
            System.out.println("You got a Two Pair!");
        }
        else if(playerScore == 20){
            System.out.println("You got a Pair!");
        }
        System.out.println("");
        waitSeconds(1);
        
        if (playerScore < computerScore){
            waitSeconds(1);
            creepyFace(whichFace);
            System.out.println("Well, looks like I got it this time");
            waitSeconds(2);
            System.out.println("you did a great job though \n you can always try again.");
            waitSeconds(1);
        }
        else{
            waitSeconds(1);
            creepyFace(whichFace);
            System.out.println("Ah Beans, looks like you got it this time");
            waitSeconds(2);
            System.out.println("you did a great job \n it was truly an honor to battle to the death or whatever");
            waitSeconds(1); 
        }
        
        System.out.println("\nThank you for playing!");
    }
 
    public static void makeDeck(ArrayList<Card> deck) 
            throws FileNotFoundException //the makeDeck method from Assign 14 already seemed pretty good
    {
        // make a Scanner inputFile and connect to file cards.txt
        Scanner inputFile = new Scanner(new File("cards.txt"));    
        
        int k = 0;
        // while loop, as long as k<52 AND there is more info in file
        while ( k < 52 && inputFile.hasNext()){
            // read a char from the file, store in suit
            char suit = inputFile.next().charAt(0);
            // read an int from the file, store in rank
            int rank = inputFile.nextInt();
            
            boolean faceDown = true; //the true makes sure all cards automatically start face down
            // make a Card temp a new Card with the suit and rank you read
            Card temp = new Card(suit,rank,faceDown);
            // assign temp to the next location in the deck array
            deck.add(temp);
            // add 1 to k for next time around
            k++;
        }
        //this fills the discard pile with empty cards to avoid out of bounds exceptions
        while ( k < 104){
            Card dummyCard = new Card('X',0,true);
            deck.add(dummyCard);
            k++;
        }
    }
    
    public static Card deal(ArrayList<Card> deck)
            throws FileNotFoundException
    {
        int rand;
        Card tempCard;
        //once the deck is exactly double sized then all cards have been discarded
        //this clears the deck and makes a new one
        if (discardDeckCheck(deck) == true){
            deck.clear();
            makeDeck(deck);
        }
        //This loop checks to see if a card has already been drawn
        //I tried just removing the card from the deck but randomInt
        //would sometimes generate numbers of cards that weren't contained
        //in the arraylist anymore and throw an exception
        do{
            // use the randomInt method to generate 
            // a random integer between 0 (inclusive) to 52 (exclusive)
            rand = randomInt(0,52);
            // store the card at your randomIndex into a tempCard variable.
            tempCard = deck.get(rand);
        }while(deck.lastIndexOf(tempCard) >= 52);
        //cards at index above 51 are in the discard pile
        //so a discarded ace of clubs is at index 52
        deck.set(rand + 52, tempCard);
        
        
        
        // return your tempCard 
        
        return tempCard; 
    }
    //this method checks if the discard pile is full and if the deck needs to
    //be reshuffled
    public static boolean discardDeckCheck(ArrayList<Card> deck){
        for (int i = 0; i < 52; i++){
            if (deck.get(i) != deck.get(i+52)){
                return false;
            }
            
        }
        return true;
    }
    
    public static int randomInt(int low, int high) {
        // returns a random int from low (inclusive) to high (exclusive)
        // Determine the span of the range.
                int range = high - low;
      
        // return a random number from the range.
            return (int)(range*Math.random()) + low;   
    } 
    
    public static int score(ArrayList<Card> hand, ArrayList<Card> community){
        ArrayList<Card> comboHand = new ArrayList<Card>();
        //this copies the community hand to the comboHand array        
        for (int i = 0; i < community.size(); i ++){
            comboHand.add(new Card(community.get(i).getSuit(),
                              community.get(i).getRank(),false));
        }
        int score = 0;
        //this adds the cards in the player hand to the comboHand
        comboHand.add(hand.get(0));
        comboHand.add(hand.get(1));
        //This checks if the comboHand satisfies any special poker hands
        //in order of highest scoring
        if(straightFlush(comboHand) == true){
            return 90;
        }
        else if(fourOfAKind(comboHand) == true){
            return 80;
        }
        else if(fullHouse(comboHand) == true){
            return 70;
        }
        else if(flush(comboHand) == true){
            return 60;
        }
        else if(straight(comboHand) == true){
            return 50;
        }
        else if(threeOfAKind(comboHand) == true){
            return 40;
        }
        else if(twoPair(comboHand) == true){
            return 30;
        }
        else if(onePair(comboHand) == true){
            return 20;
        }
        else{
            //if the comboHand has no special card combos then this nested
            //loop returns the high card
            for (int i = 0; i < comboHand.size(); i++){
                for (int k = 0; k < comboHand.size(); k++){
                    if (comboHand.get(i).getRank() >= comboHand.get(k).getRank()
                        && comboHand.get(i).getRank() >= score){
                        score = comboHand.get(i).getRank();
                    }
                
                }
            }
        }
        
        return score;
        
        
    }
    
    //this method sorts the comboHand so that only 5 of the same suit are
    //returned if the combohand can make a flush
    public static ArrayList<Card> flushSort(ArrayList<Card> comboHand){
        ArrayList<Card> clubHand = new ArrayList<Card>();
        ArrayList<Card> diamondHand = new ArrayList<Card>();
        ArrayList<Card> heartHand = new ArrayList<Card>();
        ArrayList<Card> spadeHand = new ArrayList<Card>();
        ArrayList<Card> dummyHand = new ArrayList<Card>();
        for (int i = 0; i < comboHand.size();i++){
            if (comboHand.get(i).getSuit() == 'C'){
                clubHand.add(comboHand.get(i));
            }
            else if (comboHand.get(i).getSuit() == 'D'){
                diamondHand.add(comboHand.get(i));
            }
            else if (comboHand.get(i).getSuit() == 'H'){
                heartHand.add(comboHand.get(i));
            }
            else{
                spadeHand.add(comboHand.get(i));
            }
        }
        
        if (clubHand.size() >= 5){
            return clubHand;
        }
        if (diamondHand.size() >= 5){
            return diamondHand;
        }
        if (heartHand.size() >= 5){
            return heartHand;
        }
        if (spadeHand.size() >= 5){
            return spadeHand;
        }
        return dummyHand;
    }
    //This checks if the comboHand contains a flush
    public static boolean flush(ArrayList<Card> comboHand){
        comboHand =flushSort(comboHand);
        if (comboHand.size() >= 5){
            return true;
        }
        return false;
    }
    
    
    //a method that returns the cards in Hand in order of rank
    //but doesn't retain cards of the same rank
    public static ArrayList<Card> orderHand(ArrayList<Card> hand){
        ArrayList<Card> orderedHand = new ArrayList<Card>();
        while(orderedHand.size() < 7){
            orderedHand.add(new Card('X',1,true));
        }
        int handPlacement = 0;
        for (int i = 0; i < hand.size(); i++){
            for (int k = 0; k < hand.size(); k++){
                if (hand.get(i).getRank() >= hand.get(k).getRank()){
                    handPlacement++;
                }
            }
            if (hand.get(i).getRank() != orderedHand.get(i).getRank() ){
                orderedHand.set(handPlacement-1,hand.get(i));
                //hand.remove(smallCard);
            }
            
            handPlacement = 0;
        }
        for (int i = 0; i < orderedHand.size(); i++){
            if (orderedHand.get(i).getSuit() == 'X'){
                orderedHand.remove(orderedHand.get(i));
            }
        }
        return orderedHand;
    }
    
    public static boolean straight(ArrayList<Card> hand){
        hand = orderHand(hand); // passes the arg to get ordered 
        for (int i = 0; i < hand.size() - 4; i++){
            if (hand.get(i).getRank() == hand.get(i+1).getRank()-1 &&
                hand.get(i+1).getRank() == hand.get(i+2).getRank() -1){
                if (hand.get(i+2).getRank() == hand.get(i+3).getRank()-1 &&
                    hand.get(i+3).getRank() == hand.get(i+4).getRank()-1){
                        return true;
                }
            }
        }
        return false;
    }
    
    public static boolean straightFlush(ArrayList<Card> hand){
        hand = flushSort(hand);
        if (straight(hand) == true){
            return true;
        }
        return false;
    }
    
    //this method checks for four of a kind hands
    public static boolean fourOfAKind(ArrayList<Card> hand){
        int ofAKind = 0; //this will count how many times a rank appears in a hand
        
        //This nested for loop counts the first 4 cards in the hand against
        //every other card in the hand
        for (int i = 0; i < hand.size() - 3; i++){
            for (int k = 0; k < hand.size(); k++){
                if (hand.get(i).getRank() == hand.get(k).getRank()){
                    //if more than one card has the same rank in hand
                    //this number goes up
                    ofAKind++;
                }
            } 
            //if you had four or more cards of identical rank the method returns true
            if (ofAKind >= 4){ 
            return true;
            }
            //if you had less than four this resets the count for the next
            //card in hand
            ofAKind = 0;
        }
        //if your hand had no 4 of a kinds then the method returns false
        return false;
    }
    
    public static boolean threeOfAKind(ArrayList<Card> hand){
        int ofAKind = 0; //this will count how many times a rank appears in a hand
        
        //This nested for loop counts the first 4 cards in the hand against
        //every other card in the hand
        for (int i = 0; i < hand.size() - 2; i++){
            for (int k = 0; k < hand.size(); k++){
                if (hand.get(i).getRank() == hand.get(k).getRank()){
                    //if more than one card has the same rank in hand
                    //this number goes up
                    ofAKind++;
                }
            } 
            //if you had four or more cards of identical rank the method returns true
            if (ofAKind == 3){ 
            return true;
            }
            //if you had less than four this resets the count for the next
            //card in hand
            ofAKind = 0;
        }
        //if your hand had no 4 of a kinds then the method returns false
        return false;
    }
    
    public static boolean fullHouse(ArrayList<Card> hand){
        ArrayList<Card> fullHouseHand = new ArrayList<Card>();
        for (int i = 0; i < hand.size(); i ++){
            fullHouseHand.add(new Card(hand.get(i).getSuit(),
                              hand.get(i).getRank(),true));
        }
        int ofAKind = 0; //this will count how many times a rank appears in a hand
        int partOne = 0;
        //This nested for loop counts the first 4 cards in the hand against
        //every other card in the hand
        for (int i = 0; i < hand.size() - 4; i++){
            for (int k = 0; k < hand.size(); k++){
                if (hand.get(i).getRank() == hand.get(k).getRank()){
                    //if more than one card has the same rank in hand
                    //this number goes up
                    ofAKind++;
                }
            } 
            if (ofAKind == 3){ 
                for (int count = 0; count < fullHouseHand.size(); count++){
                    if (fullHouseHand.get(count).getRank() == hand.get(i).getRank()){
                        fullHouseHand.remove(count);
                        partOne++;
                    }
                }
                if (onePair(fullHouseHand) == true && partOne == 3){
                            return true;
                }
            }
            //if you had less than four this resets the count for the next
            //card in hand
            ofAKind = 0;
        }
        
        return false;
    }
    public static boolean twoPair(ArrayList<Card> hand){
        ArrayList<Card> twoPairHand = new ArrayList<Card>();
        for (int i = 0; i < hand.size(); i ++){
            twoPairHand.add(new Card(hand.get(i).getSuit(),
                              hand.get(i).getRank(),true));
        }
        int ofAKind = 0; //this will count how many times a rank appears in a hand
        int partOne = 0;// I had to make this so you could make sure you had more than one pair
        //This nested for loop is a slightly modified version of the fourOfAKind method
        for (int i = 0; i < hand.size() - 1; i++){
            for (int k = 0; k < hand.size(); k++){
                if (hand.get(i).getRank() == hand.get(k).getRank()){
                    //if more than one card has the same rank in hand
                    //this number goes up
                    ofAKind++;
                }
            } 
            if (ofAKind == 2){ 
                for (int count = 0; count < twoPairHand.size(); count++){
                    if (twoPairHand.get(count).getRank() == hand.get(i).getRank()){
                        twoPairHand.remove(count);
                        partOne++;
                    }
                }
                if (onePair(twoPairHand) == true && partOne == 2){
                            return true;
                }
            }
            //if you had less than four this resets the count for the next
            //card in hand
            ofAKind = 0;
        }
        
        return false;
    }
    //this method uses a bunch of loops to see if your combohand has a 
    //two of a kind
    public static boolean onePair(ArrayList<Card> hand){
        int ofAKind = 0;
        for (int i = 0; i < hand.size(); i++){
            for (int k = 0; k < hand.size(); k++){
                if (hand.get(i).getRank() == hand.get(k).getRank()){
                    //if more than one card has the same rank in hand
                    //this number goes up
                    ofAKind++;
                }
            } 
            //if you had two or more cards of identical rank the method returns true
            if (ofAKind == 2){ 
            return true;
            }
            //if you had less than four this resets the count for the next
            //card in hand
            ofAKind = 0;
        }
        return false;
    }
   
    //this method prints the card art and card names with a little delay
    //between cards
    public static void printHand(ArrayList<Card> hand)
                        throws InterruptedException
    {
       for (int i = 0; i < hand.size(); i++){
           waitSeconds(.5);
           hand.get(i).printAscii(); //displays ascii card art
    
           if (hand.get(i).getFaceDown() == false){
               hand.get(i).print();
           }       
        } 
    }
    
    //this method lets you decide the amount of cards delt a hand or the 
    //community cards
    public static void cardDeal(int dealNum,ArrayList<Card> deck,
                                ArrayList<Card> hand)
                                
                        throws FileNotFoundException
    {
        for (int i = 0; i < dealNum; i++){
            hand.add(deal(deck));
        }
    }
    
    //this method makes the program wait for a certain amount of seconds
    //to keep the pace of text more enjoyable
    public static void waitSeconds(double second)
                            throws InterruptedException
    {
        int seconds = (int)(second*1000);
        Thread.sleep(seconds);
        
    }
    
    
    //This prints the creepy face of the stars based on a RNG
    public static void creepyFace(int whichFace){
        
        if(whichFace == 0){
            
            System.out.println("      ***\n    ******* \n   ********* \n/\\* ### ### */\\");
            System.out.println("|    @ / @    |\n\\/\\    ^    /\\/\n   \\  ===  /");
            System.out.println("    \\_____/\n     _|_|_\n  *$$$$$$$$$*");
        }
        if(whichFace == 1){
            
            System.out.println("  @@@@@@@\n  @@  @@@@\n @@    @@@\n @ 0  0 @@@");  
            System.out.print("@@  I   @@@@\n@@      @@@@\n@@  ==  @@@");
            System.out.print("\n @+     @@\n @+++  +@@");
            System.out.println("");
        }
        if(whichFace == 2){
            
            System.out.println("#############\n##         ##\n#  ~~   ~~  #");
            System.out.print("# (.)   (.) #\n(     ^     )\n |         | ");
            System.out.print("\n |  {===}  | \n  \\       /\n /  -----  \\");
            System.out.println("");
        }
        
    }
    
    //The secret's out! This returns the name of the stars based on the same
    //random number that chose their face
    public static String weirdName(int whichFace){
        if(whichFace == 0){
            return "Brod Pitt";
        }
        if(whichFace == 1){
            return "Robert Paddingson";
        }
        else{
            return "\"George Clooney\" the Third";
        }
    }
    public static void methodTest(ArrayList<Card> hand,ArrayList<Card> deck)
                        throws FileNotFoundException,InterruptedException
    {
        do{
            hand.clear();
            cardDeal(7,hand,deck);
    
        }while(twoPair(hand) == false);
          System.out.println("NORMIE HAND:::::");
          printHand(hand); 
    }
}

