public class WarGame {
	public static void main(String[] args) {
		/////////////////SET UP/////////////////
		Deck deck = new Deck();
		deck.shuffle();
		Pile p1 = new Pile();
		Deck subDeck = deck.subDeck(0,25);
		p1.addDeck(subDeck);
		
		deck.shuffle();
		Pile p2 = new Pile();
		subDeck = deck.subDeck(26,51);
		p2.addDeck(subDeck);
		
		Pile midPile = new Pile ();
		
		Pile winP1 = new Pile();
		
		Pile winP2 = new Pile();
		
		while(!p1.isEmpty() && !p2.isEmpty()) {
			Card c1 = p1.popCard();
			Card c2 = p2.popCard();
			
			midPile.addCard(c1);
			midPile.addCard(c2);
			
			int cmpResult = c1.compareTo(c2);
			
			if(cmpResult > 0) {
				System.out.println("P1 took the hand!");
				winP1.addPile(midPile);
			}
			
			else if(cmpResult < 0) {
				System.out.println("P2 took the hand!");
				winP2.addPile(midPile);
			}
			else {
				System.out.println("Tie hand!");
			}
		}
		
		/////////////////CARDS ARE SPENT/////////////////
		if(winP1.size() > winP2.size()) {
			System.out.println("Player 1 WINS!");
		}
		
		else if (winP1.size() < winP2.size()) {
			System.out.println("Player 2 WINS!");
		}
		
		else {
			System.out.println("TIE!");
		}
		
//		Card card1 = new Card(11, 0);
//		System.out.println(card1);
//		Deck deck2 = new Deck();		
//		Pile pile = new Pile();
//		pile.addCard(deck.getCards()[0]); // this will take that card from 'deck' and add onto the pile arraylist.
//		System.out.println(pile);
//		Card myCard = pile.popCard(); //this will take the first card in the pile array and create a new 'Card' of that card.
		Deck hand = deck.subDeck(0, 13);
		Pile z1 = new Pile ();
		z1.addDeck(hand);
		System.out.println(z1);
	}
}