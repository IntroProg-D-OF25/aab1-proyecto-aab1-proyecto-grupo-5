import java.util.Scanner;
public class AdivinaNumero {
    public static void main(String[] args) {
        int cnt1 = 1, gano = 0, perdio = 0;
        Scanner tcl = new Scanner(System.in);        
        do {            
            int numeroAleatorio = (int) (Math.random() * 100) + 1; 
            int puntos = 10, i , next ;
            boolean adivinado = false;
            System.out.println("¡Bienvenido al juego de adivinar el número!");
            System.out.println("He generado un número entre 1 y 100. Tienes 10 puntos para empezar.");
            System.out.println("Por cada pista, perderás 1 punto. ¡Buena suerte!");
            while (puntos > 0 && !adivinado) {
                System.out.print("Ingresa tu suposición: ");
                int suposicion = tcl.nextInt();
                if (suposicion == numeroAleatorio) {
                    adivinado = true;
                    System.out.println("¡Felicidades! Has adivinado el número. Tu puntaje final es: " + puntos);
                    gano ++;
                } else {
                    puntos--;
                    if (puntos == 0) {
                        System.out.println("Lo siento, has perdido. El número era: " + numeroAleatorio);
                        perdio ++;
                        break;
                    }
                    System.out.println("Incorrecto. Aquí tienes una pista:");
                    if (suposicion > numeroAleatorio) {
                        System.out.println("- El número es menor que " + suposicion);
                    } else {
                        System.out.println("- El número es mayor que " + suposicion);
                    }
                    if (numeroAleatorio % 2 == 0) {
                        System.out.println("- El número es par.");
                    } else {
                        System.out.println("- El número es impar.");
                    }
                    if (numeroAleatorio % 3 == 0) {
                        System.out.println("- El número es múltiplo de 3.");
                    }
                    if (numeroAleatorio % 4 == 0) {
                        System.out.println("- El número es múltiplo de 4.");
                    }
                    if (numeroAleatorio % 5 == 0) {
                        System.out.println("- El número es múltiplo de 5.");
                    }
                    if (numeroAleatorio % 6 == 0) {
                        System.out.println("- El número es múltiplo de 6.");
                    }
                    if (numeroAleatorio % 7 == 0) {
                        System.out.println("- El número es múltiplo de 7.");
                    }
                    if (numeroAleatorio % 8 == 0) {
                        System.out.println("- El número es múltiplo de 8.");
                    }
                    if (numeroAleatorio % 9 == 0) {
                        System.out.println("- El número es múltiplo de 9.");
                    }
                    System.out.println("Puntos restantes: " + puntos);
                    int first = 0, second = 1;
                    for (i = 1; i <= 13; i++) {
                        next = first + second;
                        first = second;
                        second = next;
                        if (numeroAleatorio == next) {
                            System.out.println("EL NUMERO PERTENECE A FIBONACCI");
                       }                   
                    }
                }
            }
            System.out.println("Quieres jugar nuevamente? 1.Si / 2.No");
            cnt1 = tcl.nextInt();
        } while (cnt1 == 1);
        if (gano > 0) 
            System.out.println("Ganó " + gano + " veces :D ");
        else
            System.out.println("Ganó " + gano + " veces D: ");
        if (perdio > 0) 
            System.out.println("Perdió " + perdio + " veces D:");
        else
            System.out.println("Perdió " + perdio + " veces :D");
    }
}
