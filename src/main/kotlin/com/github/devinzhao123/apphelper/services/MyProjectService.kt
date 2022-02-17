package com.github.devinzhao123.apphelper.services

import com.intellij.openapi.project.Project
import com.github.devinzhao123.apphelper.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
