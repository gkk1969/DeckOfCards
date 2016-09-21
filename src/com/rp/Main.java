package com.rp;

import com.rp.card.Card;
import com.rp.deck.DeckOfHearts;
import com.rp.deck.Standard52CardDeck;

import java.text.MessageFormat;

public class Main {

    public static void main(String[] args) {

        Standard52CardDeck s52dc = new Standard52CardDeck();
        System.out.println("-------------------------------");
        System.out.println("------- DECK OF CARDS  --------");
        System.out.println("-------------------------------");
        System.out.println();
        System.out.println("Deck Before shuffle: ");
        System.out.println();
        System.out.println(s52dc);
        System.out.println();
        try {
            s52dc.shuffle();
        }
        catch (Exception e)
        {
            System.err.println("Error shuffling deck!");
            System.out.println();
            System.err.println(e.getMessage());
            System.exit(1);
        }
        System.out.println("Deck After shuffle: ");
        System.out.println();
        System.out.println(s52dc);
        System.out.println();
        System.out.println("Deal One Card from Deck...");
        System.out.println();
        try {
            Card dealtCard = s52dc.dealOneCard();

            System.out.println(MessageFormat.format("Dealt Card: {0}", dealtCard));
            System.out.println();
        }
        catch (Exception e)
        {
            System.err.println("Error dealing one!");
            System.out.println();
            System.err.println(e.getMessage());
            System.exit(1);
        }
        System.out.println("Deck After Deal One: ");
        System.out.println();
        System.out.println(s52dc);
        System.out.println();

        DeckOfHearts doh = new DeckOfHearts();
        System.out.println("-------------------------------");
        System.out.println("------- DECK OF HEARTS  --------");
        System.out.println("-------------------------------");
        System.out.println();
        System.out.println("Deck Of Hearts: ");
        System.out.println();
        System.out.println(doh);
        System.out.println();
        try {
            doh.shuffle();
        }
        catch (Exception e)
        {
            System.err.println("Error shuffling deck of hearts!");
            System.out.println();
            System.err.println(e.getMessage());
            System.exit(1);
        }
        System.out.println("Deck of Hearts After shuffle: ");
        System.out.println();
        System.out.println(doh);
        System.out.println();
        System.out.println("Deal One Card from the Deck of Hearts...");
        System.out.println();
        try {
            Card dealtCard = doh.dealOneCard();

            System.out.println(MessageFormat.format("Dealt Card: {0}", dealtCard));
            System.out.println();
        }
        catch (Exception e)
        {
            System.err.println("Error dealing one from the deck of hearts!");
            System.out.println();
            System.err.println(e.getMessage());
            System.exit(1);
        }
        System.out.println("Deck of Hearts After Deal One: ");
        System.out.println();
        System.out.println(doh);
        System.out.println();
    }
}
