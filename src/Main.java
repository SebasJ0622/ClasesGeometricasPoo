// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Rectangulo rec_1 = new Rectangulo("Rectangular", 6, 4);

    System.out.println("La figura es " + rec_1.g_nombre() + ", sus lados son de: " + rec_1.g_lado()
                + " cm" + " y tiene una base de " + rec_1.g_base() + " cm");

    rec_1.s_nombre("Rectangulo");
    rec_1.s_lado(5);
    rec_1.s_base(10);
    rec_1.cal_area();
    rec_1.cal_per();
    System.out.println("Tu figura es un: " + rec_1.g_nombre() + " , su area es de: " + rec_1.v_area() + " cm"
    + " y su perimetro es de: " + rec_1.v_per() + " cm");
    System.out.println("Tu " + rec_1.g_nombre() + " tiene lados de: " + rec_1.g_lado() + " cm" + " y una base de: "
        + rec_1.g_base() + " cm");
    System.out.println("______________________________________________________");

    Cuadrado cu_1 = new Cuadrado("Cuadra", 4);
    System.out.println("La figura es " + cu_1.g_nombrec() + ", sus lados son de: " + cu_1.g_ladoc() + " cm");
    cu_1.s_nombrec("Cuadradito");
    cu_1.s_ladoc(9);
    cu_1.cal_areac();
    cu_1.cal_perc();
    System.out.println("Tu " + cu_1.g_nombrec() + " tiene un area de: " + cu_1.v_area() + " cm" + " y un perimetro de: "
        + cu_1.v_per() + " cm");
    System.out.println("Tu " + cu_1.g_nombrec() + " tiene lados de: " + cu_1.g_ladoc() + " cm");
    System.out.println("______________________________________________________");

    Circulo cir_1 = new Circulo ("Circus" , 5);
    System.out.println("Tu figura " + cir_1.g_nombrecir() + " tiene un radio de: " + cir_1.g_radio() + " cm");
    cir_1.s_nombrecir("Circulito");
    cir_1.s_radio(9);
    cir_1.cal_areacir();
    cir_1.cal_percir();
    System.out.println("Tu " + cir_1.g_nombrecir() + " tiene un area de: " + cir_1.v_areacir() + " cm"
        + " y un perimetro de: " + cir_1.v_percir() + " cm");
    System.out.println("Los valores de tu figura son: " + cir_1.g_nombrecir() + " , " + " radio " + cir_1.g_radio() + " cm" +
            " , " + " area " + cir_1.v_areacir() + " cm " + " , " + " perimetro " + cir_1.v_percir() + " cm");
    System.out.println("______________________________________________________");

    Triangulo tri_1 = new Triangulo("Triloco", 6, 5);
    tri_1.cal_areatri();
    tri_1.cal_pertri();
    System.out.println("Tu figura: " + tri_1.g_nombre() + " con lados de: " + tri_1.g_lado() + " cm" + " y altura de: " + tri_1.g_altura());
    System.out.println("Tiene un area de: " + tri_1.v_area() + " cm" + " y un perimetro de: " + tri_1.v_per() + " cm");
    tri_1.s_nombre("Triangulete");
    tri_1.s_lado(4);
    tri_1.s_altura(18);
    System.out.println("Tu figura: " + tri_1.g_nombre() + " con lados de: " + tri_1.g_lado() + " cm" + " y altura de: " + tri_1.g_altura());
    System.out.println("Tiene un area de: " + tri_1.v_area() + " cm" + " y un perimetro de: " + tri_1.v_per() + " cm");












        }
    }
