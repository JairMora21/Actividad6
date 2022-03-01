

public class Calificaciones {

    //Declaramos los atributos de la clase calificaciones
    String nombre;
    float [] calificacion = new float[5];

    //declaramos el costructor
    public Calificaciones(String nombre, float[] calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    //Declaramos los getters an setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float[] getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float[] calificacion) {
        this.calificacion = calificacion;
    }


    //implementamos el metodo promedio
    public float promedio(){
        //declaramos las c¿variables
        float suma = 0;
        float promedioFinal;
        //Hacemos un for para ir almacenando las calificaciones
        for (int i = 0; i<calificacion.length; i++){
            suma += calificacion[i];
        }
        //realizamos la operacion para sacar el promedio
        promedioFinal = suma / calificacion.length;
        //retornamos el promedio
        return promedioFinal;
    }

    //implementamos el metodo calfinal
    public char calFinal(){
        //declaramos las variables
        char nota = 'a';
        float promedioFinal = promedio();

        //implementamos los if else para saber que nota final tendra
        if (promedioFinal < 50){
            nota = 'F';
        }
        else if (promedioFinal >= 51 && promedioFinal <= 60){
            nota = 'E';
        }
        else if (promedioFinal >= 61 && promedioFinal <= 70){
            nota = 'D';
        }
        else if (promedioFinal >= 71 && promedioFinal <= 80){
            nota = 'C';
        }
        else if (promedioFinal >= 81 && promedioFinal <= 90){
            nota = 'B';
        }
        else if (promedioFinal >= 91 && promedioFinal <= 100){
            nota = 'A';
        }
        else {
            System.out.println("Promedio no valido");
        }
        //retornamos la nota
        return nota;
    }

//implementamos el metodo resultados
    public void resultados(){
        //imprimimos el nombre del estudiante
        System.out.println("Nombre del estudiante: " + nombre);
        //imprimimos las calificaciones
        for (int i = 0; i<calificacion.length; i++){
            System.out.println("Calificacion " + (i+1) + " es: " + calificacion[i]);
        }
//imprimimos el promedio y la calificacion final
        System.out.println("El promedio es: " + promedio());
        System.out.println("Su calificacion final es: " + calFinal());
    }
}
