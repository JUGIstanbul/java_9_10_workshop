package jugistanbul.service.plc;

import jugistanbul.service.core.DataService;

import java.util.Random;

public class PLCDataProvider implements DataService {

    private final Random random = new Random();

    public double getData() {
        return random.nextDouble();
    }

    @Override
    public String getName() {
        return "PLC";
    }
}