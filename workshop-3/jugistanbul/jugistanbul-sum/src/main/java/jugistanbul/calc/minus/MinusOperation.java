package jugistanbul.calc.minus;

import jugistanbul.calc.core.Operation;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Taner Diler (taner.diler@gmail.com)
 */
public class MinusOperation implements Operation {
    private Number[] values;

    public MinusOperation(Number... values) {
        this.values = values;
    }


    @Override
    public double calc() {
        Double sum = Arrays.stream(values).mapToDouble(n->n.doubleValue()).;
        return sum;
    }
}
