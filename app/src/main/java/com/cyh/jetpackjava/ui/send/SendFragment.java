package com.cyh.jetpackjava.ui.send;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import com.cyh.jetpackjava.R;

public class SendFragment extends Fragment {
    private SendViewModel sendViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        sendViewModel = ViewModelProviders.of(this).get(SendViewModel.class);

        View root = inflater.inflate(R.layout.fragment_send,container,false);
        final TextView textView = root.findViewById(R.id.text_send);


        sendViewModel.getText().observe(getActivity(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
