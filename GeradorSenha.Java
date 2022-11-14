package GeradorSenha;

public class GeradorDeSenha {
	public static void main(String[] args) {
		String[] Letras = {
				"A", "B", "C", "D", "E", "F", "G", "H", "I", "J","K","L","M","N","O",
				"P","Q","R", "S", "T","U", "V","W", "X", "Y", "Z"};
		String[] Numeros = {
				"0","1","2","3","4","5","6","7","8","9","10"};
		
		String[] Especiais = {
				",", "!", "@", "#", "$", "%", "&", "*", "+", ">","<","/"};
		
		int umLenght = Letras.length;
		int doisLenght = Numeros.length;
		int tresLenght = Especiais.length;
		
		int rand1 = (int) (Math.random() * umLenght);
		int rand2 = (int) (Math.random() * doisLenght);
		int rand3 = (int) (Math.random() * tresLenght);
		
		String fraseSenha = Letras[rand1] + " " + 
		Numeros[rand2] + " " + Especiais[rand3];
		
		System.out.println("Your pass is: " + fraseSenha);

		
	}
}
