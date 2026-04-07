public class MetodoString {
    String texto = "  Hola, Backend Developer!  ";

    // ── Longitud e índices ──────────────────────────────────────────────
    int len = texto.length();              // 28 (con espacios)
    char primera = texto.charAt(2);       // 'H' (índice 2, base 0)
    int pos = texto.indexOf("Backend");   // 8 (posición de inicio)

    // ── Transformaciones ────────────────────────────────────────────────
    String limpio    = texto.trim();        // "Hola, Backend Developer!"
    String limpio2   = texto.strip();       // Igual que trim(), soporta Unicode

    String upper     = texto.toUpperCase(); // "  HOLA, BACKEND DEVELOPER!  "
    String lower     = texto.toLowerCase(); // "  hola, backend developer!  "
    String reemplazo = texto.replace("Hola", "Hello");

    // ── Verificación ─────────────────────────────────────────────────────
    boolean estaVacio    = texto.isEmpty();          // false
    boolean estaBlanco   = texto.isBlank();          // false (tiene contenido)
    boolean empieza      = texto.startsWith("  Hol"); // true
    boolean contiene     = texto.contains("Backend"); // true
    boolean coincide     = texto.matches("[A-Za-z]+"); // false (tiene espacios)

    // ── División y unión ─────────────────────────────────────────────────
    String[] partes = "uno,dos,tres".split(",");  // ["uno", "dos", "tres"]
    String unido    = String.join("-", "a", "b", "c"); // "a-b-c"

    // ── Subcadenas ───────────────────────────────────────────────────────
    String sub = "BackendDeveloper".substring(7);      // "Developer"
    String sub2 = "BackendDeveloper".substring(0, 7);  // "Backend"

    // ── Formateo (Java 15+) ─────────────────────────────────────────────
    String formato = "Nombre: %s, Edad: %d".formatted("Ana", 25);
// → "Nombre: Ana, Edad: 25"

    // ── Text Blocks (Java 13+) — para JSON, SQL, HTML multilínea ────────
    String json = """ 
        { 
          "nombre": "Ana", 
          "rol": "developer" 
        } 
        """;
}
