package org.dhruvilacharya.eventticketplatform.services;

import org.dhruvilacharya.eventticketplatform.domain.CreateEventRequest;
import org.dhruvilacharya.eventticketplatform.domain.entities.Event;

import java.util.UUID;

public interface EventService  {

    Event createEvent(UUID organizer_id, CreateEventRequest event);

}
