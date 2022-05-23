package play.school.myegehelper100ball;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import play.school.myegehelper100ball.ui.ReadFile;
import play.school.myegehelper100ball.ui.VariantSystem;

public class NavigationActivity extends AppCompatActivity {
    int numVar = 0;
    private AppBarConfiguration mAppBarConfiguration;
    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(R.id.nav_home, R.id.teoria_ege, R.id.practik_ege, R.id.nav_infopredmet, R.id.nav_dostig, R.id.nav_information)
                .setDrawerLayout(drawer)
                .build();
        navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void nextFragment(int fragment_id) {
        navController.navigate(fragment_id);
    }

    public void read_file_sadaniye(String name_file) {
        String text = "";
        try {
            InputStream inputStream = getAssets().open(name_file);
            BufferedReader bfr = new BufferedReader(new InputStreamReader(inputStream));
            String nexline = "", allText = "";
            int count = 0;
            while ((nexline = bfr.readLine()) != null) {
                ReadFile.url_array[count] = nexline;
                count++;
            }

        } catch (Exception e) {

        }
    }
    public void read_file_otvet(String name_file) {
        String text = "";
        try {
            InputStream inputStream = getAssets().open(name_file);
            BufferedReader bfr = new BufferedReader(new InputStreamReader(inputStream));
            String nexline = "", allText = "";
            int count = 0;
            while ((((nexline = bfr.readLine())) != null)){
                ReadFile.var_otvet[count] = nexline;
                count++;
            }

        } catch (Exception e) {

        }
    }
}

