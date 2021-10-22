public class Realme extends Mobile {

    public String color;

    @Override
    public void phoneDetails(){
        System.out.println(this.name +  " Mobile has " + this.glass+" glass, "+ this.speker+" Speaker, " 
        +this.color+" Color, " + this.cemera+" Cemera, Features: "+ this.features+" Hz Refresh rate." );
    }
    
    @Override
    public void goTo(){
        System.out.println("Go to Realme store!!");
    }

    
}
