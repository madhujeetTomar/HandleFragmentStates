package com.mj.handlefragmentstates

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mj.handlefragmentstates.fragments.FirstFragment
import com.mj.handlefragmentstates.fragments.SecondFragment
import com.mj.handlefragmentstates.fragments.ThirdFragment
import com.mj.handlefragmentstates.fragments.Utils

class MainActivity : AppCompatActivity(), Inavigator {

    var Tag:String ="MainActivity"

    override fun navigateToFragment(tag: String) {
        when (tag) {
            "FIRST" -> supportFragmentManager
                .beginTransaction()
                .replace(
                    R.id.fragment_container,
                    FirstFragment.newInstance()
                )
                .addToBackStack("first")
                .commit()

            "SECOND" -> supportFragmentManager
                .beginTransaction()
                .replace(
                    R.id.fragment_container,
                    SecondFragment.newInstance()
                )
                .commit()

            "THIRD" -> supportFragmentManager
                .beginTransaction()
                .replace(
                    R.id.fragment_container,
                    ThirdFragment.newInstance()
                ).commit()

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Utils.printStates(Tag, "onCreate")
        supportFragmentManager
            .beginTransaction()
            .replace(
                R.id.fragment_container,
                FirstFragment.newInstance()
            )
            .addToBackStack("first")
            .commit()
    }

    override fun onStart() {
        super.onStart()
        Utils.printStates(Tag, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Utils.printStates(Tag, "onResume")

    }

    override fun onPause() {
        super.onPause()
        Utils.printStates(Tag, "onPause")

    }

    override fun onStop() {
        super.onStop()
        Utils.printStates(Tag, "onStop")


    }

    override fun onDestroy() {
        super.onDestroy()
        Utils.printStates(Tag, "onDestroy")

    }

    override fun onRestart() {
        super.onRestart()
        Utils.printStates(Tag, "onRestart")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Utils.printStates(Tag, "onSaveInstanceState")
    }

}