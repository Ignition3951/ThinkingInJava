package com.utk.design.pattern.template;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller {

    private static final Logger LOGGER = Logger.getLogger(Controller.class.getName());

    private List<Event> eventList = new ArrayList<>();
    public void addEvent(Event event) {
        eventList.add(event);
    }
    public void run() {
        while (!eventList.isEmpty()) {
            for(Event e: new ArrayList<>(eventList)){
                if (e.ready()) {
                    LOGGER.log(Level.INFO,()->""+e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}
