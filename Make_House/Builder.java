public class Builder {
    public static void main(String[] args) {
        //construct a building type house.
        House building = new House();
        building.walls=8;
        building.doors=2;
        building.windows=4;
        building.location="Dhaka";
        building.nameplate="kishna_cura";
        
        building.printNameplate();

        //construct a mondhir type house default constrctor.
        House mondhir = new House();
        mondhir.location = "Rajshahi";
        mondhir.nameplate = "Radha_Krishna";
        
        mondhir.printNameplate();
        
    
        
    }
}
