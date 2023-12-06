/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerpattern;

import java.util.ArrayList;
import java.util.List;


public class EventManager {
    public List<IEventListener> listeners = new ArrayList<>();
    
    public void AddListener(IEventListener listener)
    {
        listeners.add(listener);
    }
    
    public void RemoveListener(IEventListener listener)
    {
        listeners.remove(listener);
    }
    
    public void Notify()
    {
        for(IEventListener listener : listeners)
        {
            listener.Update();
        }
    }
}
