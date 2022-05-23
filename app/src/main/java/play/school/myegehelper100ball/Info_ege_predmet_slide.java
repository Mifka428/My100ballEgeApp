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
import play.school.myegehelper100ball.ui.info_predmet.Info_predmet_ege;

public class Info_ege_predmet_slide extends Fragment{
    private TextView name_predmet, format_ex, data_predmet, info_predmet, lvl;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_info_ege_predmet_slide, container, false);

        name_predmet = (TextView) view.findViewById(R.id.name_predmet);
        format_ex = (TextView) view.findViewById(R.id.format_ex);
        data_predmet = (TextView) view.findViewById(R.id.data_predmet);
        info_predmet = (TextView) view.findViewById(R.id.info_predmet);
        lvl = (TextView) view.findViewById(R.id.lvl);

        name_predmet.setText(Info_predmet_ege.Name_predmet);
        format_ex.setText(Info_predmet_ege.Format_ex);
        data_predmet.setText(Info_predmet_ege.Data_predmet);
        info_predmet.setText(Info_predmet_ege.Info_predmet);
        lvl.setText(Info_predmet_ege.Lvl);
        return view;
    }
}