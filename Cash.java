class Cash extends Payments {
    Integer ammount;

    public Cash(Integer id, Integer ammount){
        super(id);
        this.ammount = ammount;
    }
}