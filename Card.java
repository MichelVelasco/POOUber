class Card extends Payments{
    Integer number;
    Integer cvu;
    String date;

    public Card(Integer id, Integer number, Integer cvu, String date){
        super(id);
        this.number = number;
        this.cvu = cvu;
        this.date = date;
    }
    
}