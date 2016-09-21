package com.rp.deck;

import com.rp.card.Card;
import com.rp.card.Rank;
import com.rp.card.Color;

/**
 * Created by gkk1969 on 9/19/2016.
 */
public class Standard52CardDeck extends DeckOfCards {

    protected static final Color[] CARD_COLORS =
            new Color[]
                    {
                            Color.Spades,
                            Color.Hearts,
                            Color.Diamonds,
                            Color.Clubs
                    };

    protected static final Rank[] CARD_RANKS =
            new Rank[]
                    {
                            Rank.Ace,
                            Rank.Two,
                            Rank.Three,
                            Rank.Four,
                            Rank.Five,
                            Rank.Six,
                            Rank.Seven,
                            Rank.Eight,
                            Rank.Nine,
                            Rank.Ten,
                            Rank.Jack,
                            Rank.Queen,
                            Rank.King
                    };

    protected void initializeDeck(){
        for (int cr = 0; cr < CARD_RANKS.length; cr++) {
            for (int cc = 0; cc < CARD_COLORS.length; cc++) {
                add(new Card(CARD_RANKS[cr], CARD_COLORS[cc]));
            }
        }
    }
}
