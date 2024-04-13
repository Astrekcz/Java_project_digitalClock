package SingletonEnum;

public class Main {
    public static void main(String[] args) {
        ServerEnum ServerEnumA = ServerEnum.INSTANCE;
        ServerEnum ServerEnumB = ServerEnum.INSTANCE;
        String[] servershttp = {"www.seznam.cz", "www.youtube.com" ,"www.google.com", "www.novinky.cz"};

        for (int a = 0; a <= servershttp.length - 1; a++) {
            ServerEnumA.addServer(servershttp[a]);
        }
        System.out.println(ServerEnumA.getServers());
    }
}

