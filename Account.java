class Account {
    Integer id;
    String name;
    String document;
    String email;
    String password;

    public Account(String name, String email){
        //el atributo de esta clase name THIS. es igual a la variable que recibe con el nombre de name.
        this.name = name;
        this.email = email;
    }
}