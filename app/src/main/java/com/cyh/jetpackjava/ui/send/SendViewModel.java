package com.cyh.jetpackjava.ui.send;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SendViewModel extends ViewModel {
    private MutableLiveData<String> mTextView;

    public SendViewModel(){
        mTextView = new MutableLiveData<>();
        mTextView.setValue("This is a SendFragment");
    }

    public LiveData<String> getText(){
        return mTextView;
    }
}
