package Ejemplos;

public class Ejem14 {
	
	public static void main(String[] args) {
		StringBuffer name = new StringBuffer("torreon");
		name.reverse();
		System.out.println(name);
		
		StringBuffer module = new StringBuffer("lenguaje de marcas y sistemas de gestion de informacion");
		module.delete(21, 67);
		System.out.println(module); // no hay problema en pasarse de los que hay
		
		module.replace(0, 11, "lenguaje de");
		System.out.println(module);
		
	}

}
