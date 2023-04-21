public class FrecuenciasCardiacas {
    //Atributos
    String primerNombre;
    String apellido;
    int mes;
    int dia;
    int anio;
    //Constructores
    public FrecuenciasCardiacas(){
    }
    public FrecuenciasCardiacas(String primerNombre, String apellido, int mes, int dia, int anio){
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }
    //Metodos
    public int FechaAnios(){
        return 2023 - anio;
    }
    public int FrecuenciaCardiacaMax(){
        return 220-FechaAnios();
    }
    public double FrecuenciaCardiacaEsperada(){
        return 0.5*FrecuenciaCardiacaMax();
    }
    //Getter & Setter
    public String getPrimerNombre() {
        return primerNombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getMes(){
        return mes;
    }
    public int getDia(){
        return dia;
    }
    public int getAnio(){
        return anio;
    }
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setDia(int dia){
        this.dia = dia;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }
}
