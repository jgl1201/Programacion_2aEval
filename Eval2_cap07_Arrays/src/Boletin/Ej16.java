package Boletin;
/* Queremos desarrollar una aplicación que nos ayude a
gestionar las notas de un centro educativo. Cada grupo (o
clase) está compuesto por 5 alumnos. Se pide leer las notas
del primer, segundo y tercer trimestre de un grupo. Debemos
mostrar al final: la nota media del grupo en cada
trimestre, y la media del alumno que se encuentra en la
posición N (N se lee por teclado). */

import java.util.Scanner;

public class Ej16 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int primer[], segundo[], tercer[]; // notas del primer, segundo y tercer trimestre
		int num, i;
		int suma_primer, suma_segundo, suma_tercer;
		double media_alumno;

		primer = new int[5];
		segundo = new int[5];
		tercer = new int[5];
		System.out.println("Notas de primer trimestre:");
		for (i = 0; i < 5; i++) {
			System.out.print("Alumnos (" + i + "): ");
			primer[i] = sc.nextInt();
		}
		System.out.println("Notas del segundo trimestre:");
		for (i = 0; i < 5; i++) {
			System.out.print("Alumno (" + i + "): ");
			segundo[i] = sc.nextInt();
		}
		System.out.println("Notas del tercer trimestre:");
		for (i = 0; i < 5; i++) {
			System.out.print("Alumnos (" + i + "): ");
			tercer[i] = sc.nextInt();

		}
		suma_primer = 0;
		suma_segundo = 0;
		suma_tercer = 0;
		for (i = 0; i < 5; i++) {
			suma_primer += primer[i];
			suma_segundo += segundo[i];
			suma_tercer += tercer[i];
		}
		System.out.println("Media primer trimestre: " + suma_primer / 5.0);
		System.out.println("Media segundo trimestre: " + suma_segundo / 5.0);
		System.out.println("Media tercer trimestre: " + suma_tercer / 5.0);
		System.out.println();
		System.out.print("Introduzca posición del alumno (de 0 a 9): ");
		num = sc.nextInt();
		media_alumno = (double) (primer[num] + segundo[num] + tercer[num]) / 3;

		System.out.println("La media del alumno es: " + media_alumno);

		sc.close();
	}
}
