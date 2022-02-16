import java.util.Random;

public class A2E6 {

    public static void main(String[] args) {

        // definir variables 
        int Edad;
        int PerMenores = 0;
        int EdadMenores = 0;
        int PerMayores = 0;
        int EdadMayoress = 0;

        //definir si la edad esta entre (>25) o (<=25)
        for (int i = 1; i < 100; i++) {
            //generador de numero al azar
            Random Aleatoreo = new Random();
            Edad = Aleatoreo.nextInt(80) + 1;

            if (Edad < 25) {
                PerMenores = PerMenores + 1;
                EdadMenores = EdadMenores + Edad;
            } else {
                PerMayores = PerMayores + 1;
                EdadMayoress = EdadMayoress + Edad;
            }
        }
        
        //para encontar el promedio se suman todas las edades y se divide por todas las personas que esten el el rango 
        System.out.println("El promedio de las personas mayores de 24 años es: " + (EdadMayoress / PerMayores) + " años");
        System.out.println("El promedio de las personas menores de 25 años es: " + (EdadMenores / PerMenores) + " años");
    }

}
