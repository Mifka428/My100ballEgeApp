package play.school.myegehelper100ball.ui;

import android.app.Activity;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

import play.school.myegehelper100ball.ui.VariantSystem;

public class ReadFile {
    public static String[] url_array = new String[11];
    public static String[] var_otvet = new String[11];

    public static void read(){
        String file = VariantSystem.name_doc;
        //Log.d("MyN", "name_doc" + VariantSystem.name_doc[0]);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            int count = 0;
            String line_sadaniye;

            while ((line_sadaniye = reader.readLine()) != null) {

                url_array[count] = line_sadaniye;
                Log.d("My_name",url_array[count]);
                count++;
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());

        }


    }





    }

