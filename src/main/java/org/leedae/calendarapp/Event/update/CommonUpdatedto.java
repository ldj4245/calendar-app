package org.leedae.calendarapp.Event.update;

import java.time.ZonedDateTime;

public class CommonUpdatedto extends AbstractAuditableEvent {
    public CommonUpdatedto(String title, ZonedDateTime startAt, ZonedDateTime endAt) {
        super(title, startAt, endAt);
    }
}
