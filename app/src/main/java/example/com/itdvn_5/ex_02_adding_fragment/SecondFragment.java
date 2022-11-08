package example.com.itdvn_5.ex_02_adding_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import example.com.itdvn_5.R;

public class SecondFragment extends Fragment {
    static final String TAG = "SecondFragment";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.ex_02_second_fragment, null);//нет container потому что динамиски
    }
}
