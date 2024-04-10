package Singleton;

import java.util.ArrayList;
import java.util.List;

public class ServersEA {
    private static final ServersEA Instance = new ServersEA();

    public static ServersEA getInstance() {
        return Instance;
    }
    private ServersEA(){

    }
    private List<String> servers = new ArrayList<>();

    public void addServer(final String server){
        servers.add(server);

    }

    public List<String> getServers() {
        return servers;
    }
}
