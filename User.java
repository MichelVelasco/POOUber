class User extends Account {

    Integer ranked;

    public User(String name,String email, Integer ranked){
        super(name, email);
        this.ranked = ranked;
    }
    
}