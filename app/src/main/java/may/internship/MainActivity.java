package may.internship;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.main_button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Login Successfully");
                Log.d("Login", "Login Successfully");
                Log.e("Login", "Login Successfully");

                Toast.makeText(MainActivity.this,"Login Successfully",Toast.LENGTH_SHORT).show();
                /*Snackbar snackbar=Snackbar.make(relativeLayout,"Login Successfully",Snackbar.LENGTH_LONG);
                snackbar.show();
                */
                Snackbar.make(view,"Login Successfully",Snackbar.LENGTH_LONG).show();
            }
        });
    }
}