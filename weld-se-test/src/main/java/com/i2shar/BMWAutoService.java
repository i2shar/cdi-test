package com.i2shar;

import javax.inject.Named;

/**
 * Created by Tushar on 9/21/16.
 */
@Named("bmwService")
public class BMWAutoService implements AutoService {
    public void getService() {
        System.out.println("BMW Auto Service");
    }
}