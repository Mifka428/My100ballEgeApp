package play.school.myegehelper100ball;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import play.school.myegehelper100ball.NavigationActivity;
import play.school.myegehelper100ball.R;
import play.school.myegehelper100ball.ui.VariantSystem;

public class Resultat extends Fragment{
    private TextView number_text, res_text, otvet_text, resultat_text;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_resultat, container, false);
        number_text = (TextView) view.findViewById(R.id.number_text);
        res_text = (TextView) view.findViewById(R.id.res_text);
        otvet_text = (TextView) view.findViewById(R.id.otvet_text);
        resultat_text = (TextView) view.findViewById(R.id.resultat_text);

        number_text.setText(VariantSystem.getOtvet_member());
        otvet_text.setText(VariantSystem.getOtvet_system());
        resultat_text.setText(VariantSystem.getResult());


        return view;
    }
}