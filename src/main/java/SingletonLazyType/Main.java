package SingletonLazyType;

public class Main {
    public static void main(String[] args) {
    String[] servershttp = {"www.seznam.cz", "www.youtube.com" ,"www.google.com", "www.novinky.cz"};
    Servers servera =  Servers.getinstance();
    Servers serverb = Servers.getinstance();

    for (int a = 0; a <= servershttp.length - 1; a++) {
        servera.addServer(servershttp[a]);
    }
    System.out.println(servera.getServers());
    }
}
