public class Activity_Getting_starte_with_Java {
    public static void main (String [] args)
    {
        String FirstName = "Sandy";
        String LastName = "Jones";
        String Movie = "The Source Code";
        int NumberOfTickets = 8;
        double PricePerTicket = 10.57;
        System.out.println(
                "First Name: "+ FirstName + "\n" +
                "Last Name:  "+ LastName+ "\n" +
                "Movie:"+ Movie + "\n" +
                "Number of Tickets: "+ NumberOfTickets + "\n" +
                "Price per ticket:" + PricePerTicket);

        //TODO 2: Calculate the total price based on number of tickets and price per ticket. Print the output of the total price
        double TotalPrice ;
        TotalPrice = NumberOfTickets * PricePerTicket;
        System.out.println("Total Price of tickets: " +TotalPrice );

        //TODO 3: Concatenate first name and last name into new variable username with
        String username = FirstName.toLowerCase() + LastName.toLowerCase();
        // no space in between first and last name and convert them to lower case 
        System.out.println("username: "+ username);
    }
}