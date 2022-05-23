package play.school.myegehelper100ball.ui.teoria;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import play.school.myegehelper100ball.NavigationActivity;
import play.school.myegehelper100ball.R;

public class Teoria_Ege extends Fragment {
    private Button buttonMath, buttonRus, buttonFis, buttonHim, buttonBio, buttonGeo, buttonHis, buttonInf, buttonLitra, buttonObsestvo;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_teoria__ege, container, false);
        buttonMath = (Button) view.findViewById(R.id.buttonMath);
        buttonRus = (Button) view.findViewById(R.id.buttonRus);
        buttonFis = (Button) view.findViewById(R.id.buttonFis);
        buttonHim = (Button) view.findViewById(R.id.buttonHim);
        buttonBio = (Button) view.findViewById(R.id.buttonBio);
        buttonObsestvo = (Button) view.findViewById(R.id.buttonObsestvo);
        buttonMath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.math_ege_teoria);
            }
        });
        buttonRus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.rus_ege_teoria);
            }
        });
        buttonBio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.bio_ege_tema);
            }
        });
        buttonHim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.him_ege_tema);
            }
        });
        buttonObsestvo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.obsestvo_ege_tema);
            }
        });
        buttonFis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.fis_ege_tema);
            }
        });
        return view;
    }
}