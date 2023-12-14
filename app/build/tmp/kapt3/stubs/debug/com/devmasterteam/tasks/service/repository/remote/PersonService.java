package com.devmasterteam.tasks.service.repository.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H\'J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H\'\u00a8\u0006\n"}, d2 = {"Lcom/devmasterteam/tasks/service/repository/remote/PersonService;", "", "create", "Lretrofit2/Call;", "Lcom/devmasterteam/tasks/service/model/PersonModel;", "name", "", "email", "password", "login", "app_debug"})
public abstract interface PersonService {
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST(value = "Authentication/Login")
    public abstract retrofit2.Call<com.devmasterteam.tasks.service.model.PersonModel> login(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Field(value = "email")
    java.lang.String email, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Field(value = "password")
    java.lang.String password);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST(value = "/Authentication/Create")
    public abstract retrofit2.Call<com.devmasterteam.tasks.service.model.PersonModel> create(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Field(value = "name")
    java.lang.String name, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Field(value = "email")
    java.lang.String email, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Field(value = "password")
    java.lang.String password);
}