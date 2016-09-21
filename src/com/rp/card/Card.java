package com.rp.card;

import java.util.Objects;

/**
 * Created by gkk1969 on 9/19/2016.
 */
public class Card {

    // We assume that a card has the properties of rank and color

    private Rank rank;
    private Color color;

    public Card(Rank rank, Color color) {
        this.rank = rank;
        this.color = color;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(rank, card.rank) &&
                Objects.equals(color, card.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, color);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Card{");
        sb.append(rank);
        sb.append(" of ");
        sb.append(color);
        sb.append('}');
        return sb.toString();
    }
}
