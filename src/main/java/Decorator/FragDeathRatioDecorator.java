package Decorator;

public class FragDeathRatioDecorator implements FragStatictics{

    private final FragStatictics fragStatictics;

    private Integer currentFragCount = null;
    private Integer currentDeathCount = null;

    public FragDeathRatioDecorator(FragStatictics fragStatictics) {
        this.fragStatictics = fragStatictics;
    }
    //public void DisplayFragDeathsRation()
    @Override
    public int incrementFragCount(){
        currentFragCount = fragStatictics.incrementFragCount();

        DisplayFragDeathsRation();
        return currentFragCount;
        }
    }


    @Override
    public int incrementDeathCount(){
        
    }

    private void DisplayFragDeathsRation(){

}
