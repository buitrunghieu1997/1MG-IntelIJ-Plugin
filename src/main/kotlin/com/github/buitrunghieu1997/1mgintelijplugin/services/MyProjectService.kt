package com.github.buitrunghieu1997.1mgintelijplugin.services

import com.intellij.openapi.project.Project
import com.github.buitrunghieu1997.1mgintelijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
