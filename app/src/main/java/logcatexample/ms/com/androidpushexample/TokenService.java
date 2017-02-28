package logcatexample.ms.com.androidpushexample;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by admin on 27/02/2017.
 */

public class TokenService extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();

        try {

            String refreshedToken = FirebaseInstanceId.getInstance().getToken();
            Log.w("Firbase id login", "Refreshed token: " + refreshedToken);
            sendRegistrationToServer(refreshedToken);
        } catch (Exception e) {

        }
    }

    private void sendRegistrationToServer(String token) {
    }

}
