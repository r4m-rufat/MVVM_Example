package com.codingwithrufat.mvvm.repository;

import androidx.lifecycle.MutableLiveData;

import com.codingwithrufat.mvvm.models.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Singleton pattern
 */
public class Repository {

    private static Repository INSTANCE;
    private ArrayList<Model> data = new ArrayList<>();

    public static Repository getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Repository();
        }
        return INSTANCE;
    }

    public MutableLiveData<List<Model>> getPlacesData(){
        setData();
        MutableLiveData<List<Model>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(data);
        return mutableLiveData;
    }

    public void setData(){

        data.add(new Model("Washington", "https://www.travelbound.co.uk/wp-content/uploads/2018/03/Urban-view-over-Washington-D.C.-washington-dc-1624419-1.jpg"));
        data.add(new Model("Norway", "https://www.dailyscandinavian.com/wp-content/uploads/2017/02/030217-norway-scaled.jpg"));
        data.add(new Model("Island", "https://turlar.az/uploads/news/ef26cb2060a1485d3932e9e1ccacb8b4.jpg"));
        data.add(new Model("Danimark", "https://www.avrupa.info.tr/sites/default/files/styles/standard_page_header/public/2016-08/Denmark%20Copenhagen.jpg?itok=T44Zd-j8"));
        data.add(new Model("Sweeden", "https://images.unsplash.com/photo-1526644253653-a411eaafdfe6?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=755&q=80"));
        data.add(new Model("China", "https://images.unsplash.com/photo-1474181487882-5abf3f0ba6c2?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80"));
        data.add(new Model("Washington", "https://www.travelbound.co.uk/wp-content/uploads/2018/03/Urban-view-over-Washington-D.C.-washington-dc-1624419-1.jpg"));
        data.add(new Model("Washington", "https://www.travelbound.co.uk/wp-content/uploads/2018/03/Urban-view-over-Washington-D.C.-washington-dc-1624419-1.jpg"));
        data.add(new Model("Washington", "https://www.travelbound.co.uk/wp-content/uploads/2018/03/Urban-view-over-Washington-D.C.-washington-dc-1624419-1.jpg"));
        data.add(new Model("Washington", "https://www.travelbound.co.uk/wp-content/uploads/2018/03/Urban-view-over-Washington-D.C.-washington-dc-1624419-1.jpg"));
        data.add(new Model("Washington", "https://www.travelbound.co.uk/wp-content/uploads/2018/03/Urban-view-over-Washington-D.C.-washington-dc-1624419-1.jpg"));
        data.add(new Model("Washington", "https://www.travelbound.co.uk/wp-content/uploads/2018/03/Urban-view-over-Washington-D.C.-washington-dc-1624419-1.jpg"));
    }

}
