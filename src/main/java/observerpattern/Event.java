/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerpattern;

/**
 *
 * @author santa
 */
public class Event {
    private final String operation;
    private final String userName;
    private final String date;
    private final String time;
    private final EventType type;
    
    public Event(EventType type, String operation, String userName, String date, String time)
    {
        this.operation = operation;
        this.userName = userName;
        this.date = date;
        this.time = time;
        this.type = type;
    }
    
    public EventType GetType()
    {
        return type;
    }
}
