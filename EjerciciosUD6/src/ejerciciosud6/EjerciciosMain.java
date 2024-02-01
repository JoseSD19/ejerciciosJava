/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosud6;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class EjerciciosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean otro = false, otroT = false;
        String respuesta, respuestaT;
        char letra, letraT;

        /*Este switch ejecutara el ejercicio que le introduzcamos
            en caso de no tener ese ejercicio se cerrara*/
        do {
            System.out.println("Quieres ejecutar ejercicios de Vectores(v)/Matrices(m)/Strings(s)/Final(f)");
            char tipo = sc.next().charAt(0);

            switch (tipo) {
                case 'v':
                    do {
                        System.out.println("Que ejercicio desea ejecutar: ");
                        int ejercicio = sc.nextInt();
                        System.out.println("Ejecutando ejercicio " + ejercicio + " de Vectores");
                        switch (ejercicio) {
                            case 1:
                                Ej01 ej1 = new Ej01();
                                ej1.Ejecutar();
                                break;
                            case 2:
                                Ej02 ej2 = new Ej02();
                                ej2.Ejecutar();
                                break;
                            case 3:
                                Ej03 ej3 = new Ej03();
                                ej3.Ejecutar();
                                break;
                            case 4:
                                Ej04 ej4 = new Ej04();
                                ej4.Ejecutar();
                                break;
                            case 5:
                                Ej05 ej5 = new Ej05();
                                ej5.Ejecutar();
                                break;
                            case 6:
                                Ej06 ej6 = new Ej06();
                                ej6.Ejecutar();
                                break;
                            case 7:
                                Ej07 ej7 = new Ej07();
                                ej7.Ejecutar();
                                break;
                            case 8:
                                Ej08 ej8 = new Ej08();
                                ej8.Ejecutar();
                                break;
                            case 9:
                                Ej09 ej9 = new Ej09();
                                ej9.Ejecutar();
                                break;
                            case 10:
                                Ej10 ej10 = new Ej10();
                                ej10.Ejecutar();
                                break;
                            case 11:
                                Ej11 ej11 = new Ej11();
                                ej11.Ejecutar();
                                break;
                            case 12:
                                Ej12 ej12 = new Ej12();
                                ej12.Ejecutar();
                                break;
                            case 13:
                                Ej13 ej13 = new Ej13();
                                ej13.Ejecutar();
                                break;
                            case 14:
                                Ej14 ej14 = new Ej14();
                                ej14.Ejecutar();
                                break;
                            case 15:
                                Ej15 ej15 = new Ej15();
                                ej15.Ejecutar();
                                break;
                            case 16:
                                Ej16 ej16 = new Ej16();
                                ej16.Ejecutar();
                                break;
                            case 17:
                                Ej17 ej17 = new Ej17();
                                ej17.Ejecutar();
                                break;
                            case 18:
                                Ej18 ej18 = new Ej18();
                                ej18.Ejecutar();
                                break;
                            case 19:
                                Ej19 ej19 = new Ej19();
                                ej19.Ejecutar();
                                break;
                            case 20:
                                Ej20 ej20 = new Ej20();
                                ej20.Ejecutar();
                                break;
                            default:
                                System.out.println("Opcion incorrecta");
                        }
                        sc.nextLine();
                        System.out.println("¿Quieres hacer otro ejercicio de Vectores?");
                        respuestaT = sc.nextLine().toLowerCase();
                        letraT = respuestaT.charAt(0);
                        otroT = letraT == 's';
                    } while (otroT);
                    break;
                case 'm':
                    do {
                        System.out.println("Que ejercicio desea ejecutar: ");
                        int ejercicioM = sc.nextInt();
                        System.out.println("Ejecutando ejercicio " + ejercicioM + " de Matrices");
                        switch (ejercicioM) {
                            case 1:
                                EjM01 m1 = new EjM01();
                                m1.Ejecutar();
                                break;
                            case 2:
                                EjM02 m2 = new EjM02();
                                m2.Ejecutar();
                                break;
                            case 3:
                                EjM03 m3 = new EjM03();
                                m3.Ejecutar();
                                break;
                            case 4:
                                EjM04 m4 = new EjM04();
                                m4.Ejecutar();
                                break;
                            case 5:
                                EjM05 m5 = new EjM05();
                                m5.Ejecutar();
                                break;
                            default:
                                System.out.println("Opcion incorrecta");
                        }
                        sc.nextLine();
                        System.out.println("¿Quieres hacer otro ejercicio de Matrices?");
                        respuestaT = sc.nextLine().toLowerCase();
                        letraT = respuestaT.charAt(0);
                        otroT = letraT == 's';
                    } while (otroT);
                    break;
                case 's':
                    do {
                        System.out.println("Que ejercicio desea ejecutar: ");
                        int ejercicioS = sc.nextInt();
                        System.out.println("Ejecutando ejercicio " + ejercicioS + " de Srings");
                        switch (ejercicioS) {
                            case 1:
                                EjS01 s1 = new EjS01();
                                s1.Ejecutar();
                                break;
                            case 2:
                                EjS02 s2 = new EjS02();
                                s2.Ejecutar();
                                break;
                            case 3:
                                EjS03 s3 = new EjS03();
                                s3.Ejecutar();
                                break;
                            case 4:
                                EjS04 s4 = new EjS04();
                                s4.Ejecutar();
                                break;
                            case 5:
                                EjS05 s5 = new EjS05();
                                s5.Ejecutar();
                                break;
                            default:
                                System.out.println("Opcion incorrecta");
                        }
                        sc.nextLine();
                        System.out.println("¿Quieres hacer otro ejercicio de Strings?");
                        respuestaT = sc.nextLine().toLowerCase();
                        letraT = respuestaT.charAt(0);
                        otroT = letraT == 's';
                    } while (otroT);
                    break;
                case 'f':
                    do {
                        Adicional a = new Adicional();
                        a.Ejecutar();
                        
                        sc.nextLine();
                        System.out.println("¿Quieres repetir el ejercicio?");
                        respuestaT = sc.nextLine().toLowerCase();
                        letraT = respuestaT.charAt(0);
                        otroT = letraT == 's';
                    } while (otroT);
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }
            System.out.println("¿Y de otro tipo?");
            respuesta = sc.nextLine().toLowerCase();
            letra = respuesta.charAt(0);

            otro = letra == 's';

        } while (otro);

    }
}
