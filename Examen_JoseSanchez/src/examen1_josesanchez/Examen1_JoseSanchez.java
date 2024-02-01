/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1_josesanchez;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Examen1_JoseSanchez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        //variables
        double notas[], notasAntiguas[];
        double nota, media;
        int tamaño, notaModificar;
        char respuesta, respuestaNota;
        boolean seguir = true, otraNota;
        //sumatorios
        int total = 0, sinNota = 0;
        double notaTotal = 0;

        //creamos el bucle para pedir el numero de notas
        do {
            System.out.println("Indique el numero de notas que va a registrar: ");
            tamaño = sc.nextInt();
            //si esta fuera del rango muestra el mensaje de error
            if (tamaño < 1 || tamaño > 100) {
                System.out.println("El numero de notas a registrar no es correcto");
            }
        } while (tamaño < 1 || tamaño > 100);
        //limpiamos el scanner
        sc.nextLine();

        //creamos el array
        notas = new double[tamaño];
        notasAntiguas = new double[tamaño];

        //rellenamos el array con -1
        Arrays.fill(notas, -1);

        //copiamos un array en el otro para guardar las notas que se modifiquen
        System.arraycopy(notas, 0, notasAntiguas, 0, notas.length);

        //creamos un bucle para que hasta que no indique salir se repita el menu
        do {

            //este sera el menu que vera el usuario
            System.out.println("Indique que funcion quiere realizar:"
                    + "\n1)Introducir nota."
                    + "\n2)Mostrar notas."
                    + "\n3)Calcular media."
                    + "\n4)Mostrar notas modificadas."
                    + "\nS)Salir.");

            //recogemos la respuesta, solo cogiendo el 1er caracter para evitar errores
            respuesta = sc.nextLine().toLowerCase().charAt(0);

            switch (respuesta) {
                case '1':
                    do {
                        //pedimos que nos introduzca una posicion y comprobamos que este en el array
                        do {
                            System.out.println("Indique la nota que quiere modificar: ");
                            notaModificar = sc.nextInt();
                            //limpiamos el scanner
                            sc.nextLine();
                            if (notaModificar < 1 || notaModificar > notas.length) {
                                System.out.println("La nota no se encuentra, intentelo de nuevo");
                            }
                        } while (notaModificar < 1 || notaModificar > notas.length);

                        //una vez sabemos que esta en el array pedimos la nota y comprobamos que este entre 0 y 10
                        do {
                            System.out.println("Indique la nota: ");
                            nota = sc.nextDouble();
                            //limpiamos el scanner
                            sc.nextLine();
                            if (nota < 0 || nota > 10) {
                                System.out.println("Nota incorrecta, introduzcala de nuevo.");
                            }
                        } while (nota < 0 || nota > 10);

                        //comprobamos si ha modificado una nota o ha introducido una nueva
                        if (notas[(notaModificar - 1)] != -1) {

                            //primero registramos la nota anterior
                            notasAntiguas[(notaModificar - 1)] = notas[notaModificar - 1];

                            //luego cambiamos la nota
                            notas[(notaModificar - 1)] = nota;
                            System.out.println("Nota modificada correctamente");
                        } else {

                            //en caso de no tener nota anterior la ingresamos directamente
                            System.out.println("Nota insertada correctamente");
                            notas[(notaModificar - 1)] = nota;
                        }
                        //preguntamos si quiere ingresar otra nota, para no salir al menu en caso afirmativo
                        System.out.println("Quieres ingresar otra nota?");
                        respuestaNota = sc.nextLine().toLowerCase().charAt(0);

                        otraNota = respuestaNota == 's';

                    } while (otraNota);
                    System.out.println("");
                    break;
                case '2':

                    //formateamos el texto para que se muestre como una tabla
                    System.out.println("Nº NOTA \t NOTA"
                            + "\n---------------------------");
                    for (int i = 0; i < notas.length; i++) {

                        //comprobamos si no hay registrada una nota (es decir es -1)
                        if (notas[i] == -1) {

                            //si no hay nota muestra el mensaje de que no hay nota registrada
                            System.out.println("Nota " + (i + 1) + "\t\t Nota no registrada");
                        } else {

                            //si hay nota muestra la nota redondeada
                            System.out.println("Nota " + (i + 1) + "\t\t" + df.format(notas[i]));
                        }
                    }
                    System.out.println("---------------------------");
                    System.out.println("");
                    break;
                case '3':

                    //recorremos el array y acumulamos las notas que se hayan registado(las que no son -1)
                    for (int i = 0; i < notas.length; i++) {
                        if (notas[i] != -1) {
                            notaTotal += notas[i];
                            total++;
                        } else {
                            sinNota++;
                        }
                    }
                    if (sinNota == notas.length) {
                        System.out.println("No hay nota media porque no hay ninguna nota introducida.");
                    } else {
                        //calculamos la media
                        media = notaTotal / total;

                        //se muestra la media redondeada a 2 decimales
                        System.out.println("La nota media del listado de notas es: " + df.format(media));
                    }
                    System.out.println("");
                    break;
                case '4':

                    //recorremos el array en busca de las notas introducidas
                    for (int i = 0; i < notas.length; i++) {
                        if (notas[i] != -1) {

                            //comprobamos si esa nota se ha modificado
                            if (notasAntiguas[i] != -1) {

                                //en caso de que se haya modificado se muestra el valor nuevo y el antiguo, ambos redondeados
                                System.out.println("La nota en la posicion " + (i + 1) + " se ha modificado de "
                                        + df.format(notasAntiguas[i]) + " a " + df.format(notas[i]));
                            } else {

                                //en caso de que no solo se muestra el nuevo valor redondeado
                                System.out.println("La nota en la posicion " + (i + 1) + " se ha introducido con un valor de " + df.format(notas[i]));
                            }
                        }
                    }
                    System.out.println("");
                    break;
                case 's':
                    System.out.println("Gracias por usar el programa");

                    //se pone seguir a false para que no se repita el programa de nuevo
                    seguir = false;
                    break;
                default:

                    //en caso de ingresar una opcion que no existe da error
                    System.out.println("Esa opcion no existe, intentelo de nuevo.");
                    System.out.println("");
            }
        } while (seguir);
    }

}
