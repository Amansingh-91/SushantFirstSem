package javaTut.LPU;

import java.util.HashMap;
import java.util.Map;

public class TicketItenary {

    public static void main(String[] args) {
        HashMap<String, String> ticket = new HashMap<>();
        ticket.put("Chennai", "Banglore");
        ticket.put("Bombay", "Delhi");
        ticket.put("Goa", "Chennai");
        ticket.put("Delhi", "Goa");

        HashMap<String,String> reverse = new HashMap<>();
        for (Map.Entry<String,String> a : ticket.entrySet()) {
            reverse.put(a.getValue(),a.getKey());

        }

        String start = null;

        for (Map.Entry<String,String> a : ticket.entrySet()) {
            if( !reverse.containsKey(a.getKey())){
                start = a.getKey();
                break;
            }

        }

        while (start != null) {
            System.out.println(start + "-> "+ ticket.get(start));
            start = ticket.get(start);
        }
    }
    
}
