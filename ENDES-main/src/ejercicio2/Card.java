package ejercicio2;

public class Card {
	//variable de carta y el valor
	public String suit; 
	public String value;
	
	//Inicia la carta y valor especifico 
	public Card (String suit, String value) {
		this.suit = suit;
		this.value = value;
	}
	//Pone en texto de carta
	//el return es el formato suit-value
	public String toString () {
		return (this.suit+"-"+this.value);
	}
}
