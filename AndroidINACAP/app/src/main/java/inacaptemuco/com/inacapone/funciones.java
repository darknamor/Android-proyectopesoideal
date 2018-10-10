package inacaptemuco.com.inacapone;

import android.content.Context;

public class funciones {
    private String Nombre;
    private int Edad;
    private int pesoActual;
    private String EstadoPeso;
    private int pesoIdeal;
    private Context context;

    public funciones(Context cont){
        context = cont;
    }
    public int calcularPesoIdeal() {
        pesoIdeal = Edad * 2 + 8;
        return pesoIdeal;
    }

    public String getNombre() {
        String[] parts = Nombre.split("_");
        String camelCaseString = "";
        for (String part : parts){
            camelCaseString = camelCaseString + toProperCase(part);
        }
        return camelCaseString;
    }
    static String toProperCase(String s) {
        return s.substring(0, 1).toUpperCase() +
                s.substring(1).toLowerCase();
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getpesoActual() {
        return pesoActual;
    }

    public void setpesoActual(int pesoActual) {
        this.pesoActual = pesoActual;
    }

    public String getEstadoPeso() {
        return EstadoPeso;
    }

    public void setEstadoPeso(String EstadoPeso) {
        EstadoPeso = EstadoPeso;
    }

    public int getpesoIdeal() {
        return pesoIdeal;
    }

    public void setPesoIdeal(int pesoIdeal) {
        this.pesoIdeal = pesoIdeal;
    }

    public String compararPeso() {
        if (pesoActual == pesoIdeal) {
            EstadoPeso = "el ideal";
        }
        else if(pesoActual < pesoIdeal) {
            EstadoPeso = "bajo peso, se recomienda dieta";
        }
        else if(pesoActual > pesoIdeal) {
                EstadoPeso = "sobre peso, se recomienda dieta y ejercicio";
        }
        else{
            return "error";
        }
        return EstadoPeso;
    }
}
