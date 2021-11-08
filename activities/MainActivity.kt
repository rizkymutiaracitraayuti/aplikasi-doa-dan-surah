package com.example.projectkuliah.activities

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.projectkuliah.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
                    View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or
                    View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        }
        if (Build.VERSION.SDK_INT >= 21){
            setWindowFlag(this,WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, false)
            window.statusBarColor = Color.TRANSPARENT
        }

        linearDoaSehari.setOnClickListener(this)
        linearSurahPendek.setOnClickListener(this)
        linearAudio.setOnClickListener(this)
        linearTentang.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when(view.id){
            R.id.linearDoaSehari -> run {
                val intentDoa = Intent(this@MainActivity, DoaSehariActivity::class.java)
                startActivity(intentDoa)
            }
            R.id.linearSurahPendek -> run {
                val intentSurah = Intent(this@MainActivity, SurahPendekActivity::class.java)
                startActivity(intentSurah)
            }
            R.id.linearAudio -> run {
                val intentAudio = Intent(this@MainActivity, AudioActivity::class.java)
                startActivity(intentAudio)
            }
            R.id.linearTentang -> run {
                val intentTentang = Intent(this@MainActivity, TentangAplikasi::class.java)
                startActivity(intentTentang)
            }
        }

    }

    companion object{
        fun setWindowFlag(activity: Activity, bits: Int, on:Boolean){
            val activityWindow = activity.window
            val layoutParams = activityWindow.attributes
            if (on){
                layoutParams.flags = layoutParams.flags or bits
            }else{
                layoutParams.flags = layoutParams.flags and bits.inv()
            }
            activityWindow.attributes = layoutParams
        }
    }
}