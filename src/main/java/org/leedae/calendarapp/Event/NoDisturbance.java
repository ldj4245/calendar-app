package org.leedae.calendarapp.Event;

import org.leedae.calendarapp.Event.update.AbstractAuditableEvent;
import org.leedae.calendarapp.Event.update.CommonUpdatedto;

import java.time.ZonedDateTime;

public class NoDisturbance extends AbstractEvent {
    public NoDisturbance(int id, String title,
                         ZonedDateTime startAt, ZonedDateTime endAt){

        super(id,title,startAt,endAt);

    }

    @Override
    protected void update(AbstractAuditableEvent update) {


    }


    @Override
    public void print() {

        System.out.printf("[방해금지] %s : 시작시간 : %s, 끝 시간 :  %s%n",getTitle(),getStartAt(),getEndAt());

    }

    @Override
    public boolean supports(EventType type) {
        return type == EventType.NO_DISTURBANCE;
    }
}
