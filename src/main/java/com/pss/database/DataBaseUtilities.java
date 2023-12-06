package com.pss.database;

public class DataBaseUtilities {
    
    InsertApp insertApp;
    SelectApp selectApp;
    UpdateApp updateApp;
    DeleteApp deleteApp;
    
    public DataBaseUtilities()
    {
        insertApp = new InsertApp();
        selectApp = new SelectApp();
        updateApp = new UpdateApp();
        deleteApp = new DeleteApp();
    }
    
    public void createNewDatabase(String fileName) {
        DatabaseCreator.createNewDatabase(fileName);
    }

    public void createNewTable() {
        DatabaseCreator.createNewTable();
    }
    
    public void insert(String name, double capacity) {
        insertApp.insert(name, capacity);
    }
    
    public void selectAll(){
        selectApp.selectAll();
    }
    
    public void getCapacityGreaterThan(double capacity){
        selectApp.getCapacityGreaterThan(capacity);
    }
    
    public void update(int id, String name, double capacity) {
        updateApp.update(id, name, capacity);
    }
    
    public void delete(int id) {
        deleteApp.delete(id);
    }
}
