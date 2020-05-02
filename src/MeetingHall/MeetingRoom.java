
package MeetingHall;

import Customers.Customer;

public class MeetingRoom {
    private String meetingRunningId;
    private String meetingName;
    private Customer capacity[];
    private RoomStatus status;

    public MeetingRoom(String meetingRunningId) {
        this.meetingRunningId=meetingRunningId;
        this.meetingName = meetingName;
        this.capacity= new Customer[MeetingPolicy.MAXIMUM_PEOPLE_PER_MEETING_ROOM];
    }

    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName;
    }
    public String getMeetingRunningId() {
        return meetingRunningId;
    }

    public RoomStatus getStatus() {
        return status;
    }

    public void setStatus(RoomStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MeetingRoom{" + "meetingRunningId=" + meetingRunningId + ", meetingName=" + meetingName + ", status=" + status + '}';
    }
    

   

   
    
    
}
