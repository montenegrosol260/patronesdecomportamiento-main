package Visitor;

import Command.Alumno;

public class AlumnoBecado extends Alumno implements AceptVisitor {
    public AlumnoBecado(int Legajo, String nombre) {
        super(Legajo, nombre);
    }
    @Override
    public String aceptar(Visitor v){
        return v.visitar(this);
    }
}
