package com.demo.paging.ui;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.demo.paging.MyApplication;
import com.demo.paging.R;

import com.demo.paging.databinding.PagingDemoLayoutBinding;
import com.demo.paging.utils.Constant;
import com.demo.paging.utils.ViewModelFactory;





import java.util.Objects;

import javax.inject.Inject;


public class PagingDemoAct extends AppCompatActivity {

    @Inject
    ViewModelFactory viewModelFactory;

    PagingLibViewModel viewModel;

    PagingDemoLayoutBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.paging_demo_layout);
        ((MyApplication) getApplication()).getAppComponent().doInjection(this);
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(PagingLibViewModel.class);
        init();
    }

    private void init() {

        binding.list.setLayoutManager(new LinearLayoutManager(this));
        MyPageListAdapter adapter = new MyPageListAdapter();
        binding.list.setAdapter(adapter);

        if (!Constant.checkInternetConnection(this)) {
            Snackbar.make(findViewById(android.R.id.content), Constant.CHECK_NETWORK_ERROR, Snackbar.LENGTH_SHORT)
                    .show();
        }

        viewModel.getListLiveData().observe(this, adapter :: submitList);

        viewModel.getProgressLoadStatus().observe(this, status -> {
            if (Objects.requireNonNull(status).equalsIgnoreCase(Constant.LOADING)) {
                binding.progress.setVisibility(View.VISIBLE);
            } else if (status.equalsIgnoreCase(Constant.LOADED)) {
                binding.progress.setVisibility(View.GONE);
            }
        });

    }
}
