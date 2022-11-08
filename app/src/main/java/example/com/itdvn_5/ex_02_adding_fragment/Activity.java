package example.com.itdvn_5.ex_02_adding_fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import example.com.itdvn_5.R;

public class Activity extends AppCompatActivity {
    private FragmentManager fragmentManager;
    private FirstFragment firstFragment;
    private SecondFragment secondFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_02_main_layout);

        firstFragment = new FirstFragment();
        secondFragment = new SecondFragment();

        fragmentManager = getFragmentManager();
    }

    public void click(View view) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//
//        switch (view.getId()) {
//            case R.id.add :
//
//                if (fragmentManager.findFragmentByTag(FirstFragment.TAG) == null) {
//                    fragmentTransaction.add(R.id.liner_laout,firstFragment,FirstFragment.TAG);
//                }
//
//                break;
//            case R.id.remove :
//
//                if (fragmentManager.findFragmentByTag(SecondFragment.TAG) != null) {
//                    fragmentTransaction.remove(secondFragment);
//                }
//
//                if (fragmentManager.findFragmentByTag(FirstFragment.TAG) != null) {
//                    fragmentTransaction.remove(firstFragment);
//                }
//
//                break;
//            case R.id.replace :
//                if (fragmentManager.findFragmentByTag(SecondFragment.TAG) != null) {
//                    fragmentTransaction.replace(R.id.liner_laout, firstFragment, FirstFragment.TAG);
//                }
//
//                if (fragmentManager.findFragmentByTag(FirstFragment.TAG) != null) {
//                    fragmentTransaction.replace(R.id.liner_laout, secondFragment, SecondFragment.TAG);
//                }
//
//        }

        fragmentTransaction.commit();
    }

}

