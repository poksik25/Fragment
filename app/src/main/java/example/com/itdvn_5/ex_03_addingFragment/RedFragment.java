package example.com.itdvn_5.ex_03_addingFragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import example.com.itdvn_5.R;

public class RedFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Context context = getActivity().getApplicationContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackgroundColor(getResources().getColor(R.color.teal_200));
        TextView textView = new TextView(context);
        textView.setText("Єто область фрагмента");
        linearLayout.addView(textView);

        return linearLayout;
    }
}
