package play.school.myegehelper100ball;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import play.school.myegehelper100ball.ui.ReadFile;
import play.school.myegehelper100ball.ui.VariantSystem;

public class Varianti extends Fragment {

    private EditText editText;
    private Button buttonOtvet;
    private TextView textView;
    private ImageView imageView;

    private TextView num_text;
    private String num = "Номер ";
    private String resh = "";

    private Context context;
    public List<ImageView> imageViews;

    public int number = 0;
    public static int slide = 0;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_varianti, container, false);

        context = getContext();
        imageViews = new ArrayList<>();
        ImageView imageView1 = view.findViewById(R.id.imageView);
        imageViews.add(imageView1);


        buttonOtvet = (Button) view.findViewById(R.id.buttonOtvet);
        textView = (TextView) view.findViewById(R.id.textView);
        num_text = (TextView) view.findViewById(R.id.num_text);
        editText = (EditText) view.findViewById(R.id.editText);

        getImageList(ReadFile.url_array[slide]);

        buttonOtvet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(slide != 10) {
                    VariantSystem.otveti_member[slide] = editText.getText().toString();
                    slide++;
                    num_text.setText("Номер " + Integer.toString(slide));
                    getImageList(ReadFile.url_array[slide]);
                    editText.setText("");
                    }

                else {
                    VariantSystem.otveti_member[slide] = editText.getText().toString();
                    Log.d("My", Integer.toString(slide));
                    VariantSystem.setResult();
                    NavigationActivity activity = (NavigationActivity) getActivity();
                    activity.nextFragment(R.id.resultat);
                }



                }
        });
        return view;
    }

    private void getImageList(String url1) {
        //ссылки на нужные картинки
        MyAsyncTask myAsyncTask = new MyAsyncTask();
        myAsyncTask.execute(url1);
    }

    private class MyAsyncTask extends AsyncTask<String, Integer, Void>{

        //список файлов, в данном случае формата jpg
        List<File> images;

        @Override
        protected Void doInBackground(String... strings) {
            //создаем пустой список
            images = new ArrayList<>();
            //переменная для изменения имя файла
            String fileName = "test";
            String extension = ".jpg";
            for (int i = 0; i < strings.length; i++) {
                //загружаем файл по ссылке и сохраняем в корневую папку приложения
                File file = downloadFile(strings[i], fileName + number + extension);
                //здесь ты можешь посмотреть полный путь к получившемуся файлу
                //добавляем файл в список
                images.add(file);
                //отображаем картинку на экране
                publishProgress(i);
                number++;
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            File file = images.get(values[0]);
            Uri uri = Uri.parse(file.getAbsolutePath());
            ImageView imageView = imageViews.get(values[0]);
            imageView.setImageURI(uri);
        }

        @Override
        protected void onPostExecute(Void unused) {
            super.onPostExecute(unused);
            //здесь пропиши действия, которые ты хочешь выполнять после загрузки всех картинок
        }

        public File downloadFile(String url, String fileName){

            File file = new File(context.getApplicationInfo().dataDir + "/" + fileName);
            try {
                if (file.exists()){
                    file.delete();
                    Log.d("My", "downloadFile: delete");
                }
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

            FileOutputStream fout = null;
            BufferedInputStream in = null;

            try {
                in = new BufferedInputStream(new URL(url).openStream());
                fout = new FileOutputStream(file);
                byte data[] = new byte[1024];
                int count;
                while ((count = in.read(data, 0, 1024)) != - 1){
                    fout.write(data,0,count);
                    fout.flush();
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e){
                e.printStackTrace();
            } finally {
                try {
                    in.close();
                } catch (IOException e){
                    e.printStackTrace();
                } finally {
                    try {
                        fout.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return file;
        }
    }

}