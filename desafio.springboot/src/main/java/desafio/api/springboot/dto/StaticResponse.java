package desafio.api.springboot.dto;

import java.util.DoubleSummaryStatistics;

public class StaticResponse {
    
    private long cont;
    private double sum;
    private double avg;
    private double min;
    private double max;

    public StaticResponse(DoubleSummaryStatistics stats){

        this.cont = stats.getCount();
        this.sum = stats.getSum();
        this.avg = stats.getAverage();
        this.min = stats.getMin();
        this.max = stats.getMax();

    }

    public long getCont() {
        return cont;
    }
    public double getSum() {
        return sum;
    }
    public double getAvg() {
        return avg;
    }
    public double getMin() {
        return min;
    }
    public double getMax() {
        return max;
    }
}
