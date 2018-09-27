package jugistanbul.iot.app;


import jugistanbul.service.core.DataService;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;

/**
 * @author Taner Diler (taner.diler@gmail.com)
 */
public class DataServiceProvider
{
    private static class SingletonHelper
    {
        public static final DataServiceProvider instance = new DataServiceProvider();
    }

    private static Map<String, DataService> serviceProviders = new HashMap<>();


    @SuppressWarnings("unchecked")
    private DataServiceProvider()
    {
        ServiceLoader loader = ServiceLoader.load(DataService.class);
        Iterator<DataService> iterator = loader.iterator();
        while(iterator.hasNext())
        {
            DataService serviceImpl = iterator.next();
            serviceProviders.put(serviceImpl.getName(), serviceImpl);
        }
    }

    public static DataServiceProvider getInstance()
    {
        return SingletonHelper.instance;
    }

    public DataService get(String name)
    {
        return serviceProviders.get(name);
    }

}
