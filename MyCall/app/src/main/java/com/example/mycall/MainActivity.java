// MyInCallService.java
package com.example.mycall;

import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.telecom.InCallService;
import android.util.Log;

public class MyInCallService extends InCallService {
    private static final String TAG = "MyInCallService";

    @Override
    public void onCallAdded(Call call) {
        super.onCallAdded(call);
        Log.d(TAG, "onCallAdded: " + call);

        // Launch your custom full‑screen UI activity for the call
        Intent intent = new Intent(this, CallActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        // pass necessary data about the call
        intent.putExtra("CALL_ID", call.hashCode()); // example
        startActivity(intent);

        // Optionally attach listener for call state / disconnect
        call.registerCallback(new Call.Callback() {
            @Override
            public void onStateChanged(Call call, int state) {
                super.onStateChanged(call, state);
                Log.d(TAG, "Call state changed: " + state);
                if (state == Call.STATE_DISCONNECTED) {
                    // handle call end
                    call.unregisterCallback(this);
                }
            }
        });
    }

    @Override
    public void onCallRemoved(Call call) {
        super.onCallRemoved(call);
        Log.d(TAG, "onCallRemoved: " + call);
        // cleanup if needed
    }
}
