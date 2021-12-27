package com.nexgen;

import com.nexgen.model.Service;

public class SingletonMain {

    public static void main(String[] args){
        Service service = Service.getInstance();
        System.out.println(service);

        service = Service.getInstance();
        System.out.println(service);

    }
}
