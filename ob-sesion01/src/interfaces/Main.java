package interfaces;

public interface Main {

	public static void main(String[] args) {
		
		String cadena = "Mensaje de texto";
		char primera = cadena.charAt(0);
		char ultima = cadena.charAt(14);



		for ( int i = 1; i < cadena.length() -1; i++ ) {
			System.out.println("el resulado es " + cadena.charAt(i) );




		}

	}
	
	
}
