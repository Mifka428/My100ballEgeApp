package play.school.myegehelper100ball.ui.practik;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import play.school.myegehelper100ball.NavigationActivity;
import play.school.myegehelper100ball.R;
import play.school.myegehelper100ball.ui.ReadFile;
import play.school.myegehelper100ball.ui.VariantSystem;

public class Practik_ege extends Fragment {
    private Button buttonMath, buttonRus, buttonHim, buttonObsestvo, buttonFis, buttonBio;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_practik__ege, container, false);
        buttonMath = (Button) view.findViewById(R.id.buttonMath);
        buttonRus = (Button) view.findViewById(R.id.buttonRus);
        buttonHim = (Button) view.findViewById(R.id.buttonHim);
        buttonObsestvo = (Button) view.findViewById(R.id.buttonObsestvo);
        buttonFis = (Button) view.findViewById(R.id.buttonFis);
        buttonBio = (Button) view.findViewById(R.id.buttonBio);
        buttonMath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavigationActivity activity = (NavigationActivity) getActivity();
                VariantSystem.file_name_otveti = "Math_o_";
                VariantSystem.file_name_sadaniye = "Math_v_";
                activity.nextFragment(R.id.ege_varianti_choosing);
            }
        });
        buttonRus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavigationActivity activity = (NavigationActivity) getActivity();
                VariantSystem.file_name_otveti = "Rus_o_";
                VariantSystem.file_name_sadaniye = "Rus_v_";
                activity.nextFragment(R.id.ege_varianti_choosing);
            }
        });
        buttonHim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavigationActivity activity = (NavigationActivity) getActivity();
                VariantSystem.file_name_otveti = "Him_o_";
                VariantSystem.file_name_sadaniye = "Him_v_";
                activity.nextFragment(R.id.ege_varianti_choosing);
            }
        });
        buttonObsestvo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavigationActivity activity = (NavigationActivity) getActivity();
                VariantSystem.file_name_otveti = "Obsestvo_o_";
                VariantSystem.file_name_sadaniye = "Obsestvo_v_";
                activity.nextFragment(R.id.ege_varianti_choosing);
            }
        });
        buttonFis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavigationActivity activity = (NavigationActivity) getActivity();
                VariantSystem.file_name_otveti = "Fis_o_";
                VariantSystem.file_name_sadaniye = "Fis_v_";
                activity.nextFragment(R.id.ege_varianti_choosing);
            }
        });
        buttonBio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavigationActivity activity = (NavigationActivity) getActivity();
                VariantSystem.file_name_otveti = "Bio_o_";
                VariantSystem.file_name_sadaniye = "Bio_v_";
                activity.nextFragment(R.id.ege_varianti_choosing);
            }
        });
        return view;
    }
}