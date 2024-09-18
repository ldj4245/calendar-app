package org.leedae.calendarapp.Event;

import org.leedae.calendarapp.Event.update.AbstractAuditableEvent;
import org.leedae.calendarapp.Event.update.UpdateMeeting;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.Set;

public class Meeting extends AbstractEvent {

    private Set<String> participants;
    private String meetingRoom;
    private String agenda;


    public Meeting(int id, String title,
                   ZonedDateTime startAt, ZonedDateTime endAt,
                   Set<String> participants, String meetingRoom, String agenda) {
        super(id, title, startAt, endAt);

        this.participants = participants;
        this.meetingRoom = meetingRoom;
        this.agenda = agenda;
    }

    @Override
    public void print() {
        System.out.printf("[회의] %s : %s%n",getTitle(),agenda);

    }

    @Override
    public boolean supports(EventType type) {
        return type == EventType.MEETING;
    }


    //자식 클래스에 있는 필드에 접근하기 위해 다운 캐스팅 함.
    @Override
    protected void update(AbstractAuditableEvent update) {
        UpdateMeeting meeting = (UpdateMeeting) update;

        this.participants = meeting.getParticipants();
        this.meetingRoom = meeting.getMeetingRoom();
        this.agenda = meeting.getAgenda();
    }
}
