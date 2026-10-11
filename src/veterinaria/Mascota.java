package veterinaria;

public class Mascota {
    private String nombre;
    private String especie;
    private double peso;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public double getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }

    public Mascota(String nombre, String especie, double peso, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.edad = edad;
    }

    public void setPeso(double peso) {
        if (peso <= 0)
            System.out.println("el peso no puede ser menor o igual a cero");
        else
            this.peso = peso;
    }

    public void setEdad(int edad) {
        if (edad < 0)
            System.out.println("la edad no puede ser negtiva");
        else

            this.edad = edad;
    }

    // METODO VALOR CONSULTA

    public int valorConsulta() {


        int valor = 35000;


        if (this.peso > 25) {
            valor = 55000;
        }  else if (this.peso > 10) {
            valor = 45000;
        }






            if (this.edad >= 8) {
                valor += 12000;
            }
                return valor;
            }


        // METODO DESCRIPCION

        public String descripcion () {
            return this.nombre + "(" + this.especie + "," + +this.peso + " kg, " + this.edad + " años";

        }
    }



