package com.devmasterteam.tasks.service.listener;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/devmasterteam/tasks/service/listener/TaskListener;", "", "onCompleteClick", "", "id", "", "onDeleteClick", "onListClick", "onUndoClick", "app_debug"})
public abstract interface TaskListener {
    
    /**
     * Click para edição
     */
    public abstract void onListClick(int id);
    
    /**
     * Remoção
     */
    public abstract void onDeleteClick(int id);
    
    /**
     * Completa tarefa
     */
    public abstract void onCompleteClick(int id);
    
    /**
     * Descompleta tarefa
     */
    public abstract void onUndoClick(int id);
}