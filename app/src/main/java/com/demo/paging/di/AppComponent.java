package com.demo.paging.di;

import com.demo.paging.ui.PagingDemoAct;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {UtilsModule.class})
@Singleton
public interface AppComponent {

    void doInjection(PagingDemoAct pagingDemoAct);

}
