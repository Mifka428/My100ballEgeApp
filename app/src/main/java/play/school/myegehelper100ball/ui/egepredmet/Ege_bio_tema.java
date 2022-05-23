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

public class Ege_bio_tema extends Fragment {
    Button button1, button2, button3,button4, button5;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ege_bio_tema, container, false);

        button1 = (Button) view.findViewById(R.id.button1);
        button2 = (Button) view.findViewById(R.id.button2);
        button3 = (Button) view.findViewById(R.id.button3);
        button4 = (Button) view.findViewById(R.id.button4);
        button5 = (Button) view.findViewById(R.id.button5);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Teoria_slide.teoria_photo = "https://cdn.discordapp.com/attachments/976526422535471186/977396574453919774/bio_1.png";
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.teoria_slide);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Teoria_slide.teoria_photo = "https://cdn.discordapp.com/attachments/976526422535471186/977396574705549373/bio_2.png";
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.teoria_slide);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Teoria_slide.teoria_photo = "https://cdn.discordapp.com/attachments/976526422535471186/977396575032725534/bio_3.png";
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.teoria_slide);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Teoria_slide.teoria_photo = "https://cdn.discordapp.com/attachments/976526422535471186/977396575343087667/bio_4.png";
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.teoria_slide);
            }
        });

        return view;
    }
}