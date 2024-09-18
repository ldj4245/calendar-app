package org.leedae.calendarapp.Event;

import org.leedae.calendarapp.Event.update.AbstractAuditableEvent;

import java.time.ZonedDateTime;

public class OutOfOffice extends AbstractEvent {


    public OutOfOffice(int id, String title,
                       ZonedDateTime startAt, ZonedDateTime endAt) {
        super(id, title,startAt, endAt);
    }

    @Override
    protected void update(AbstractAuditableEvent update) {

    }


    @Override
    public void print() {

    }

    @Override
    public boolean supports(EventType type) {
        return type == EventType.OUT_OF_OFFICE;
    }
}
