package com.pankaj.tranding.framework.di

import com.pankaj.core.framework.di.ModuleDi
import org.koin.core.module.Module

object TreadingModuleDi : ModuleDi {
    override fun moduleList(): List<Module> {
        return listOf(useCaseModule, repoModule)
    }
}