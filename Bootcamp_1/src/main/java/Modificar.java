
public class Modificar {

            /*
        Desarrollador; Alejandro Varela Ortiz
        T-04 — Paso de parámetros
        Bootcamp 1
        */


    public static void Modificar(int x, StringBuilder sb) {
        x = 999;
        sb.append(" modificado");
    }

    public static void main(String[] args) {
        int numero = 42;
        StringBuilder texto = new StringBuilder("original");
        Modificar(numero, texto);
        System.out.println(numero);
        System.out.println(texto);
    }
}