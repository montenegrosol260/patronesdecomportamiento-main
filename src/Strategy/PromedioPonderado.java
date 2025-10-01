package Strategy;

import java.util.List;

public class PromedioPonderado implements CalcularNota{
    private List<Double> pesos;

    public PromedioPonderado(List<Double> pesos) {
        this.pesos = pesos;
    }

    @Override
    public double calcular(List<Integer> notas) {
        if (notas == null || notas.isEmpty() || pesos == null || pesos.isEmpty() || notas.size() != pesos.size()) {
            return 0.0;
        }
        double sumaPonderada = 0.0;
        double sumaPesos = 0.0;
        for (int i = 0; i < notas.size(); i++) {
            sumaPonderada += notas.get(i) * pesos.get(i);
            sumaPesos += pesos.get(i);
        }
        return sumaPonderada / sumaPesos;
    }
}
