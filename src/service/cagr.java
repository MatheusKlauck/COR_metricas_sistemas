package service;

import java.util.List;

public class cagr extends metric {
    @Override
    Double calcMetric(String metricName, List<Double> serie) {
        if(metricName == "cagr") {
            System.out.println("Calculou o cagr");
            return 125.0;
        }
        return super.calcMetric(metricName, serie);
    }
}
