package com.nexgen.model;

/**
 * Singleton Pattern implemented for Service class
 */
public class Service {

    //1. Create Static field for Singleton Class instance
    private static Service service;

    //2. Define constructor private so nobody can create object
    private Service(){

    }

    //3. Provide method which will give instance of Singleton class
    public static Service getInstance(){
        //3.1 check whether service instance is null or not
        if(service == null) {
            //3.2 Scenario when there are more than 1 thread trying to get instance same time reach this method
            synchronized (Service.class) {
                //3.3 In multithreading, so we are making sure other threads are not created object of service class
                if (service == null) {
                    service = new Service();
                }
            }
        }
        //4. Return service class instance
        return service;
    }
}
