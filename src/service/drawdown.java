package service;

import java.util.List;

public class drawdown extends metric {
    @Override
    Double calcMetric(String metricName, List<Double> serie) {
        if(metricName == "drawdown") {
            System.out.println("Calculou o drawdown");
            return -23.5;
        }
        return super.calcMetric(metricName,serie);
    }
}
