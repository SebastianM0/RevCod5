import java.util.Scanner; //Se importa la libreria para el scanner

public class Codigo5 {
public static void main(String[] args) { //Se agrega el método main 
    Scanner s = new Scanner(System.in); //Se completa con System.in
    System.out.print("Introduzca un número: "); //Se pone bien las comillas dobles
    int input = s.nextInt(); //Se cambia a int desde aqui y cambiamos el nombre de la variable
    //int c = ni;  se elimina esto porque no es util 
    
//    int afo = 0; podemos omitirlos y meter todo dentro de un if 
//    int noAfo = 0;
    
    if (input > 0) { //Se cambia a if porque con while se queda un bucle infinito
	  int digito = input % 10; //se borra (int) porque ya lo es 
      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) { //el número será afortunado si termina en 3, 7, 8 o 9 
		//afo++; Se omiten estos contadores
          System.out.println("El " + input + " es un número afortunado."); //Se completa bien el println
      } else {
          System.out.println("El " + input + " no es un número afortunado.");
		//noAfo++; Se omiten estos contadores
    }//else
    }/*if*/ else {
    	System.out.println("Escribe un número mayor a 1"); //Se valida que pida positivos 
    }//else
}//main
}//class Codigo5

// input/= 10; esto no es necesario porque el valor para el afortunado se guardo en digito, entonces no se modifico el valor de input, lo muevo afuera porque estorba jej
