package jugistanbul.calc.minus;

import jugistanbul.calc.core.Operation;
import java.util.stream.IntStream;

/**
 * @author Taner Diler (taner.diler@gmail.com)
 */
public class MinusOperation implements Operation {
    private Number[] values;

    public MinusOperation(Number... values) {
        this.values = values;
    }


    @Override
    public Number calc() {
        Double result = IntStream
                .range(1,values.length)
                .mapToDouble(i->values[i].doubleValue())
                .reduce(values[0].doubleValue(), (a,b)->a-b);
        return result;
    }
}
