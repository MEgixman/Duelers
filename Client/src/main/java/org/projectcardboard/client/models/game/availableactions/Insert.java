package org.projectcardboard.client.models.game.availableactions;

import shared.models.card.Card;

public class Insert {
    private Card card;

    Insert(Card card) {
        this.card = card;
    }

    public Card getCard() {
        return card;
    }
}