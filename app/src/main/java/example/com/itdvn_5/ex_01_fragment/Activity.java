package example.com.itdvn_5.ex_01_fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import example.com.itdvn_5.R;

public class Activity extends AppCompatActivity {
    private TextView textView;
    private EditText login;
    private EditText password;
    private String realLogin;
    private String realPass;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_01_main);

        realLogin = "Grec";
        realPass = "12345";

        textView = findViewById(R.id.textView);
        login = findViewById(R.id.login);
        password = findViewById(R.id.password);

        Button button = findViewById(R.id.log_btn);
        button.setOnClickListener(this::click);

    }

    public void click(View view) {
        String loginTxt = login.getText().toString();
        String passwordTxt = password.getText().toString();
        String text = (loginTxt.equals(realLogin) && passwordTxt.equals(realPass)) ? loginTxt + " you entred succsessful"
                : " Incorrected login or password";
        textView.setText(text);
    }
}
