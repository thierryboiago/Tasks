package com.devmasterteam.tasks.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.devmasterteam.tasks.service.listener.APIListener
import com.devmasterteam.tasks.service.model.PriorityModel
import com.devmasterteam.tasks.service.model.TaskModel
import com.devmasterteam.tasks.service.model.ValidationModel
import com.devmasterteam.tasks.service.repository.PriorityRepository
import com.devmasterteam.tasks.service.repository.TaskRepository

class TaskFormViewModel(application: Application) : AndroidViewModel(application) {

    private val priorityRepository = PriorityRepository(application.applicationContext)
    private val taskRepository = TaskRepository(application.applicationContext)

    private val _priorityList = MutableLiveData<List<PriorityModel>>()
    val priorityList: MutableLiveData<List<PriorityModel>> = _priorityList

    private val _taskSave = MutableLiveData<ValidationModel>()
    val taskSave: LiveData<ValidationModel> = _taskSave

    private val _loadTask = MutableLiveData<TaskModel>()
    val loadTask: LiveData<TaskModel> = _loadTask

    private val _errorLoad = MutableLiveData<ValidationModel>()
    val errorLoad: LiveData<ValidationModel> = _errorLoad

    fun loadPriorities() {
        _priorityList.value = priorityRepository.list()
    }

    fun save(taskModel: TaskModel) {
        val listener = object : APIListener<Boolean> {
            override fun onSuccess(result: Boolean) {
                _taskSave.value = ValidationModel()
            }

            override fun onFailure(message: String) {
                _taskSave.value = ValidationModel(message)
            }

        }
        if (taskModel.id == 0)
            taskRepository.create(taskModel, listener)
        else
            taskRepository.update(taskModel, listener)
    }

    fun load(id: Int) {
        taskRepository.load(id, object : APIListener<TaskModel> {
            override fun onSuccess(result: TaskModel) {
                _loadTask.value = result
            }

            override fun onFailure(message: String) {
                _errorLoad.value = ValidationModel(message)
            }

        })
    }

}