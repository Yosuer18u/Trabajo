package main;

public class Cadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre="Yosuer Josue Martinez Montenegro";
		System.out.println("mi nombre es "+nombre);
		System.out.println("mi nombre tiene "+ nombre.length()+" letras.");
		System.out.println("La primers letra de "+nombre+" mi nombre es " + nombre.charAt(0));
		int ultima_letra;
		ultima_letra=nombre.length();
		System.out.println("Y la ultima letra es la "+ nombre.charAt(ultima_letra-1));
	}

}
