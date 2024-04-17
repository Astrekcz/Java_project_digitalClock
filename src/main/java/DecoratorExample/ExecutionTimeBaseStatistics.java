package DecoratorExample;

import java.util.List;

public class ExecutionTimeBaseStatistics implements StatisticsLogger{
    private final List<Double> executionTimes;

    public ExecutionTimeBaseStatistics(final List<Double> executionTimes) {
        this.executionTimes = executionTimes;
    }

    @Override
    public void displayStatistics() {
        final StringBuilder stringBuilder = new StringBuilder();
        executionTimes.forEach(executionTime -> stringBuilder.append("Execution time: ").append(executionTime).append(""));
                System.out.println(stringBuilder.toString());
    }

    @Override
    public List<Double> getExecutionTimes() {
        return executionTimes;
    }
}
