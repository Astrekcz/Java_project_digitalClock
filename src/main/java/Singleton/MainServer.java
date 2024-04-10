package Singleton;

import SingletonLazyType.Servers;

public class MainServer {
    public static void main(String[] args) {
        String[] servershttp = {"www.seznam.cz", "www.youtube.com" ,"www.google.com", "www.novinky.cz"};
        ServersEA servera =  ServersEA.getInstance();
        ServersEA serverb = ServersEA.getInstance();

        for (int a = 0; a <= servershttp.length - 1; a++) {
            servera.addServer(servershttp[a]);
        }
        System.out.println(servera.getServers());
    }
}

