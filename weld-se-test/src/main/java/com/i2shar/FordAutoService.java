package com.i2shar;

import javax.inject.Named;

/**
 * Created by Tushar on 9/21/16.
 */
@Named("fordService")
public class FordAutoService implements AutoService {
    public void getService() {
        System.out.println("Ford Auto Service");
    }
}
