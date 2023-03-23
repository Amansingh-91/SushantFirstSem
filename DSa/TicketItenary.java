package javaTut.DSa;

import java.util.HashMap;


public class TicketItenary {
    public static void main(String[] args) {
        Ticket t1 = new Ticket("chennai", "banglore");
        Ticket t2 = new Ticket("bombay", "delhi");
        Ticket t3 = new Ticket("goa", "chennai");
        Ticket t4 = new Ticket("delhi", "goa");
        Ticket arr[] = {t1,t2,t3,t4};

        HashMap<String,String> tickets = new HashMap<>();
        HashMap<String,String> revtickets = new HashMap<>();
        for (Ticket ticket : arr) {
            tickets.put(ticket.source, ticket.des);
            revtickets.put(ticket.des, ticket.source);
        }
        String start ="";
        for (String source: tickets.keySet()) {
            if(!revtickets.containsKey(source)){
                start = source;
                break;
            }
        }
        System.out.print(start+"->");
        int n =  tickets.size();
        for (int i = 0; i < n; i++) {
            if(tickets.containsKey(start)){
                System.out.print(tickets.get(start)+"->");
                start = tickets.get(start);
            }

        }


    }
}
class Ticket{
    String source;
    String des;
    public Ticket(String source,String des){
        this.source = source;
        this.des = des;
    }
}
