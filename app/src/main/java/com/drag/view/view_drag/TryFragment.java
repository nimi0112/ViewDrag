package com.drag.view.view_drag;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class TryFragment extends Fragment {

    //NestedScrollView my_scroll;

    public TryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=         inflater.inflate(R.layout.fragment_try, container, false);

    return view;
    }

}
