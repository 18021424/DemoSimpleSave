package sg.edu.rp.c346.demosimplesave;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);

        String msg = prefs.getString("greetings","No greetings!");

        Toast toast = Toast.makeText(MainActivity.this,msg,Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);

        SharedPreferences.Editor preEdit = prefs.edit();

        preEdit.putString("greetings","Hello!");

        preEdit.commit();
    }
}
