package eg.track.testfcm;

import android.app.Application;
import android.content.Intent;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        startService(new Intent(this, MyService.class));
    }
}
