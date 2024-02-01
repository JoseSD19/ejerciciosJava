package ejerciciosUD8;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import ejerciciosUD8.apartadoA.UD8_Principal_A;
import ejerciciosUD8.apartadoB.UD8_Principal_B;
import ejerciciosUD8.apartadoC.UD8_Principal_C;
import ejerciciosUD8.apartadoD.UD8_Principal_D;
import ejerciciosud8.apartadoE.UD8_Principal_E;
import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class MainUD8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcion, otro, otroEjer;
        boolean repetir, repetirEjer;
        int ejercicio;

        do {
            System.out.println("Que apartado quieres ejecutar");
            opcion = sc.nextLine().toLowerCase().charAt(0);
            switch (opcion) {
                case 'a':
                    do {
                        System.out.println("Que ejercicio quieres hacer");
                        ejercicio = sc.nextInt();
                        sc.nextLine();
                        switch (ejercicio) {
                            case 1:
                                UD8_Principal_A.ejecutar1();
                                break;
                            case 2:
                                UD8_Principal_A.ejecutar2();
                                break;
                            case 3:
                                UD8_Principal_A.ejecutar3();
                                break;
                            case 4:
                                UD8_Principal_A.ejecutar4();
                                break;
                            default:
                                System.out.println("No hay ejercicio " + ejercicio + " intentelo de nuevo");
                        }
                        System.out.println("Quieres hacer otro ejercicio del apartado " + opcion + ")");
                        otroEjer = sc.nextLine().toLowerCase().charAt(0);

                        repetirEjer = otroEjer == 's';

                    } while (repetirEjer);
                    break;
                case 'b':
                    do {
                        System.out.println("Que ejercicio quieres hacer");
                        ejercicio = sc.nextInt();
                        sc.nextLine();
                        switch (ejercicio) {
                            case 1:
                                UD8_Principal_B.ejecutar1();
                                break;
                            case 2:
                                UD8_Principal_B.ejecutar2();
                                break;
                            case 3:
                                UD8_Principal_B.ejecutar3();
                                break;
                            case 4:
                                UD8_Principal_B.ejecutar4();
                                break;
                            default:
                                System.out.println("No hay ejercicio " + ejercicio + " intentelo de nuevo");
                        }
                        System.out.println("Quieres hacer otro ejercicio del apartado " + opcion + ")");
                        otroEjer = sc.nextLine().toLowerCase().charAt(0);

                        repetirEjer = otroEjer == 's';

                    } while (repetirEjer);
                    break;
                case 'c':
                    do {
                        System.out.println("Que ejercicio quieres hacer");
                        ejercicio = sc.nextInt();
                        sc.nextLine();
                        switch (ejercicio) {
                            case 1:
                                UD8_Principal_C.ejecutar1();
                                break;
                            case 2:
                                UD8_Principal_C.ejecutar2();
                                break;
                            case 3:
                                UD8_Principal_C.ejecutar3();
                                break;
                            case 4:
                                UD8_Principal_C.ejecutar4();
                                break;
                            default:
                                System.out.println("No hay ejercicio " + ejercicio + " intentelo de nuevo");
                        }
                        System.out.println("Quieres hacer otro ejercicio del apartado " + opcion + ")");
                        otroEjer = sc.nextLine().toLowerCase().charAt(0);

                        repetirEjer = otroEjer == 's';

                    } while (repetirEjer);
                    break;
                    case 'd':
                    do {
                        System.out.println("Que ejercicio quieres hacer");
                        ejercicio = sc.nextInt();
                        sc.nextLine();
                        switch (ejercicio) {
                            case 1:
                                UD8_Principal_D.ejecutar1();
                                break;
                            case 2:
                                UD8_Principal_D.ejecutar2();
                                break;
                            case 3:
                                UD8_Principal_D.ejecutar3();
                                break;
                            case 4:
                                UD8_Principal_D.ejecutar4();
                                break;
                            default:
                                System.out.println("No hay ejercicio " + ejercicio + " intentelo de nuevo");
                        }
                        System.out.println("Quieres hacer otro ejercicio del apartado " + opcion + ")");
                        otroEjer = sc.nextLine().toLowerCase().charAt(0);

                        repetirEjer = otroEjer == 's';

                    } while (repetirEjer);
                    break;
                    case 'e':
                    do {
                        System.out.println("Que ejercicio quieres hacer");
                        ejercicio = sc.nextInt();
                        sc.nextLine();
                        switch (ejercicio) {
                            case 1:
                                UD8_Principal_E.ejecutar1();
                                break;
                            case 2:
                                UD8_Principal_E.ejecutar2();
                                break;
                            case 3:
                                UD8_Principal_E.ejecutar3();
                                break;
                            case 4:
                                UD8_Principal_E.ejecutar4();
                                break;
                            default:
                                System.out.println("No hay ejercicio " + ejercicio + " intentelo de nuevo");
                        }
                        System.out.println("Quieres hacer otro ejercicio del apartado " + opcion + ")");
                        otroEjer = sc.nextLine().toLowerCase().charAt(0);

                        repetirEjer = otroEjer == 's';

                    } while (repetirEjer);
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.println("Quieres hace otro apartado");
            otro = sc.nextLine().toLowerCase().charAt(0);

            repetir = otro == 's';

        } while (repetir);
    }
}
