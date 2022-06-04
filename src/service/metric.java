package service;

import java.util.List;

public abstract class metric {
    protected metric nextMetric = null;

    public metric setNextMetric(metric next) {
        this.nextMetric = next;
        return next;
    }

    Double calcMetric(String metricName, List<Double> serie) {
        if (this.nextMetric != null) {
            return this.nextMetric.calcMetric(metricName, serie);
        }
        return 0.;
    }
}
