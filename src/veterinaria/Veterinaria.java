package veterinaria;

public class Veterinaria {

    public static void main(String[] args) {
        Mascota[] pacientes = {
                new Mascota("luna", "perro", 28.5, 9),
                new Mascota("michi", "gato", 4.2, 3),
                new Mascota("rocky", "perro", 12.0, 5),
                new Mascota("pepa", "conejo", 2.1, 1)
        };
        double totalRecaudado = 0;
        for (int i = 0; i < pacientes.length; i++) {
            String desc = pacientes[i].descripcion();
            int valor = pacientes[i].valorConsulta();
            System.out.println(desc + " - valorConsulta:" + valor);
            totalRecaudado += valor;
        }
        System.out.println("total recaudado:" + totalRecaudado);

        //punto 8:  dejar a michi en -3

        System.out.println(" cambiar el peso de michi a -3 kg...");
        pacientes[1].setPeso(-3);
        System.out.println(pacientes[1].descripcion());


    }
}



