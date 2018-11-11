package programacion;

/**
 *
 * @author Darwin Del Cid
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arboless {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String nomb;
        String fami;
        String suelo;
        String zona;
        String opcion;

        List<List<String>> Arbol = new ArrayList<List<String>>();
        for (int i = 0; i <= 3; i++) {
            Arbol.add(new ArrayList<String>());
        }

        do {

            System.out.println("         BIENVENIDO");
            System.out.println("1. Agregar arboles");
            System.out.println("2. Mostrar arboles");
            System.out.println("3. Salir");
            System.out.println("eliga una opcion");

            opcion = in.nextLine();

            switch (opcion) {

                case "1":
                    System.out.println("");
                    System.out.println("ingrese el nombre");
                    nomb = in.nextLine();

                    System.out.println("ingrese la familia");
                    fami = in.nextLine();

                    System.out.println("ingrese el tipo de suelo");
                    suelo = in.nextLine();
                    System.out.println("ingrese la zona");
                    zona = in.nextLine();

                    Arbol.get(0).add(nomb);
                    Arbol.get(1).add(fami);
                    Arbol.get(2).add(suelo);
                    Arbol.get(3).add(zona);
                    break;

                case "2":
                    System.out.println("");
                    System.out.println("Datos");
                    for (int i = 0; i <= Arbol.get(0).size() - 1; i++) {
                        System.out.println("Nombre: " + Arbol.get(0).get(i) + " Familia: "
                                + Arbol.get(1).get(i) + " Suelo " + Arbol.get(2).get(i)
                                + " Zona: " + Arbol.get(3).get(i));
                        System.out.println("");
                    }
                    System.out.println("Presione una tecla para continuar");
                    in.nextLine();
                    System.out.println("");
                    break;
            }
        } while (!opcion.equals("3"));

    }

}
