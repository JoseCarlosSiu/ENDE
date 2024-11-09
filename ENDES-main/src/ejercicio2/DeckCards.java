package ejercicio2;

import java.util.ArrayList;

//Crea y maneja un mazo de cartas, con funcionalidad para barajar y mostrar cartas.

public class DeckCards {
	//Punto de entrada
	public static void main(String[] args) {
		//define el palo y valores de las cartas
		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		//Crea una lista deck que puede almacenar objeto de card
		ArrayList<Card> deck = new ArrayList<Card>();

		//crea el mazo completo combinado palos y valores
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < values.length; j++) {
				Card card = new Card(suits[i], values[j]);//crea una nueva instancia de la clase Card y representa una carta en el mazo.
				deck.add(card);//Agrega un elemento al final de la lista deck
			}
		}
	    // Baraja el mazo mediante intercambio aleatorio
		for (int i = 0; i < deck.size(); i++) {
			int j = (int) Math.floor(Math.random() * i);//Genera un numero aleatorio entre 0 y i redondeando hacia abajo
			Card tmp = deck.get(i);
			deck.set(i, deck.get(j));
			deck.set(j, tmp);//Reemplaza el elemento en la posición i de la lista del tmp
		}
		// Me muestra las primeras cinco cartas del mazo barajado
		for (int i = 0; i < 5; i++) {
			System.out.println(deck.get(i));
		}

	}

}
