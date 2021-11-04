package com.app.music_connoisseur


import android.content.Intent
import android.os.Bundle
import android.transition.Scene
import android.transition.Transition
import android.transition.TransitionInflater
import android.transition.TransitionManager
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_landing.*
import kotlinx.android.synthetic.main.activity_main.*


class LandingActivity : AppCompatActivity() {
    private lateinit var scene1: Scene
    var transition: Transition? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)
        transition = TransitionInflater.from(this).inflateTransition(R.transition.example_4)
        scene1 = Scene.getSceneForLayout(landingContainer, R.layout.activity_player, this)

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

    fun showPlayer(view: View) {
        /*val intent = Intent(this, PlayerActivity::class.java)
        startActivity(intent)*/
        TransitionManager.go(scene1, transition)

    }
}