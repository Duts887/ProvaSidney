import java.util.List;

public class AnalisadorLexico {

	public AnalisadorLexico() {
		// TODO Auto-generated constructor stub
	}
	
	public void analisar(String linea, List<String> alfabeto) {
		String caracteres = alfabeto.get(0); 
	
		for(int i =0; i < linea.length(); i++) {
			char letra = linea.charAt(i);
			Boolean error = true;
			for(int j =0; j < caracteres.length(); j++) {
				//System.out.println("Comparando:"+letra+" com "+ caracteres.charAt(i));
				if (letra == caracteres.charAt(j)) {
					error = false;
				}
			}
			if (error) {
				System.out.println("Carácter inválido: " + letra);
				return;
			}
			
		}
		System.out.println("Análisis léxico exitoso.");
	}	

}
