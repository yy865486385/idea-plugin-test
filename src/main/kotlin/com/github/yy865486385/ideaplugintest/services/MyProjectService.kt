package com.github.yy865486385.ideaplugintest.services

import com.intellij.openapi.project.Project
import com.github.yy865486385.ideaplugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
