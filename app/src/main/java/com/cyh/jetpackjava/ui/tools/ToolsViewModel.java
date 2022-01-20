package com.cyh.jetpackjava.ui.tools;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ToolsViewModel extends ViewModel {
    private MutableLiveData<String> mTextView;

    public ToolsViewModel(){
        mTextView = new MutableLiveData<>();
        mTextView.setValue("This is a ToolsFragment");
    }

    public LiveData<String> getText(){
        return mTextView;
    }
}
