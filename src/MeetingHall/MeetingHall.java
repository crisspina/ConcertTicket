
package MeetingHall;

public class MeetingHall {

private MeetingRoom[] meetingRoom;
private int countRoom;

    public MeetingHall() {
        this.meetingRoom=new MeetingRoom[MeetingPolicy.MAXIMUM_PEOPLE_PER_MEETING_ROOM];
        createMeetingId();
    }

    private void createMeetingId() {
        for (int i = 0; i < meetingRoom.length; i++) {
            meetingRoom[i]=new MeetingRoom("room id"+(i+1));
        }
    }
       
}
