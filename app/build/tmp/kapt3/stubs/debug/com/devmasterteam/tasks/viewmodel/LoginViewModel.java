package com.devmasterteam.tasks.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u000fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/devmasterteam/tasks/viewmodel/LoginViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_login", "Landroidx/lifecycle/MutableLiveData;", "Lcom/devmasterteam/tasks/service/model/ValidationModel;", "login", "Landroidx/lifecycle/LiveData;", "getLogin", "()Landroidx/lifecycle/LiveData;", "personRepository", "Lcom/devmasterteam/tasks/service/repository/PersonRepository;", "doLogin", "", "email", "", "password", "verifyLoggedUser", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.devmasterteam.tasks.service.repository.PersonRepository personRepository = null;
    private final androidx.lifecycle.MutableLiveData<com.devmasterteam.tasks.service.model.ValidationModel> _login = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.devmasterteam.tasks.service.model.ValidationModel> login = null;
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.devmasterteam.tasks.service.model.ValidationModel> getLogin() {
        return null;
    }
    
    /**
     * Faz login usando API
     */
    public final void doLogin(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
    }
    
    /**
     * Verifica se usuário está logado
     */
    public final void verifyLoggedUser() {
    }
}