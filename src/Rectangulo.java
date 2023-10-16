public class Rectangulo {
    private int lado, base, area, perimetro;
    private String nombre;
    public Rectangulo (String nombre, int lado, int base){
        this.nombre = nombre;
        this.lado = lado;
        this.base = base;
    }

    public void s_nombre(String nombre) {
        this.nombre = nombre;
    }

    public void s_lado(int lado) {
        this.lado = lado;
    }

    public void s_base(int base) {
        this.base = base;
    }
    public void cal_area (){
        area = lado * base;
    }

    public void cal_per () {
        perimetro = (lado*2) + (base*2);
    }

    public String g_nombre () {
        return nombre;
    }

    public int g_lado() {
        return lado;
    }

    public int g_base() {
        return base;
    }
    public int v_area(){
        return area;
    }
    public int v_per(){
        return perimetro;
    }
}
