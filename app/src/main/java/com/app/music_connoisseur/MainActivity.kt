package com.app.music_connoisseur

import android.annotation.SuppressLint
import android.content.Intent
import android.widget.LinearLayout
import android.os.Bundle
import android.text.Layout
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.transition.Scene
import android.transition.Transition
import android.transition.TransitionInflater
import android.transition.TransitionManager
import android.view.View
import android.view.ViewGroup
import com.app.music_connoisseur.R.*
import java.util.Timer
import kotlin.concurrent.schedule
import kotlin.concurrent.timer


class MainActivity : AppCompatActivity() {
    private lateinit var scene1: Scene
    var transition:Transition? = null



    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        transition = TransitionInflater.from(this).inflateTransition(R.transition.example_4)
        scene1 = Scene.getSceneForLayout(rootContainer, R.layout.activity_landing, this)
        //scene1 = findViewById(R.layout.activity_main)


        //Thread.sleep(3000)
        //setContentView(layout.activity_landing)
        /*connectButton.setOnClickListener {
            SpotifyService.connect(this) {
                if(it) {
                    showPlayer()
                }
            }
        }*/
    }

    override fun onDestroy() {
        super.onDestroy()
        //SpotifyService.disconnect()
    }

    /*private fun showPlayer() {
        val intent = Intent(this, PlayerActivity::class.java)
        startActivity(intent)
    } */

    fun showLanding(view: View) {
        TransitionManager.go(scene1, transition)
        //setContentView(layout.activity_landing)
    }


}