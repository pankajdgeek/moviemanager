package com.pankaj.tranding.framework.ui

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.pankaj.tranding.R
import com.pankaj.tranding.framework.di.TreadingModuleDi
import com.pankaj.tranding.framework.viewmodel.TrendingViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.core.context.unloadKoinModules

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [TrendingFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TrendingFragment : Fragment() {

    private val viewModel: TrendingViewModel by viewModel()

    override fun onAttach(activity: Activity) {
        super.onAttach(activity)
        loadKoinModules(TreadingModuleDi.moduleList())
    }

    override fun onDetach() {
        super.onDetach()
        unloadKoinModules(TreadingModuleDi.moduleList())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trending, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        registerListener(view)
    }

    fun registerListener(view: View) {
        view.findViewById<Button>(R.id.btn_click_me).setOnClickListener {
            getTrendingList()
        }
    }

    fun getTrendingList() {
        viewModel.getMovieList()
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            TrendingFragment()
    }
}