class Driver extends Account {
    Integer age;
    String sexo;
        
    public Driver(String name,String email,Integer age, String sexo){
        super(name, email);
        this.age = age;
        this.sexo = sexo;
    }

    void printDriver(){
        System.out.println("Name: " + name + " Email: " + email + "Age: " + age + "sexo: " + sexo);
    }

}