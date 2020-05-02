
package Ticket;

public class Ticket {
    private String meetingName;
    private String ticketId;
    private int ticketPrice;

    public Ticket() {        
    }

    public String getMeetingName() {
        return meetingName;
    }
    //ไม่เเน่ใจ

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "Ticket{" + "meetingName=" + meetingName + ", ticketId=" + ticketId + ", ticketPrice=" + ticketPrice + '}';
    }
   
}
