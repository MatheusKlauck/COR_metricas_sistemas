package program;

import service.calcMetricService;

public class Main {
    public static void main(String[] args) {
        calcMetricService cms = new calcMetricService();
        Double result = cms.calcMetric("cagr");
        System.out.printf("Resultado foi: %f%n", result);
    }
}
