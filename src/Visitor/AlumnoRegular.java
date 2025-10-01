package Visitor;

import Command.Alumno;

public class AlumnoRegular extends Alumno implements AceptVisitor {
    public AlumnoRegular(int Legajo, String nombre) {
        super(Legajo, nombre);
    }
    @Override
    public String aceptar(Visitor v){
        return v.visitar(this);
    }
}
