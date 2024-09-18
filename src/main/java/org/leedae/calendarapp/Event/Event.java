package org.leedae.calendarapp.Event;

public interface Event {
    void print();


    boolean supports(EventType type);
}
