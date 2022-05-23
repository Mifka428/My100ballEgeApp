package play.school.myegehelper100ball.ui.egepredmet;

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
import play.school.myegehelper100ball.Teoria_slide;

public class Ege_fisics_tema extends Fragment {
    Button button1, button2, button3,button4, button5,button6,button7,button8,button9,button10;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ege_fisics_tema, container, false);

        button1 = (Button) view.findViewById(R.id.button1);
        button2 = (Button) view.findViewById(R.id.button2);
        button3 = (Button) view.findViewById(R.id.button3);
        button4 = (Button) view.findViewById(R.id.button4);
        button5 = (Button) view.findViewById(R.id.button5);
        button6 = (Button) view.findViewById(R.id.button6);
        button7 = (Button) view.findViewById(R.id.button7);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Teoria_slide.teoria_photo = "https://cdn.discordapp.com/attachments/976526357838315560/977402445053431828/fis_1.png";
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.teoria_slide);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Teoria_slide.teoria_photo = "https://cdn.discordapp.com/attachments/976526357838315560/977402445414170705/fis_2.png";
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.teoria_slide);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Teoria_slide.teoria_photo = "https://cdn.discordapp.com/attachments/976526357838315560/977402445724545044/fis_3.png";
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.teoria_slide);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Teoria_slide.teoria_photo = "https://cdn.discordapp.com/attachments/976526357838315560/977402446009753650/fis_4.png";
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.teoria_slide);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Teoria_slide.teoria_photo = "https://cdn.discordapp.com/attachments/976526357838315560/977402446240428032/fis_5.png";
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.teoria_slide);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Teoria_slide.teoria_photo = "https://cdn.discordapp.com/attachments/976526357838315560/977402446462722118/fis_6.png";
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.teoria_slide);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Teoria_slide.teoria_photo = "https://cdn.discordapp.com/attachments/976526357838315560/977402446739537930/fis_7.png";
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.teoria_slide);
            }
        });

        return view;
    }
}