package Decorator;

public class DisplayCountersDecorator implements FragStatictics{

    private final FragStatictics fragStatictics;

    public DisplayCountersDecorator(FragStatictics fragStatictics) {
        this.fragStatictics = fragStatictics;
    }

    @Override
    public int incrementFragCount() {
        int FragCount = fragStatictics.incrementFragCount();
        System.out.println("your frag count is now " + FragCount);
        return FragCount;
    }

    @Override
    public int incrementDeathCount(){
        int DeathCount = fragStatictics.incrementDeathCount();
        System.out.println("Your death count is now " + DeathCount);
        return DeathCount;
    }

    @Override
    public void reset(){
        fragStatictics.reset();
        System.out.println("Stats reset - KDR is equal to 0");
    }
}
