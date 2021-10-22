public abstract class Mobile{
    public int glass;
    public int speker;
    public String name;
    public int cemera;
    public float features;

    public void refreshRate(float features){
        this.features += features;
    }
    public void phoneDetails(){
        System.out.println(this.name +  " Mobile has " + this.glass+" glass "+ this.speker+" Speaker " 
        + this.cemera+" Cemera  Features: "+ this.features+" Hz Refresh rate" );
    }

    //abstract methods for Mobile classes
    public abstract void goTo();
}
