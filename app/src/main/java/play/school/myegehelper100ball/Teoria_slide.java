package play.school.myegehelper100ball;

import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.squareup.picasso.Picasso;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import play.school.myegehelper100ball.NavigationActivity;
import play.school.myegehelper100ball.R;

public class Teoria_slide extends Fragment {
    public List<ImageView> imageViews;
    public static String teoria_photo = "";
    ImageView imageView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_teoria_slide, container, false);
        ImageView imageView = view.findViewById(R.id.imageView);
        Picasso.get().load(teoria_photo).into(imageView);

        return view;
    }
}