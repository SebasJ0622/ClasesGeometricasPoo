public class Circulo {
    private double radio, perimetro, area;
    private String nombre;
    public Circulo (String nombre, double radio){
        this.nombre = nombre;
        this.radio = radio;
    }
    public void s_nombrecir (String nombre) {
        this.nombre = nombre;
    }
    public void s_radio ( double radio) {
        this.radio = radio;
    }
    public void cal_areacir (){
        area = (Math.pow(radio,2)) * (Math.PI);
    }
    public void cal_percir (){
        perimetro = (2*(Math.PI)) * radio;
    }
    public String g_nombrecir (){
        return nombre;
    }
    public double g_radio () {
        return radio;
    }
    public double v_areacir (){
        return area;
    }
    public double v_percir () {
        return perimetro;
    }

}
