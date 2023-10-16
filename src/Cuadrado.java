public class Cuadrado {
    private int lado, area, perimetro;
    private String nombre;
    public Cuadrado (String nombre, int lado){
        this.nombre = nombre;
        this.lado = lado;
    }
    public void s_nombrec (String nombre) {
        this.nombre = nombre;
    }
    public void s_ladoc ( int lado) {
        this.lado = lado;
    }
    public void cal_areac () {
        area = lado * lado;
    }
    public void cal_perc (){
        perimetro = lado * 4;
    }
    public String g_nombrec () {
        return nombre;
    }
    public int g_ladoc (){
        return lado;
    }
    public int v_area (){
        return area;
    }

    public int v_per() {
        return perimetro;
    }
}
