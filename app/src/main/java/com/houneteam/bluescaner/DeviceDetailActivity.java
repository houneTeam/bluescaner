package com.houneteam.bluescaner;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DeviceDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_detail);

        TextView deviceNameTextView = findViewById(R.id.device_name);
        TextView deviceAddressTextView = findViewById(R.id.device_address);
        TextView deviceBondStateTextView = findViewById(R.id.device_bond_state);

        // Retrieve device information passed from MainActivity
        String deviceName = getIntent().getStringExtra("DEVICE_NAME");
        String deviceAddress = getIntent().getStringExtra("DEVICE_ADDRESS");
        int bondState = getIntent().getIntExtra("DEVICE_BOND_STATE", -1);

        // Display device details
        deviceNameTextView.setText("Name: " + (deviceName != null ? deviceName : "Unknown"));
        deviceAddressTextView.setText("Address: " + deviceAddress);
        deviceBondStateTextView.setText("Bond State: " + (bondState == 12 ? "Bonded" : "Not Bonded"));
    }
}
