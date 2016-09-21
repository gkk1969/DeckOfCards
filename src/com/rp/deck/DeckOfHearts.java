package com.rp.deck;

import com.rp.card.Card;
import com.rp.card.Color;

/**
 * Created by gkk1969 on 9/20/2016.
 */
public class DeckOfHearts extends Standard52CardDeck {

    protected void initializeDeck() {
        for (int cr = 0; cr < CARD_RANKS.length; cr++) {
            add(new Card(CARD_RANKS[cr], Color.Hearts));
        }
    }
}