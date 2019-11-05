package eg.track.testfcm;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // FirebaseMessaging.getInstance().isAutoInitEnabled();
        FirebaseMessaging.getInstance().setAutoInitEnabled(true);
        TextView textView = findViewById(R.id.textview);
        Bundle extras = getIntent().getExtras();
        FirebaseMessaging.getInstance().subscribeToTopic("12");
        if(extras != null){
            String type = extras.getString("type");
            String count = extras.getString("count");
            if (type != null)
                textView.setText(type);
        }
    }
}
