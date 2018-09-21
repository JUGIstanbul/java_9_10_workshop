package jugistanbul.iot.app;

import jugistanbul.service.core.DataService;

import java.util.stream.IntStream;

/**
 * @author Taner Diler (taner.diler@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        DataService plcService = DataServiceProvider.getInstance().get("PLC");
        DataService opcService = DataServiceProvider.getInstance().get("OPC");

        IntStream.range(0, 5).mapToObj(i -> "PLC DATA : " + plcService.getData()).forEach(System.out::println);
        IntStream.range(0, 5).mapToObj(i -> "OPC DATA : " + opcService.getData()).forEach(System.out::println);
    }
}