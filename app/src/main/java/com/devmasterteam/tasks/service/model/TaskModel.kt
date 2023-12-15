package com.devmasterteam.tasks.service.model

import com.google.gson.annotations.SerializedName

class TaskModel {
    @SerializedName("Id")
    var id: Int = 0

    @SerializedName("priorityId")
    var priorityId: Int = 0;

    @SerializedName("description")
    var description: String = ""

    @SerializedName("DueDate")
    var dueDate: String = ""

    @SerializedName("Complete")
    var complete: Boolean = false

    var priorityDescription: String = ""
}