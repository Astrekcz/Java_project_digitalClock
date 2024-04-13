package SingletonLazyType;

import java.util.ArrayList;
import java.util.List;

public class Servers {
    private static Servers Instance;

    public static Servers getinstance() {
        synchronized (Servers.class){

            if (Instance == null){

                Instance = new Servers();

            }return Instance;

        }
    }
    private List<String> servers = new ArrayList<>();

    private Servers(){

    }
    public boolean addServer(final String server){
        servers.add(server);
        if (server==""){
            return false;
        }else return true;
    }
    public List<String> getServers(){
        return servers;
    }
}
