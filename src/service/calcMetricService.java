package service;

import java.util.ArrayList;
import java.util.List;

public class calcMetricService {
    public Double calcMetric(String metricName) {
        metric cagr = new cagr();
        cagr.setNextMetric(new drawdown())
                .setNextMetric(new percentualVariation());
        List<Double> serie = new ArrayList<>();
        serie.add(30.);
        serie.add(33.3);
        serie.add(66.6);
        serie.add(60.);
        return cagr.calcMetric(metricName, serie);
    }
}
