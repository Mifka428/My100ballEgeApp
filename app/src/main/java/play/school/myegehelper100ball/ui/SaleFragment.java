package play.school.myegehelper100ball.ui;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class SaleFragment {
    public static String Url = "";
    public static void dowload_file(String url, String file_name){
        FileOutputStream fout = null;
        BufferedInputStream in = null;

        try {
            in = new BufferedInputStream(new URL(url).openStream());
            fout = new FileOutputStream(file_name);
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
    }



    }
