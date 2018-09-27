package jugistanbul.service.plc;

import jugistanbul.service.core.DataService;
import java.util.Random;

/**
 * @author Taner Diler (taner.diler@gmail.com)
 */
public class PLCDataProvider implements DataService {

    private final Random random = new Random();

    @Override
    public double getData() {
        return random.nextDouble();
    }

    @Override
    public String getName() {
        return "PLC";
    }
}