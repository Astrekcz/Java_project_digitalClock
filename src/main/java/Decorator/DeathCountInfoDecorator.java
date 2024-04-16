package Decorator;

public class DeathCountInfoDecorator implements FragStatictics{

    private final FragStatictics fragStatictics;

    public DeathCountInfoDecorator(FragStatictics fragStatictics) {
        this.fragStatictics = fragStatictics;
    }

    @Override
    public int incrementFragCount(){
        return fragStatictics.incrementFragCount();
    }

    @Override
    public int incrementDeathCount(){
        System.out.println("Fragged by the enemy");

        return fragStatictics.incrementDeathCount();
    }



    @Override
    public void reset(){
        fragStatictics.reset();
    }
}
