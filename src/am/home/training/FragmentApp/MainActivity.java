package am.home.training.FragmentApp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

public class MainActivity extends FragmentActivity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void changeToRed(View view) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        Fragment redFragment = new RedFragment();
        Bundle params = new Bundle();
        params.putString("param","value");
        redFragment.setArguments(params);


        transaction.add(R.id.container, new RedFragment());
        transaction.addToBackStack("red");

        transaction.commit();
    }
    public void changeToGreen(View view) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container, new GreenFragment());
        transaction.addToBackStack("green");


        transaction.commit();
    }

    public void changeToYellow(View view) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container, new YellowFragment());
        transaction.addToBackStack("yellow");


        transaction.commit();
    }

    public void goToRed(View view) {
        FragmentManager manager = getSupportFragmentManager();
        manager.popBackStack("red", R.id.container);
    }
}
