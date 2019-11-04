package eg.track.testfcm.fcm;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    private final static String TAG = "FCM Service";

    @Override
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
      //  super.onMessageReceived(remoteMessage);
        Log.i(TAG, "onMessageReceived: Sent MSSG From FcM");
    }
}
