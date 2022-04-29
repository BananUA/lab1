    public record Conference(String nameConference, Integer numberOfParticipants, Integer ticketPrice,  String сityOfConference){
    //variables

    private static int priceOfTicket = 50;


    //constructors
    public Conference(){
        this("Native ads", 25,60 , "London");
    }
    public Conference(String nameConference, Integer numberOfParticipants){
        this(nameConference, numberOfParticipants, 60, "London");
    }
        //methods
     public String conferenceToString() {
        return "Conference name: "+ nameConference + " Particepants: "+ numberOfParticipants().toString() + "Ticket price: " + ticketPrice.toString() + " Conference city  "+сityOfConference.toString();
    }


    public static int getPriceOfTicket(int priceOfTicket){
        return priceOfTicket;
    }
}
