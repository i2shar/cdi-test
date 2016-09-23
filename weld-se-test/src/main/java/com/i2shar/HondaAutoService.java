package com.i2shar;

import javax.enterprise.inject.Default;
import javax.inject.Named;

/**
 * Created by Tushar on 9/21/16.
 */
@Default
@Named("hondaService")
public class HondaAutoService implements AutoService {
    public void getService() {
        System.out.println("Honda Auto Service");
    }
}
