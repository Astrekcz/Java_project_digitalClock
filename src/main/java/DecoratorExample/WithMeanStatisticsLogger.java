package DecoratorExample;

import java.util.List;

public class WithMeanStatisticsLogger implements StatisticsLogger{
    private final StatisticsLogger statisticsLogger;

    public WithMeanStatisticsLogger(StatisticsLogger statisticsLogger) {
        this.statisticsLogger = statisticsLogger;
    }
    
    @Override
    public List<Double> getExecutionTimes(){
        return  statisticsLogger.getExecutionTimes();
    }

    @Override
    public void displayStatistics(){
        final Double mean = getExecutionTimes().stream().mapToDouble(x -> x).sum() /
                getExecutionTimes().size();

    }


}


