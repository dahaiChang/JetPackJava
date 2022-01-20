package com.cyh.jetpackjava.ui.share;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ShareViewModel extends ViewModel {
    private MutableLiveData<String> mTextView;

    public ShareViewModel(){
        mTextView = new MutableLiveData<>();
        mTextView.setValue("This is a ShareFragment");
    }

    public LiveData<String> getText(){
        return mTextView;
    }
}
