public class ej_5_29 {
    public static void main(String[] args) {
        String[] dias = { "primer", "segundo", "tercer", "cuarto", "quinto", "sexto", "séptimo", "octavo", "noveno",
                "décimo", "undécimo", "duodécimo" };
        String[] regalos = {
                "una perdiz en un peral",
                "dos tórtolas,",
                "tres gallinas francesas,",
                "cuatro pájaros llamadores,",
                "cinco anillos de oro,",
                "seis gansos,",
                "siete cisnes a natacion,",
                "ocho criadas a ordeño,",
                "nueve bateristas,",
                "diez gaiteros,",
                "once damas bailando,",
                "doce señores saltando," };

        System.out.println("Canción: Los doce días de Navidad.\n");
        for (int i = 0; i < 12; i++) {
            System.out.println("En el " + dias[i] + " día de Navidad");
            System.out.println("Mi verdadero amor me regaló,");

            for (int j = i; j >= 0; j--) {
                switch (j) {
                    case 0:
                        if (i == 0) {
                            System.out.println(regalos[j]);
                        } else {
                            System.out.println("y " + regalos[j]);
                        }
                        break;
                    default:
                        System.out.println(regalos[j]);
                        break;
                }
            }

            System.out.println();
        }
    }

}
