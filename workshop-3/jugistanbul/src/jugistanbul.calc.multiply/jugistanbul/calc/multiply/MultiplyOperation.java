package jugistanbul.calc.multiply;

import jugistanbul.calc.core.Operation;

import java.util.Arrays;

/**
 * @author Taner Diler (taner.diler@gmail.com)
 */
public class MultiplyOperation implements Operation {

    private Number[] values;

    public MultiplyOperation(Number... values) {
        this.values = values;
    }

    @Override
    public Number calc() {
        return Arrays.stream(values).mapToDouble(v->v.doubleValue()).reduce(1, (a,b)->a*b);
    }
}
