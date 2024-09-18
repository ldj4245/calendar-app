package org.leedae.calendarapp.Event;

import org.leedae.calendarapp.Event.update.AbstractAuditableEvent;

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

    }

    @Override
    public boolean supports(EventType type) {
        return type == EventType.NO_DISTURBANCE;
    }
}
