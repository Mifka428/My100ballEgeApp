package play.school.myegehelper100ball.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import play.school.myegehelper100ball.NavigationActivity;
import play.school.myegehelper100ball.R;

public class HomeFragment extends Fragment {
    private Button buttonNavPractik, buttonNavTeoria;
    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        buttonNavPractik = (Button) view.findViewById(R.id.buttonNavPractik);
        buttonNavTeoria = (Button) view.findViewById(R.id.buttonNavTeoria);
        buttonNavPractik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.practik_ege);
            }
        });
        buttonNavTeoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.teoria_ege);
            }
        });
        return view;
    }
}