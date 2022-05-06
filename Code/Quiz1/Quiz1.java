public class Quiz1 {

    public static void main(String[] args) {

        
    }


    // Return the name of the venue which made the least amount of money from all their concerts combined
    public String leastMoneyMade() {

        String leastVenue = "";
        double leastRevenue = Integer.MAX_VALUE; //cast to double (double)

        for (String venue : concertByVenue.keySet()) {
            double combinedVenueRevenue = 0;
            List<Concert> concerts = concertByVenue.get(venue);
            if (concerts != null) {
                for (Concert concert : concerts) {
                    combinedVenueRevenue += concert.concertRevenue();
                }
                if (combinedVenueRevenue < leastRevenue) {
                    leastRevenue = combinedVenueRevenue;
                    leastVenue = venue;
                }
            }
        }
        return leastRevenue; //Returned the wrong answer here: need to return leastVenue
    }
    
}
