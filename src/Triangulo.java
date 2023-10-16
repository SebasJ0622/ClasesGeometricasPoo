public class Triangulo {
    private int lado, altura;
    private double area, perimetro;
    private String nombre;
    public Triangulo (String nombre, int lado, int altura){
        this.nombre = nombre;
        this.lado = lado;
        this.altura = altura;
    }
    public void s_nombre (String nombre) {
        this.nombre = nombre;
    }
    public void s_lado (int lado) {
        this.lado = lado;
    }
    public void s_altura (int altura) {
        this.altura = altura;
    }
    public void cal_areatri (){
        area = (lado * altura)/2;
    }
    public void cal_pertri () {
        perimetro = lado * 3;
    }
    public String g_nombre () {
        return nombre;
    }
    public int g_lado () {
        return lado;
    }
    public int g_altura () {
        return altura;
    }
    public double v_area () {
        return area;
    }
    public double v_per () {
        return perimetro;
    }
}
