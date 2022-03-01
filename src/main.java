

public class main {
    public static void main(String[] args) {

        //instanciamos la clase calificaciones
        Calificaciones cal = new Calificaciones("Jair",new float[]{79,90,98,90,87});
        //se llaman a los metodos
        cal.promedio();
        cal.calFinal();
        cal.resultados();

    }
}
