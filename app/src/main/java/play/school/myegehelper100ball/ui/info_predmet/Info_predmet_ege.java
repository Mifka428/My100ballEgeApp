package play.school.myegehelper100ball.ui.info_predmet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import play.school.myegehelper100ball.NavigationActivity;
import play.school.myegehelper100ball.R;
import play.school.myegehelper100ball.ui.VariantSystem;

public class Info_predmet_ege extends Fragment {
    public static String Name_predmet = "";
    public static String Info_predmet = "";
    public static String Format_ex = "";
    public static String Data_predmet = "";
    public static String Lvl = "";
    private Button buttonRus, buttonMath, buttonHim, buttonBio, buttonObsestvo, buttonFis;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_info_predmet_ege, container, false);

        buttonRus = (Button) view.findViewById(R.id.buttonRus);
        buttonMath = (Button) view.findViewById(R.id.buttonMath);
        buttonObsestvo = (Button) view.findViewById(R.id.buttonObsestvo);
        buttonHim = (Button) view.findViewById(R.id.buttonHim);
        buttonBio = (Button) view.findViewById(R.id.buttonBio);
        buttonFis = (Button) view.findViewById(R.id.buttonFis);

        buttonRus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Name_predmet = "Русский язык";
                Info_predmet = "Русский язык - является основным предметом для сдачи на итоговой аттестации. Каждый участник ЕГЭ обязан сдавать данный предмет.";
                Format_ex = "Экзамен проводится очно. На экзамене разрешенно:\n 1. Гелевая черная ручкаю\n2. Бутылка водыю\n3. Плитка шоколадаю\n4. Лекарственные средства.";
                Data_predmet = "Дата: 8 июня";
                Lvl = "Уровень сложности: Легкий-средний";
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.info_predmet_slide);
            }
        });
        buttonMath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Name_predmet = "Математика";
                Info_predmet = "Математика - один из основных предметов в ЕГЭ.";
                Format_ex = "Формат экзамена: Экзамен проводится очно. На экзамене разрешенно:\n 1. Гелевая черная ручкаю\n2. Бутылка водыю\n3. Плитка шоколадаю\n4. Лекарственные средства.";
                Data_predmet = "Дата: 23 мая";
                Lvl = "Уровень сложности: Средний-высокий";
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.info_predmet_slide);


            }
        });
        buttonObsestvo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Name_predmet = "";
                Info_predmet = "";
                Format_ex = "Формат экзамена: Экзамен проводится очно. На экзамене разрешенно:\n 1. Гелевая черная ручкаю\n2. Бутылка водыю\n3. Плитка шоколадаю\n4. Лекарственные средства.";
                Data_predmet = "Дата: ";
                Lvl = "Уровень сложности: ";
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.info_predmet_slide);


            }
        });
        buttonHim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Name_predmet = "Химия";
                Info_predmet = "";
                Format_ex = "Формат экзамена: Экзамен проводится очно. На экзамене разрешенно:\n 1. Гелевая черная ручкаю\n2. Бутылка водыю\n3. Плитка шоколадаю\n4. Лекарственные средства.";
                Data_predmet = "Дата: ";
                Lvl = "Уровень сложности: ";
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.info_predmet_slide);


            }
        });
        buttonBio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Name_predmet = "";
                Info_predmet = "";
                Format_ex = "Формат экзамена: Экзамен проводится очно. На экзамене разрешенно:\n 1. Гелевая черная ручкаю\n2. Бутылка водыю\n3. Плитка шоколадаю\n4. Лекарственные средства.";
                Data_predmet = "Дата: ";
                Lvl = "Уровень сложности: ";
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.info_predmet_slide);


            }
        });
        buttonFis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Name_predmet = "";
                Info_predmet = "";
                Format_ex = "Формат экзамена: Экзамен проводится очно. На экзамене разрешенно:\n 1. Гелевая черная ручкаю\n2. Бутылка водыю\n3. Плитка шоколадаю\n4. Лекарственные средства.";
                Data_predmet = "Дата: ";
                Lvl = "Уровень сложности: ";
                NavigationActivity activity = (NavigationActivity) getActivity();
                activity.nextFragment(R.id.info_predmet_slide);


            }
        });
        return view;

    }
}
