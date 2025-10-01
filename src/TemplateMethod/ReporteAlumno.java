package TemplateMethod;

public class ReporteAlumno extends ReporteAcademico{
    @Override
    public String generarReporte(String encabezado, String contenido, String pie) {
        return "Reporte Alumno\nEncabezado:\n"+encabezado + "\n\nContenido:\n"+ contenido +"\n\nPie:\n"+ pie;
    }
}
