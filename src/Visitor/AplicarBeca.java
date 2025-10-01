package Visitor;

public class AplicarBeca implements Visitor {
    @Override
    public String visitar(AlumnoRegular a) {
        return "Alumno "+a.getNombre()+"\n"+"No corresponde Beca";
    }
    public String visitar(AlumnoBecado a) {
        return "Alumno "+a.getNombre()+"\n"+"Corresponde Beca\nPeriodo: 1 Año\nBeneficios: 10% descuento en alícuota\nRequisitos: Promedio mayor a 8 en todas las materias en curso";
    }
}
