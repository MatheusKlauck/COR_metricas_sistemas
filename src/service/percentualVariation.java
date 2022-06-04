package service;

import java.util.List;

public class percentualVariation extends metric {
    @Override
    Double calcMetric(String metricName, List<Double> serie)  {
        if(metricName == "var") {
            System.out.println("Calculou a variação percentual");
            return 300.;
        }
        return -999.99;
    }
}
