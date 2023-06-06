import java.util.Scanner;

public class GeradorByteCode {

	public GeradorByteCode() {
		// TODO Auto-generated constructor stub
	}
	
	public String generar(String linea) {
		String[] token = linea.split(" ");
		
		if (token[0].equals("aquí")){
			return "int " + token[1];
		}
		if (token[0].equals("int")) {
			return "int " + token[1];
		}
		
		if (token[0].equals("leer")) {
			return token[1].replace(";","") + "=teclado.nextInt();";
		}
		if (token[0].equals("por"))
			return token[0] + " " + token[1] + " " + token[2] + " " + token[3] + " " + token[4] + " " + token[5] + " " + token[6];
		
		if (token[0].equals("si"))
			return token[0] + " " + token[1] + " " + token[2] + " " + token[3] + " " + token[4];
		
		if (token[0].equals("presionar"))
			return token[0] + " " + token[1];
		
		if (token[0].equals("finhalto"))
			return token[0] + " " + token[1];
		
		if (token[0].equals("finhalto"))
			return token[0] + " " + token[1];
		
		if (token[0].equals("poner"))F
			return token[0] + " " + token[1];
		
		if (token[0].equals("regresar"))
			return token[0] + " " + token[1];
		
		
		return "";
		
	}
	

}
