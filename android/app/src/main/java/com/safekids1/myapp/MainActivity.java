package com.safekids1.myapp;

import android.os.Bundle;
import com.getcapacitor.BridgeActivity;
import com.getcapacitor.Plugin;
import java.util.ArrayList;

public class MainActivity extends BridgeActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // FORCED INJECTION: Registers the hardware Geolocation tracking driver manually 
        // into Capacitor's startup engine layer so web layout buttons can talk to the phone GPS!
        registerPlugin(com.getcapacitor.plugins.geolocation.GeolocationPlugin.class);
    }
}
