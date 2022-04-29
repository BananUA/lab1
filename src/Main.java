
public class Main {
    public static void main(String args[]) {
        int price = 40;
        Conference conference = new Conference();
        Conference conference1 = new Conference("Global warming",88,40, "Poznan");
        Conference conference2 = new Conference("Ecology",55);



        System.out.println(conference.conferenceToString());
        System.out.println(conference1.conferenceToString());
        System.out.println(conference2.conferenceToString());
        System.out.println(conference.getPriceOfTicket(price));
    }
}