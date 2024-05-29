package menuPrincipal;

import java.util.Scanner;

import practica1.ifElse.Ejercicio1;
import practica1.ifElse.Ejercicio2;
import practica1.ifElse.Ejercicio3;
import practica1.ifElse.Ejercicio4;
import practica1.ifElse.Ejercicio5;

/**
 *
 * @author Kintydev
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("=======================================================================");
        int opcion = 1;
        while(opcion!=10){
            System.out.println("******************  MENU  DEL SISTEMA *********************************");
            System.out.println("***** OPCIONES, SELECCIONE ********************************************");
            System.out.println("* 1. CONDICIONES ");
            System.out.println("* 2. BUCLES  ");
            System.out.println("* 3. ARRAYS  ");
            System.out.println("* 4. MATRICES ");
            System.out.println("* 5. OBJETOS ");
            System.out.println("* 6. RECURSIVIDAD ");
            System.out.println("* 7. LISTA ENLAZADA SIMPLE ");
            System.out.println("* 8. LISTA ENLAZADA ");
            System.out.println("* 9. ORDENAMIENTO ");
            System.out.println("* 10. SALIR ");
            System.out.println("***********************************************************************");
            System.out.print("SELECCIONE UNA OPCION: ");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                /***************EJERCICIO 1*********************/
                        String subopcion="1";
                        while(!subopcion.equals("1.3")){
                                System.out.println("***** MENU CONDICIONALES *******");
                                System.out.println("**************************");
                                System.out.println("* 1.1 IF ELSE ");
                                System.out.println("* 1.2 SWITCH ");
                                System.out.println("* 1.3 SALIR MENU ");
                                System.out.print("SELECCIONE UNA OPCION: ");
                                sc.nextLine();
                                subopcion = sc.next();
                                String tercer="1";
                                switch (subopcion){
                                    case "1.1":
                                        while(!"1.1.6".equals(tercer)){
                                            System.out.println("*****SUB MENU CONDICIONAL*******");
                                            System.out.println("**************************");
                                            System.out.println("* 1.1.1 IF ELSE 1");
                                            System.out.println("* 1.1.2 IF ELSE 2");
                                            System.out.println("* 1.1.3 IF ELSE 3");
                                            System.out.println("* 1.1.4 IF ELSE 4");
                                            System.out.println("* 1.1.5 IF ELSE 5");
                                            System.out.println("* 1.1.6 SALIR SUBMENU ");
                                            System.out.println("***********************************************************************");
                                            System.out.print("SELECCIONE UNA OPCION: ");
                                            tercer = sc.next();
                                            switch(tercer){
                                                case "1.1.1":
                                                    practica1.ifElse.Ejercicio1 ifelse1=new Ejercicio1();
                                                    ifelse1.main();
                                                    break;
                                                case "1.1.2":
                                                    practica1.ifElse.Ejercicio2 ifelse2=new Ejercicio2();
                                                    ifelse2.main();
                                                    break;
                                                case "1.1.3":
                                                    practica1.ifElse.Ejercicio3 ifelse3=new Ejercicio3();
                                                    ifelse3.main();
                                                    break;
                                                case "1.1.4":
                                                    practica1.ifElse.Ejercicio4 ifelse4=new Ejercicio4();
                                                    ifelse4.main();
                                                    break;
                                                case "1.1.5":
                                                    practica1.ifElse.Ejercicio5 ifelse5=new Ejercicio5();
                                                    ifelse5.main();
                                                    break;
                                                default:
                                                    System.out.println("GRACIAS POR SU VISITA A ESTE MENU ");
                                                break;
                                            }
                                        }
                                    break;
                                case "1.2":
                                    while(!"1.2.4".equals(tercer)){
                                            System.out.println("*****SUB MENU CONDICIONAL*******");
                                            System.out.println("**************************");
                                            System.out.println("* 1.2.1 SWITCH 1");
                                            System.out.println("* 1.2.2 SWITCH 2");
                                            System.out.println("* 1.2.3 SWITCH 3");
                                            System.out.println("* 1.2.4 SALIR SUBMENU ");
                                            System.out.println("***********************************************************************");
                                            System.out.print("SELECCIONE UNA OPCION: ");
                                            tercer = sc.next();
                                            switch(tercer){
                                                case "1.2.1":
                                                    practica1.Switch.Ejercicio1 swit1=new practica1.Switch.Ejercicio1();
                                                    swit1.main();
                                                    break;
                                                case "1.2.2":
                                                    practica1.Switch.Ejercicio2 swit2=new practica1.Switch.Ejercicio2();
                                                    swit2.main();
                                                    break;
                                                case "1.2.3":
                                                    practica1.Switch.Ejercicio3 swit3=new practica1.Switch.Ejercicio3();
                                                    swit3.main();
                                                    break;
                                                default:
                                                    System.out.println("GRACIAS POR SU VISITA A ESTE MENU ");
                                                break;
                                            }
                                        }
                                    break;  
                                default:
                                    System.out.println("GRACIAS POR SU VISITA A ESTE MENU ");
                                break;
                          }
                                
                                
                                
                        }
                break;
                /**************************************/   
                case 2:
                /***************EJERCICIO 1*********************/
                        String sub2="1";
                        while(!sub2.equals("2.4")){
                                System.out.println("***** MENU CONDICIONALES *******");
                                System.out.println("**************************");
                                System.out.println("* 2.1 WHILE ");
                                System.out.println("* 2.2 DO-WHILE ");
                                System.out.println("* 2.3 FOR ");
                                System.out.println("* 2.4 SALIR MENU ");
                                System.out.print("SELECCIONE UNA OPCION: ");
                                sc.nextLine();
                                sub2 = sc.next();
                                String tercer="1";
                                switch (sub2){
                                    case "2.1":
                                        while(!"2.1.7".equals(tercer)){
                                            System.out.println("*****SUB MENU WHILE*******");
                                            System.out.println("**************************");
                                            System.out.println("* 2.1.1 WHILE 1");
                                            System.out.println("* 2.1.2 WHILE 2");
                                            System.out.println("* 2.1.3 WHILE 3");
                                            System.out.println("* 2.1.4 WHILE 4");
                                            System.out.println("* 2.1.5 WHILE 5");
                                            System.out.println("* 2.1.6 WHILE 6");
                                            System.out.println("* 2.1.7 SALIR SUBMENU ");
                                            System.out.println("***********************************************************************");
                                            System.out.print("SELECCIONE UNA OPCION: ");
                                            tercer = sc.next();
                                            switch(tercer){
                                                case "2.1.1":
                                                    practica2.While.Ejercicio1 whil1=new practica2.While.Ejercicio1();
                                                    whil1.main();
                                                    break;
                                                case "2.1.2":
                                                    practica2.While.Ejercicio2 whil2=new practica2.While.Ejercicio2();
                                                    whil2.main();
                                                    break;
                                                case "2.1.3":
                                                    practica2.While.Ejercicio3 whil3=new practica2.While.Ejercicio3();
                                                    whil3.main();
                                                    break;
                                                case "2.1.4":
                                                    practica2.While.Ejercicio4 whil4=new practica2.While.Ejercicio4();
                                                    whil4.main();
                                                    break;
                                                case "2.1.5":
                                                    practica2.While.Ejercicio5 whil5=new practica2.While.Ejercicio5();
                                                    whil5.main();
                                                    break;
                                                 case "2.1.6":
                                                    practica2.While.Ejercicio6 whil6=new practica2.While.Ejercicio6();
                                                    whil6.main();
                                                    break;
                                                default:
                                                    System.out.println("GRACIAS POR SU VISITA A ESTE MENU ");
                                                break;
                                            }
                                        }
                                    break;
                                case "2.2":
                                    while(!"2.2.7".equals(tercer)){
                                            System.out.println("*****SUB MENU DO-WHILE*******");
                                            System.out.println("**************************");
                                            System.out.println("* 2.2.1 DO-WHILE 1");
                                            System.out.println("* 2.2.2 DO-WHILE 2");
                                            System.out.println("* 2.2.3 DO-WHILE 3");
                                            System.out.println("* 2.2.4 DO-WHILE 4");
                                            System.out.println("* 2.2.5 DO-WHILE 5");
                                            System.out.println("* 2.2.6 DO-WHILE 6");
                                            System.out.println("* 2.2.7 SALIR SUBMENU ");
                                            System.out.println("***********************************************************************");
                                            System.out.print("SELECCIONE UNA OPCION: ");
                                            tercer = sc.next();
                                            switch(tercer){
                                                case "2.2.1":
                                                    practica2.DoWhile.Ejercicio1 dow1=new practica2.DoWhile.Ejercicio1();
                                                    dow1.main();
                                                    break;
                                                case "2.2.2":
                                                    practica2.DoWhile.Ejercicio2 dow2=new practica2.DoWhile.Ejercicio2();
                                                    dow2.main();
                                                    break;
                                                case "2.2.3":
                                                    practica2.DoWhile.Ejercicio3 dow3=new practica2.DoWhile.Ejercicio3();
                                                    dow3.main();
                                                    break;
                                                case "2.2.4":
                                                    practica2.DoWhile.Ejercicio4 dow4=new practica2.DoWhile.Ejercicio4();
                                                    dow4.main();
                                                    break;
                                                case "2.2.5":
                                                    practica2.DoWhile.Ejercicio5 dow5=new practica2.DoWhile.Ejercicio5();
                                                    dow5.main();
                                                    break;
                                                case "2.2.6":
                                                    practica2.DoWhile.Ejercicio6 dow6=new practica2.DoWhile.Ejercicio6();
                                                    dow6.main();
                                                    break;
                                                default:
                                                    System.out.println("GRACIAS POR SU VISITA A ESTE MENU ");
                                                break;
                                            }
                                        }
                                    break; 
                                case "2.3":
                                    while(!"2.3.6".equals(tercer)){
                                            System.out.println("***** SUB MENU FOR *******");
                                            System.out.println("**************************");
                                            System.out.println("* 2.3.1 FOR 1");
                                            System.out.println("* 2.3.2 FOR 2");
                                            System.out.println("* 2.3.3 FOR 3");
                                            System.out.println("* 2.3.4 FOR 4");
                                            System.out.println("* 2.3.5 FOR 5");
                                            System.out.println("* 2.3.6 SALIR SUBMENU ");
                                            System.out.println("***********************************************************************");
                                            System.out.print("SELECCIONE UNA OPCION: ");
                                            tercer = sc.next();
                                            switch(tercer){
                                                case "2.3.1":
                                                    practica2.For.Ejercicio1 for1=new practica2.For.Ejercicio1();
                                                    for1.main();
                                                    break;
                                                case "2.3.2":
                                                    practica2.For.Ejercicio2 for2=new practica2.For.Ejercicio2();
                                                    for2.main();
                                                    break;
                                                case "2.3.3":
                                                    practica2.For.Ejercicio3 for3=new practica2.For.Ejercicio3();
                                                    for3.main();
                                                    break;
                                                case "2.3.4":
                                                    practica2.For.Ejercicio4 for4=new practica2.For.Ejercicio4();
                                                    for4.main();
                                                    break;
                                                case "2.3.5":
                                                    practica2.For.Ejercicio5 for5=new practica2.For.Ejercicio5();
                                                    for5.main();
                                                    break;
                                                default:
                                                    System.out.println("GRACIAS POR SU VISITA A ESTE MENU ");
                                                break;
                                            }
                                        }
                                    break;
                                    
                                    
                                default:
                                    System.out.println("GRACIAS POR SU VISITA A ESTE MENU ");
                                break;
                          }
                        }
                break;
                /**************************************/   
             case 3:
                /***************EJERCICIO 3*********************/
                String submen="1";
                while(!"3.5".equals(submen)){
                            System.out.println("***** SUB MENU ARRAYS *******");
                            System.out.println("**************************");
                            System.out.println("* 3.1 ARRAYS 1");
                            System.out.println("* 3.2 ARRAYS 2");
                            System.out.println("* 3.3 ARRAYS 3");
                            System.out.println("* 3.4 ARRAYS 4");
                            System.out.println("* 3.5 SALIR SUBMENU ");
                            System.out.println("***********************************************************************");
                            System.out.print("SELECCIONE UNA OPCION: ");
                                            submen = sc.next();
                                            switch(submen){
                                                case "3.1":
                                                    practica3.Arrays.Ejercicio1 array1=new practica3.Arrays.Ejercicio1();
                                                    array1.main();
                                                    break;
                                                case "3.2":
                                                    practica3.Arrays.Ejercicio2 array2=new practica3.Arrays.Ejercicio2();
                                                    array2.main();
                                                    break;
                                                case "3.3":
                                                    practica3.Arrays.Ejercicio3 array3=new practica3.Arrays.Ejercicio3();
                                                    array3.main();
                                                    break;
                                                case "3.4":
                                                    practica3.Arrays.Ejercicio4 array4=new practica3.Arrays.Ejercicio4();
                                                    array4.main();
                                                    break;
                                                default:
                                                    System.out.println("GRACIAS POR SU VISITA A ESTE MENU ");
                                                break;
                                            }
                }
                break;
                /**********************************************/ 
             case 4:
                 /***************EJERCICIO 4*********************/
                String submen4="1";
                while(!"4.7".equals(submen4)){
                            System.out.println("***** SUB MENU MATRICES *******");
                            System.out.println("**************************");
                            System.out.println("* 4.1 MATRICES 1");
                            System.out.println("* 4.2 MATRICES 2");
                            System.out.println("* 4.3 MATRICES 3");
                            System.out.println("* 4.4 MATRICES 4");
                            System.out.println("* 4.5 MATRICES 5");
                            System.out.println("* 4.6 MATRICES 6");
                            System.out.println("* 4.7 SALIR SUBMENU ");
                            System.out.println("***********************************************************************");
                            System.out.print("SELECCIONE UNA OPCION: ");
                                            submen4 = sc.next();
                                            switch(submen4){
                                                case "4.1":
                                                    practica3.Matrices.Ejercicio1 matr1=new practica3.Matrices.Ejercicio1();
                                                    matr1.main();
                                                    break;
                                                case "4.2":
                                                     practica3.Matrices.Ejercicio2 matr2=new practica3.Matrices.Ejercicio2();
                                                    matr2.main();
                                                    break;
                                                case "4.3":
                                                    practica3.Matrices.Ejercicio3 matr3=new practica3.Matrices.Ejercicio3();
                                                    matr3.main();
                                                    break;
                                                case "4.4":
                                                    practica3.Matrices.Ejercicio4 matr4=new practica3.Matrices.Ejercicio4();
                                                    matr4.main();
                                                    break;
                                                case "4.5":
                                                    practica3.Matrices.Ejercicio5 matr5=new practica3.Matrices.Ejercicio5();
                                                    matr5.main();
                                                    break;
                                                case "4.6":
                                                    practica3.Matrices.Ejercicio6 matr6=new practica3.Matrices.Ejercicio6();
                                                    matr6.main();
                                                    break;
                                                default:
                                                    System.out.println("GRACIAS POR SU VISITA A ESTE MENU ");
                                                break;
                                            }
                }
                break;
                /**********************************************/ 
                case 5:
                 /***************EJERCICIO 5********************/
                String submen5="1";
                while(!"5.6".equals(submen5)){
                            System.out.println("***** SUB MENU EJERCICIO OBJETOS *******");
                            System.out.println("**************************");
                            System.out.println("* 5.1 EJERCICIO OBJETOS 1");
                            System.out.println("* 5.2 EJERCICIO OBJETOS 2");
                            System.out.println("* 5.3 EJERCICIO OBJETOS 3");
                            System.out.println("* 5.4 EJERCICIO OBJETOS 4");
                            System.out.println("* 5.5 EJERCICIO OBJETOS 5");
                            System.out.println("* 5.6 SALIR SUBMENU ");
                            System.out.println("***********************************************************************");
                            System.out.print("SELECCIONE UNA OPCION: ");
                                            submen5 = sc.next();
                                            switch(submen5){
                                                case "5.1":
                                                    practica4.EjercicioObjetos1.Ejecucion obj1=new practica4.EjercicioObjetos1.Ejecucion();
                                                    obj1.main();
                                                    break;
                                                case "5.2":
                                                    practica4.EjercicioObjetos2.Ejecucion obj2=new practica4.EjercicioObjetos2.Ejecucion();
                                                    obj2.main();
                                                    break;
                                                case "5.3":
                                                   practica4.EjercicioObjetos3.Ejecucion obj3=new practica4.EjercicioObjetos3.Ejecucion();
                                                    obj3.main();
                                                    break;
                                                case "5.4":
                                                   practica4.EjercicioObjetos4.Ejecucion obj4=new practica4.EjercicioObjetos4.Ejecucion();
                                                   obj4.main();
                                                    break;
                                                case "5.5":
                                                  practica4.EjercicioObjetos5.Ejecucion obj5=new practica4.EjercicioObjetos5.Ejecucion();
                                                    obj5.main();
                                                    break;
                                                default:
                                                    System.out.println("GRACIAS POR SU VISITA A ESTE MENU ");
                                                break;
                                            }
                }
                break;
                /**********************************************/ 
                
                case 6:
                 /***************EJERCICIO 5********************/
                String submen6="1";
                while(!"6.9".equals(submen6)){
                            System.out.println("***** SUB MENU RECURSIVIDAD *******");
                            System.out.println("**************************");
                            System.out.println("* 6.1 RECURSIVIDAD 1");
                            System.out.println("* 6.2 RECURSIVIDAD 2");
                            System.out.println("* 6.3 RECURSIVIDAD 3");
                            System.out.println("* 6.4 RECURSIVIDAD 4");
                            System.out.println("* 6.5 RECURSIVIDAD 5");
                            System.out.println("* 6.6 RECURSIVIDAD 5");
                            System.out.println("* 6.7 RECURSIVIDAD 5");
                            System.out.println("* 6.8 RECURSIVIDAD 5");
                            System.out.println("* 6.9 SALIR SUBMENU ");
                            System.out.println("***********************************************************************");
                            System.out.print("SELECCIONE UNA OPCION: ");
                                            submen6 = sc.next();
                                            switch(submen6){
                                                case "6.1":
                                                    practica5.Recursividad.Ejecucion rec1=new practica5.Recursividad.Ejecucion();
                                                    rec1.main();
                                                    break;
                                                case "6.2":
                                                   practica5.Recursividad.Ejercicio1 rec2=new practica5.Recursividad.Ejercicio1();
                                                   rec2.main();
                                                   break;
                                                case "6.3":
                                                   practica5.Recursividad.Ejercicio2 rec3=new practica5.Recursividad.Ejercicio2();
                                                   rec3.main();
                                                   break;
                                                case "6.4":
                                                   practica5.Recursividad.Ejercicio3 rec4=new practica5.Recursividad.Ejercicio3();
                                                   rec4.main();
                                                   break;
                                                case "6.5":
                                                   practica5.Recursividad.Ejercicio4 rec5=new practica5.Recursividad.Ejercicio4();
                                                   rec5.main();
                                                   break;
                                                case "6.6":
                                                  practica5.Recursividad.Ejercicio5 rec6=new practica5.Recursividad.Ejercicio5();
                                                  rec6.main();
                                                  break;
                                                case "6.7":
                                                  practica5.Recursividad.Ejercicio6 rec7=new practica5.Recursividad.Ejercicio6();
                                                  rec7.main();
                                                  break;
                                                case "6.8":
                                                  practica5.Recursividad.Ejercicio7 rec8=new practica5.Recursividad.Ejercicio7();
                                                  rec8.main();
                                                  break;
                                                case "6.9":
                                                  practica5.Recursividad.Ejercicio8 rec9=new practica5.Recursividad.Ejercicio8();
                                                  rec9.main();
                                                    break;
                                                default:
                                                    System.out.println("GRACIAS POR SU VISITA A ESTE MENU ");
                                                break;
                                            }
                }
                break;
                /**********************************************/ 
                
                case 7:
                 /***************LISTA ENLAZADA SIMPLE********************/
                 practica6.ListaEnlazada.Ejecucion lista=new practica6.ListaEnlazada.Ejecucion();
                 lista.main();
                break;
                /**********************************************/ 
                case 8:
                 /***************LISTA ENLAZADA DOBLE SIMPLE********************/
                 practica7.Ejecucion listaDoble=new practica7.Ejecucion();
                 listaDoble.main();
                break;
                /**********************************************/ 
                case 9:
                 String submen7="1";
                        while(!"9.4".equals(submen7)){
                                System.out.println("***** SUB MENU ORDENAMIENTO ********************************************");
                                System.out.println("************************************************************************");
                                System.out.println("* 9.1 ORDENAMIENTO 1");
                                System.out.println("* 9.2 ORDENAMIENTO 2");
                                System.out.println("* 9.3 ORDENAMIENTO 3");
                                System.out.println("* 9.4 SALIR SUBMENU ");
                                System.out.println("***********************************************************************");
                                System.out.print("SELECCIONE UNA OPCION: ");
                                submen7 = sc.next();
                                switch(submen7){
                                    case "9.1":
                                        practica8.Mezcla.Ejecucion mez=new practica8.Mezcla.Ejecucion();
                                        mez.main();
                                        break;
                                    case "9.2":
                                       practica8.Monticulo.Ejecucion mezc=new practica8.Monticulo.Ejecucion();
                                        mezc.main();
                                       break;
                                    case "9.3":
                                       practica8.Ordenamiento.OrdenamientoCasilleros orde=new practica8.Ordenamiento.OrdenamientoCasilleros();
                                        orde.main();
                                       break;
                                    default:
                                        System.out.println("GRACIAS POR SU VISITA A ESTE MENU ");
                                    break;
                                }
                        }
                        break;
                /**********************************************/ 
                
                default:
                    System.out.println("GRACIAS POR USAR NUESTRAS OPCIONES... ");
                break;   
             } 
        
        }
        
       
    }
    
}
