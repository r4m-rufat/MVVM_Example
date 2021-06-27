package com.codingwithrufat.mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.codingwithrufat.mvvm.adapters.RecyclerViewAdapter;
import com.codingwithrufat.mvvm.models.Model;
import com.codingwithrufat.mvvm.viewmodels.MainActivityViewModel;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView _recyclerView;
    private MainActivityViewModel mainActivityViewModel;
    private RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _recyclerView = findViewById(R.id.recycler_view);

        mainActivityViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
        mainActivityViewModel.init();
        mainActivityViewModel.getList().observe(this, new Observer<List<Model>>() {
            @Override
            public void onChanged(List<Model> models) {
                recyclerViewAdapter.notifyDataSetChanged();
            }
        });

        initializeRecyclerView();

    }

    private void initializeRecyclerView(){
        recyclerViewAdapter = new RecyclerViewAdapter(this, mainActivityViewModel.getList().getValue());
        _recyclerView.setHasFixedSize(false);
        _recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        _recyclerView.setAdapter(recyclerViewAdapter);
    }
}