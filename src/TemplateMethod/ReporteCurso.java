package TemplateMethod;

public class ReporteCurso extends ReporteAcademico{
    @Override
    public String generarReporte(String encabezado, String contenido, String pie) {
        return "Reporte Curso\nEncabezado:\n"+encabezado + "\n\nContenido:\n"+ contenido +"\n\nPie:\n"+ pie;
    }
}
