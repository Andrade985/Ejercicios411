public class ContarVocalesConsonantes {

    public static void main(String[] args) {

        String palabra = "esternocleidomastoideo";

        int vocales = 0;        // ✅ iniciar en cero
        int consonantes = 0;    // ✅ iniciar en cero

        for (int i = 0; i < palabra.length(); i++) {

            char letra = palabra.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i'
                    || letra == 'o' || letra == 'u') {

                vocales++;

            } else {
                consonantes++;
            }
        }

        System.out.println("Palabra: " + palabra);
        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);
    }
}

