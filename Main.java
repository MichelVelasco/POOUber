class Main {
    public static void main(String[] args) {
        //Tipo de clase ,  Nombre del objeto, = new methodo();
        UberX uberclassic = new UberX("SEF15SS", new Account("kalido", "3465"), "Chevrolet", "2012");
        uberclassic.setPassengers(4);
        uberclassic.printDataCar();
    
        //UberVan Van = new UberVan("F4ER156", new Account("kalido", "3465"));
        //Van.setPassengers(6);
        //Van.printDataCar();
        //Driver monito = new Driver("kalid", "SEFF121sD", 30, "Male");
        //monito.sexo = "female";
        //monito.printDriver();



    }
}