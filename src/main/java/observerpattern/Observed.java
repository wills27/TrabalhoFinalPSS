/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerpattern;

import java.util.ArrayList;
import java.util.List;


public class Observed {
    private List<IObserver> listeners;
    
    public Observed()
    {
        listeners = new ArrayList<>();
    }
    
    public void AddListener(IObserver listener)
    {
        listeners.add(listener);
    }
    
    public void RemoveListener(IObserver listener)
    {
        listeners.remove(listener);
    }
    
    public List<IObserver> getObservers()
    {
        return listeners;
    }
    
    public void Notify(String eventName)
    {
        for(IObserver listener : listeners)
        {
            listener.Update(eventName);
        }
    }
}
