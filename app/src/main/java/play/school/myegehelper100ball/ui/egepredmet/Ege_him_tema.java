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

public class Ege_him_tema extends Fragment {
    Button button1, button2, button3,button4, button5;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ege_him_tema, container, false);

        button1 = (Button) view.findViewById(R.id.button1);
        button2 = (Button) view.findViewById(R.id.button2);
        button3 = (Button) view.findViewById(R.id.button3);
        button4 = (Button) view.findViewById(R.id.button4);
        button5 = (Button) view.findViewById(R.id.button5);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Teoria_slide.teoria_photo = "https://cdn.discordapp.com/attachments/976526385743011970/977368553508462602/unknown.png";
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.teoria_slide);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Teoria_slide.teoria_photo = "https://cdn.discordapp.com/attachments/976526385743011970/977368620143358002/unknown.png";
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.teoria_slide);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Teoria_slide.teoria_photo = "https://cdn.discordapp.com/attachments/976526385743011970/977368667241201724/unknown.png";
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.teoria_slide);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Teoria_slide.teoria_photo = "https://cdn.discordapp.com/attachments/976526385743011970/977368713462423612/unknown.png";
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.teoria_slide);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Teoria_slide.teoria_photo = "https://cdn.discordapp.com/attachments/976526385743011970/977368762846175262/unknown.png";
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.teoria_slide);
            }
        });

        return view;
    }
}