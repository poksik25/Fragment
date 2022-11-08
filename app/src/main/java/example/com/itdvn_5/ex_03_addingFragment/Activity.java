package example.com.itdvn_5.ex_03_addingFragment;


import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import example.com.itdvn_5.R;

public class Activity extends AppCompatActivity {
    private FragmentManager mFragmentManager;
    private FragmentTransaction mFragmentTransaction;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.ex_03_main);

        mFragmentManager = getFragmentManager();
    }

    public void onClick(View v) {
        mFragmentTransaction = mFragmentManager.beginTransaction();
        switch (v.getId()) {
            case R.id.button1:
                BlueFragment bluefragment = new BlueFragment();
                mFragmentTransaction.add(v.getId(), R.id.linea111, bluefragment);
                break;
            case R.id.button2:
                RedFragment redfragment = new RedFragment();
                mFragmentTransaction.add(R.id.linea111, redfragment);
                break;
        }
        mFragmentTransaction.commit();

    }
}