package com.safekids1.myapp;

import android.os.Bundle;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Modern Capacitor 6 auto-registers your plugins.
        // Keeping this method block empty prevents code duplication compile crashes.
    }
}
