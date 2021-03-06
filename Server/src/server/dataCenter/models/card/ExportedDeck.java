package server.dataCenter.models.card;

import shared.models.card.Card;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ExportedDeck {
    private final String name;
    private String heroName;
    private final HashMap<String, Integer> otherCards = new HashMap<>();

    public ExportedDeck(Deck deck) {
        name = deck.getName();
        if (deck.getHero() != null) {
            heroName = deck.getHero().getName();
        }
        for (Card card : deck.getCards()) {
            otherCards.merge(card.getName(), 1, Integer::sum);
        }
    }

    public String getName() {
        return name;
    }

    public String getHeroName() {
        return heroName;
    }

    public Map<String, Integer> getOtherCards() {
        return Collections.unmodifiableMap(otherCards);
    }
}
