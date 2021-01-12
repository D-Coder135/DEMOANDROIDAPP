package shukla.devansh.DCoder135.mydemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import shukla.devansh.DCoder135.mydemoapp.definition.User;

// Execution Class for the Android App.
public class MainActivity extends AppCompatActivity {

    //main() method for the Android App.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nameEditText = findViewById(R.id.nameEditText);
        EditText emailEditText = findViewById(R.id.emailEditText);
        EditText phoneEditText = findViewById(R.id.phoneNumberEditText);
        EditText passwordEditText = findViewById(R.id.passwordEditText);


        Button registerButton = findViewById(R.id.registerButton);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                User user = initializeUserDetails(nameEditText, emailEditText, phoneEditText, passwordEditText);
                Toast.makeText(MainActivity.this,
                        user.toString() + " has been created!", Toast.LENGTH_LONG).show();
            }
        });
    }

    private User initializeUserDetails(EditText nameEditText, EditText emailEditText, EditText phoneEditText, EditText passwordEditText) {
        String name = nameEditText.getText().toString();
        String email = emailEditText.getText().toString();
        String phone = phoneEditText.getText().toString();
        String password = passwordEditText.getText().toString();
        User user = new User(name, email, phone, password);
        return user;
    }
}