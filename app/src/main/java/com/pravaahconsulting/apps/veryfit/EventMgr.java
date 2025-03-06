package com.pravaahconsulting.apps.veryfit;
import java.util.HashMap;
import java.util.Objects;

public class EventMgr {
    public static HashMap<String, Event> events = new HashMap<>();

    public interface Event {
        public void onCallBack(Object obj);
    }

    public static void addEvent(String name, Event event)
    {
        events.put(name, event);
    }

    public static void post(String name, Object obj)
    {
        if (events.containsKey(name)) {
            Objects.requireNonNull(events.get(name)).onCallBack(obj);
        }
    }
}
