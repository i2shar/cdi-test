package com.i2shar;

import org.jboss.weld.environment.se.events.ContainerInitialized;

import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Tushar on 9/21/16.
 */
public class AutoServiceCallerImpl implements AutoServiceCaller {


    @Inject @Named("bmwService")
    private AutoService autoService;

    public void callAutoService() {
        autoService.getService();
    }


    public void start(@Observes ContainerInitialized event) {
        this.autoService.getService();
    }
}