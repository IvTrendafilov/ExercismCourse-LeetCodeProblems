import java.util.Objects;

public class BlackJack {
    public static int parseCard(String card) {
        int points = 0;
        switch (card) {
            case "ace":
                points = 11;
                break;
            case "one":
                points = 1;
                break;
            case "two":
                points = 2;
                break;
            case "three":
                points = 3;
                break;
            case "four":
                points = 4;
                break;
            case "five":
                points = 5;
                break;
            case "six":
                points = 6;
                break;
            case "seven":
                points = 7;
                break;
            case "eight":
                points = 8;
                break;
            case "nine":
                points = 9;
                break;
            case "ten": case "jack": case "queen": case "king":
                points = 10;
                break;
            default:
                points = 0;
                break;
        }

        return points;
        //throw new UnsupportedOperationException("Please implement the Blackjack.parseCard method");
    }

    public static boolean isBlackjack(String card1, String card2) {

        boolean verify = false;

        if (parseCard(card1) + parseCard(card2) == 21){
            verify = true;
        }
        //throw new UnsupportedOperationException("Please implement the Blackjack.isBlackjack method");
        return verify;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        String res = "";
        if (isBlackjack){
            if (dealerScore< 10){
                res = "W";
            }
            else {
                res = "S";
            }
        } else{
            res = "P";
        }


        return res;
        // throw new UnsupportedOperationException("Please implement the Blackjack.largeHand method");
    }

    public String smallHand(int handScore, int dealerScore) {
        String res = "";
        if (handScore >= 17){
            res = "S";
        } else if (handScore <= 11) {
            res = "H";
        } else if (handScore>=12 && handScore <=16 && dealerScore <7) {
            res = "S";
        }else if (handScore>=12 && handScore <=16 && dealerScore >=7) {
            res = "H";
        }
        return res;
        //throw new UnsupportedOperationException("Please implement the Blackjack.smallHand method");
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }

    public static void main(String[] args) {
        System.out.println(parseCard("king"));
        System.out.println(isBlackjack("ace", "one"));

    }
}
