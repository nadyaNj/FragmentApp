package am.home.training.FragmentApp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by nadya on 7/19/14.
 */
public class RedFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Bundle args = getArguments();
        View content = inflater.inflate(R.layout.fragment_red, container, false);
        ((TextView)content.findViewById(R.id.text)).setText(args.getString("param"));
        return container;
    }
}