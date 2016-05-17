package arif.nyit.morse;

public class Letter implements Comparable {
	protected char[] morseCode;
	protected char letter;
	protected int value;
	
	
	public Letter(char letter, char[] morseCode) {
		this.letter = letter;
		this.morseCode = morseCode;
	}
	
	public String toString() {
		return String.valueOf(letter);
	}
	
	public char[] getMorseCode() {
		return morseCode;
	}


	public void setMorseCode(char[] morseCode) {
		this.morseCode = morseCode;
	}


	public char getLetter() {
		return letter;
	}


	public void setLetter(char letter) {
		this.letter = letter;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	@Override
	public int compareTo(Object o) {
		
		return 0;
	}
}
