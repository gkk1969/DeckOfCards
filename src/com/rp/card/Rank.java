package com.rp.card;

/**
 * Created by gkk1969 on 9/20/2016.
 */
public enum Rank {
    Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King;

    @Override
    public String toString() {
        switch (this) {
            case Ace:
                return "Ace";
            case Two:
                return "2";
            case Three:
                return "3";
            case Four:
                return "4";
            case Five:
                return "5";
            case Six:
                return "6";
            case Seven:
                return "7";
            case Eight:
                return "8";
            case Nine:
                return "9";
            case Ten:
                return "10";
            case Jack:
                return "Jack";
            case Queen:
                return "Queen";
            case King:
                return "King";
            default:
                throw new IllegalArgumentException();
        }
    }
}
