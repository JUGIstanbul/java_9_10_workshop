package jugistanbul.service.opc;

import jugistanbul.service.core.DataService;

import java.util.Random;

public class OPCDataProvider implements DataService {

    private final Random random = new Random();

    public double getData() {
        return random.nextDouble();
    }

    @Override
    public String getName() {
        return "OPC";
    }
}