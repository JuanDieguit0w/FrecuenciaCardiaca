import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FrecuenciasCardiacas f1 = new FrecuenciasCardiacas();

        String primerNombre;
        String apellido;
        int mes;
        int dia;
        int anio;

        System.out.println("DATOS DEL PACIENTE");

        System.out.println("Ingrese el primer nombre del paciente: ");
        primerNombre = sc.next();
        f1.setPrimerNombre(primerNombre);

        System.out.println("Ingrese el apellido del paciente: ");
        apellido = sc.next();
        f1.setApellido(apellido);

        System.out.println("Ingrese la fecha de nacimiento: ");

        System.out.println("Mes: ");
        mes = Integer.parseInt(sc.next());
        f1.setMes(mes);

        System.out.println("Dia: ");
        dia = Integer.parseInt(sc.next());
        f1.setDia(dia);

        System.out.println("Año: ");
        anio = Integer.parseInt(sc.next());
        f1.setAnio(anio);

        System.out.println("El nombre del paciente es: "+ f1.getPrimerNombre());
        System.out.println("El apellido del paciente es: "+ f1.getApellido());
        System.out.println("La fecha de nacimiento del paciente es: " + f1.getDia()+"/"+f1.getMes()+"/"+f1.getAnio());
        System.out.println("La edad en años del paciente: "+ f1.FechaAnios());

        System.out.println("FRECUENCIAS CARDIACAS");

        System.out.println("La frecuencia cardiaca maxima que deberia tener el paciente es: "+f1.FrecuenciaCardiacaMax());
        System.out.println("La frecuencia cardiaca esperada del paciente son: "+f1.FrecuenciaCardiacaEsperada());

        //Constructor por parametros

        FrecuenciasCardiacas f2;

        System.out.println("DATOS DEL PACIENTE");

        System.out.println("Ingrese el primer nombre del paciente: ");
        primerNombre = sc.next();

        System.out.println("Ingrese el apellido del paciente: ");
        apellido = sc.next();

        System.out.println("Ingrese la fecha de nacimiento: ");

        System.out.println("Mes: ");
        mes = Integer.parseInt(sc.next());

        System.out.println("Dia: ");
        dia = Integer.parseInt(sc.next());

        System.out.println("Año: ");
        anio = Integer.parseInt(sc.next());

        f2 = new FrecuenciasCardiacas(primerNombre, apellido, mes, dia, anio);

        System.out.println("El nombre del paciente es: "+ f2.getPrimerNombre());
        System.out.println("El apellido del paciente es: "+ f2.getApellido());
        System.out.println("La fecha de nacimiento del paciente es: " + f2.getDia()+"/"+f2.getMes()+"/"+f2.getAnio());
        System.out.println("La edad en años del paciente: "+ f2.FechaAnios());

        System.out.println("FRECUENCIAS CARDIACAS");

        System.out.println("La frecuencia cardiaca maxima que deberia tener el paciente es: "+f2.FrecuenciaCardiacaMax());
        System.out.println("La frecuencia cardiaca esperada del paciente son: "+f2.FrecuenciaCardiacaEsperada());
    }
}