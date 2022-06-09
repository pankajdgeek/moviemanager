package com.pankaj.core.framework.di

import org.koin.core.module.Module

interface ModuleDi {
    fun moduleList(): List<Module>
}