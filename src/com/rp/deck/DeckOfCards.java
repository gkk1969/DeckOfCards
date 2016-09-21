package com.rp.deck;

import com.rp.card.Card;
import com.rp.card.Rank;
import com.rp.card.Color;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by gkk1969 on 9/19/2016.
 */
public class DeckOfCards extends ArrayList<Card>
{

    public DeckOfCards(int initialCapacity) {
        super(initialCapacity);
        initializeDeck();
    }

    public DeckOfCards() {
        super();
        initializeDeck();
    }

    public DeckOfCards(Collection<? extends Card> c) {
        super(c);
        initializeDeck();
    }

    /*
     * Shuffling is a procedure used to randomize a deck of playing cards to provide an element of chance in card games.
     */
    public void shuffle() throws Exception
    {
        ensureDeckNotEmpty();

        // Implementing Fisher–Yates shuffle
        Random rnd = ThreadLocalRandom.current();
        for (int i = size() - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            Card c1 = get(index);
            Card c2 = get(i);
            swap(c1, c2);
        }
    }

    /*
     * Dealing a card from a deck of cards. We make the assumption that a card dealer will arbitrarily choose
     * a card from the deck to deal.
     */
    public Card dealOneCard() throws EmptyDeckException
    {
        ensureDeckNotEmpty();

        Card cardToDeal = chooseCardRandomly();
        remove(cardToDeal);
        return cardToDeal;
    }

    /*
     * Swaps cards' properties (of rank and color).
     */
    protected void swap(Card c1, Card c2)
    {
        Rank rank;
        Color color;

        rank = c1.getRank();
        c1.setRank(c2.getRank());
        c2.setRank(rank);

        color = c1.getColor();
        c1.setColor(c2.getColor());
        c2.setColor(color);
    }

    protected void initializeDeck(){}

    protected Card chooseCardRandomly()
    {
        Random rand = new Random();
        return get(rand.nextInt(size()));
    }

    private void ensureDeckNotEmpty() throws EmptyDeckException
    {
        if (size() == 0)
        {
            throw new EmptyDeckException("The deck is empty! Nothing to shuffle!");
        }
    }

    @Override
    public String toString() {
        int numberOfCardsInDeck =  size();
        final StringBuffer sb = new StringBuffer("Deck{");
        for (int c = 0; c < numberOfCardsInDeck; c++) {
            sb.append(get(c));
            if (c < numberOfCardsInDeck -1 )
            {
                sb.append(',');
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
