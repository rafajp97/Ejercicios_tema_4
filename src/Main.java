public class Main {
    public static void main(String[] args) {
        int numeroIf = 56;

        /* PRIMER EJERCICIO */
        System.out.println("Aqui comienza el Primer ejercicio....");

        if (numeroIf > 0) {
            System.out.println("es positivo");
        } else if (numeroIf < 0) {
            System.out.println("es negativo");
        } else {
            System.out.println("es 0");
        }
        /* *************** */

        /* SEGUNDO EJERCICIO */

        System.out.println("Aqui comienza el Segundo ejercicio....");

        int numeroWhile = 0;

        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        /* TERCER EJERCICIO */

        System.out.println("Aqui comienza el Tercer ejercicio....");

        do{
            numeroWhile++;
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);

        /* CUARTO EJERCICIO */

        System.out.println("Aqui comienza el Cuarto ejercicio....");

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        /* QUINTO EJERCICIO */

        System.out.println("Aqui comienza el Quinto ejercicio....");

        var estacion = "SEQUIA";

        switch (estacion){
            case "OTOÑO":
                System.out.println("estamos en otoño mira como empiezan a caer las hojas");
                break;
            case "INVIERNO":
                System.out.println("Definitivamente ya estamos en invierno se me congelo la cerveza");
                break;
            case "PRIMAVERA":
                System.out.println("Ya estamos en primavera mira como toma color todo y como salen las flores");
                break;
            case "VERANO":
                System.out.println("Cual sera el nuevo temita del verano, porque ya empezo!!! que calor tan intenso!!!");
                break;
            default:
                System.out.println("Ok, esto debe ser un error, esto no es una estacion, creo que estamos en el caribe. Bueno que no cunda el panico vamos a una playa y nos bebemos una cocada.");

        }


        System.out.println("Aqui comienza el Sexto ejercicio....");
        var valor = ".....";
        for (int i = 0; i <= 3; i++){
            System.out.println(valor);
            valor+= "..........";
        }

        System.out.println("Te pensaste que seguian mas? Tranquilo, aqui terminan los ejercicios. No hay tal cosa como un sexto ejercicio.");
    }


}