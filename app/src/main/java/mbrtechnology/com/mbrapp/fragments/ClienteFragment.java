package mbrtechnology.com.mbrapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mbrtechnology.com.mbrapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ClienteFragment extends Fragment {


    public ClienteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_cliente, container, false);


        // ProgressBar Gone
        getActivity().findViewById(R.id.main_progress).setVisibility(View.GONE);


        return view;
    }

}
