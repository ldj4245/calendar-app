package org.leedae.calendarapp;

import org.leedae.calendarapp.Event.*;
import org.leedae.calendarapp.Event.update.UpdateMeeting;
import org.leedae.calendarapp.reader.EventCsvReader;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.List;


public class CalendarAppApplication {

    public static void main(String[] args) throws IOException {
        Schedule schedule = new Schedule();


        EventCsvReader csvReader = new EventCsvReader();
        String meetingCsvPath = "/data/meeting.csv";

        List<Meeting> meetings = csvReader.readMeetings(meetingCsvPath);
        meetings.forEach(schedule::add);

        meetings.get(0).validateAndUpdate(
                new UpdateMeeting(
                        "new title",
                        ZonedDateTime.now(),
                        ZonedDateTime.now().plusHours(1),
                        null,
                        "A",
                        "new agenda"


                )
        );



        schedule.printAll();

    }

}
