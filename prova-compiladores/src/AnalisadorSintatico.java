import java.util.List;

public class AnalisadorSintatico {

	public AnalisadorSintatico() {
		// TODO Auto-generated constructor stub
	}
	
	public void analisar(String linea, List<String> expresiones) {
		boolean resultado = false;
		for (int i = 0; i < expresiones.size(); i++) {
			if (linea.trim().matches(expresiones.get(i))) {
				System.out.println(linea + ": ok");
				return;
			}
			//System.out.println(expresiones.get(i));
		}
		if (resultado) {
			System.out.println(linea + ": ok");
		} else {
			System.out.println("Error en la línea: " + linea);
		}
		
		return;
	}
	

}
