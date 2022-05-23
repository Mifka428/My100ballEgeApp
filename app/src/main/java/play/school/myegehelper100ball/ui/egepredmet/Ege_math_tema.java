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

public class Ege_math_tema extends Fragment {
    Button button1, button2, button3,button4, button5;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ege_math_tema, container, false);

        button1 = (Button) view.findViewById(R.id.button1);
        button2 = (Button) view.findViewById(R.id.button2);
        button3 = (Button) view.findViewById(R.id.button3);
        button4 = (Button) view.findViewById(R.id.button4);
        button5 = (Button) view.findViewById(R.id.button5);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Teoria_slide.teoria_photo = "https://cdn.discordapp.com/attachments/976507215638827069/977404440732655697/math_5.png";
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.teoria_slide);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Teoria_slide.teoria_photo = "https://cdn.discordapp.com/attachments/976507215638827069/977404440921382932/math_1.png";
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.teoria_slide);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Teoria_slide.teoria_photo = "https://cdn.discordapp.com/attachments/976507215638827069/977404441139499018/math_2.png";
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.teoria_slide);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Teoria_slide.teoria_photo = "https://cdn.discordapp.com/attachments/976507215638827069/977404441349222450/math_3.png";
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.teoria_slide);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Teoria_slide.teoria_photo = "https://cdn.discordapp.com/attachments/976507215638827069/977404441579892816/math_4.png";
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.teoria_slide);
            }
        });

        return view;
    }
}