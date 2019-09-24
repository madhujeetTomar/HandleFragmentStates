package com.mj.handlefragmentstates.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.mj.handlefragmentstates.Inavigator
import com.mj.handlefragmentstates.R

class FirstFragment : Fragment() {

    var TAG: String = "FirstFragment"
    var navigateToSecondFragment: Button? = null
    var navigateToThirdFragment: Button? = null
    lateinit var navigator:Inavigator

    companion object {
        fun newInstance() = FirstFragment()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        navigator = activity as Inavigator
        Utils.printStates(TAG, "onAttach")
    }

    override fun onStart() {
        super.onStart()

        Utils.printStates(TAG, "onStart")

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Utils.printStates(TAG, "onCreate")

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        Utils.printStates(TAG, "onCreateView")
        return inflater.inflate(R.layout.first_fragment, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        Utils.printStates(TAG, "onActivityCreated")

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navigateToSecondFragment=view.findViewById(R.id.navigate_second) as Button
        navigateToThirdFragment=view.findViewById(R.id.navigate_third) as Button

        navigateToSecondFragment!!.setOnClickListener(View.OnClickListener {
            navigator.navigateToFragment("SECOND")
        })

        Utils.printStates(TAG, "onViewCreated")

    }

    override fun onResume() {
        super.onResume()

        Utils.printStates(TAG, "onResume")

    }


    override fun onPause() {
        super.onPause()

        Utils.printStates(TAG, "onPause")


    }

    override fun onStop() {
        super.onStop()

        Utils.printStates(TAG, "onStop")


    }

    override fun onDestroy() {
        super.onDestroy()

        Utils.printStates(TAG, "onDestroy")

    }

    override fun onDestroyView() {
        super.onDestroyView()


        Utils.printStates(TAG, "onDestroyView")


    }

}