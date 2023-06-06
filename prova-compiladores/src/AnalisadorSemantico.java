import java.util.ArrayList;
import java.util.List;

public class AnalisadorSemantico {

	public List<String> tabelaSimbolos;

public AnalisadorSemantico() {
	tabelaSimbolos = new ArrayList();
}

public void Analisar(String linea, List<String> dicionario) {
	linea = linea.replace(";","");
	String[] token = linea.split(" ");
	if (token[0].equals("entero") ||
		token[0].equals("int")) {
		// añadir a la tabla de símbolos
		if (estaEnTablaSimbolos(token[1].toString())) {
			System.out.println("Variable ya declarada: " + token[1]);
			return;
		}
		tabelaSimbolos.add(token[1]);
		return;
	}
	
	// recorrer todas las palabras de la línea
	for(int i=0; i<token.length; i++) {
		// verificar si es una variable
		if (esVariable(token[i].toString(), dicionario)) {
			if (estaEnTablaSimbolos(token[i].toString())) {
				return;
			} else {
				System.out.println("Variable no declarada: " + token[i]);
			}
		}
	}
}

public Boolean esVariable(String palabra, List<String> dicionario) {
	
	if(palabra.matches("[a-z][a-z0-9]{0,9}")) {
		for(int i=0; i<dicionario.size(); i++) {
			if (dicionario.get(i).toString().equals(palabra)) {
				return false;
			}
		}
		return true;			
	}
	return false;
}

public Boolean estaEnTablaSimbolos(String palabra) {
	
	for(int i=0; i<tabelaSimbolos.size(); i++) {
		if (tabelaSimbolos.get(i).toString().equals(palabra)){
			return true;
		}
	}
	return false;
}

}
