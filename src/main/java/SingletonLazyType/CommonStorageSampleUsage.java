package SingletonLazyType;

public class CommonStorageSampleUsage {
    public static void main(String[] args) {
        CommonStorage commonStorageA = CommonStorage.getInstance();
        // instance je vztvorena prave ted
        CommonStorage commonStorageB = CommonStorage.getInstance();
        // druhy pristup k predchozi vytvorene instanci

        System.out.println(commonStorageA == commonStorageB); // true

        commonStorageA.addValue(1);
        commonStorageB.addValue(2);

        System.out.println(commonStorageA.getValues());
    }
}
