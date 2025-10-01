package Strategy;

import java.util.List;

public class PromedioSimple implements CalcularNota{
    @Override
    public double calcular(List<Integer> notas) {
        if (notas == null || notas.isEmpty()) {
            return 0.0;
        }
        int suma = 0;
        for (Integer nota : notas) {
            suma += nota;
        }
        return (double) suma / notas.size();
    }
}
