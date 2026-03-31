// Archivo: HolaMundo.java
// La convención de nombres en Java: UpperCamelCase para clases
//Codigo de Alejandro Varela Oritz


public class HolaMundo {
    // main: el punto de entrada de cualquier programa Java
    // La JVM busca exactamente este método para iniciar la ejecución

    /*
     * Comentario Javadoc — genera documentación HTML automáticamente
     * @param nombre El nombre a saludar
     * @return El saludo formateado
     * @author Tu Nombre
     */

    //metodo
    public String saludar(String nombre){
        return "Saludos a: " + nombre ;
    }

    public static void main(String[] args) {
        System.out.println("Hola, mundo del backend Java!");
        HolaMundo holaMundo = new HolaMundo();
        System.out.println(holaMundo.saludar("Alejandro Varela"));
        System.out.println(HolaMundo.saludo("Alejandro"));
    }
    //Nuevo metodo
    //metodo
    public static String saludo(String nombre){
        return "Saludos a: " + nombre ;
    }

}
