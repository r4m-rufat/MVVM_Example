package com.codingwithrufat.mvvm.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.codingwithrufat.mvvm.models.Model;
import com.codingwithrufat.mvvm.repository.Repository;

import java.util.List;

public class MainActivityViewModel extends ViewModel {

    private MutableLiveData<List<Model>> listModel;

    public void init(){
        if (listModel != null){
            return;
        }
        listModel = Repository.getInstance().getPlacesData();
    }

    public LiveData<List<Model>> getList(){
        return listModel;
    }

}
