package com.pankaj.tranding.framework.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pankaj.tranding.interactor.usecase.TrendingListUseCaseInterface
import kotlinx.coroutines.launch
import retrofit2.HttpException
import java.lang.Exception

class TrendingViewModel(val trendingMovieUseCase: TrendingListUseCaseInterface) : ViewModel() {

    fun getMovieList(){
        viewModelScope.launch {
            try {
                val trendingList = trendingMovieUseCase.invoke(TrendingListUseCaseInterface.TrendingInput(""))
            }catch (e:HttpException){
                e.printStackTrace()
            }catch (e:Exception){

            }
        }

    }

}