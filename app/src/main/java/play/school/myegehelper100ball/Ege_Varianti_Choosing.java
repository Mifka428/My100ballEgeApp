package play.school.myegehelper100ball;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import play.school.myegehelper100ball.ui.VariantSystem;

public class Ege_Varianti_Choosing extends Fragment{
    private Button buttonVar_1, buttonVar_2;
    private TextView text1;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ege__varianti__choosing, container, false);
        buttonVar_1 = (Button) view.findViewById(R.id.buttonVar_1);
        buttonVar_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VariantSystem.file_name_sadaniye+="1";
                VariantSystem.file_name_otveti+="1";
                // Сделать функцию чтения файла от одного числа до другого
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.read_file_sadaniye(VariantSystem.file_name_sadaniye);
                activity.read_file_otvet(VariantSystem.file_name_otveti);
                activity.nextFragment(R.id.variant);
            }
        });
        buttonVar_2 = (Button) view.findViewById(R.id.buttonVar_2);
        buttonVar_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VariantSystem.file_name_sadaniye+="2";
                VariantSystem.file_name_otveti+="2";
                // Сделать функцию чтения файла от одного числа до другого
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.read_file_sadaniye(VariantSystem.file_name_sadaniye);
                activity.read_file_otvet(VariantSystem.file_name_otveti);
                activity.nextFragment(R.id.variant);
            }
        });

        return view;
    }
}