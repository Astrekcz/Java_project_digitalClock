package SingletonEnum;

import java.util.ArrayList;
import java.util.List;

public enum ServerEnum {
    INSTANCE;

    private List<String> servers = new ArrayList<>();

    public void addServer(final String server) {
        servers.add(server);
    }

    public List<String> getServers() {
        return servers;
    }
}
