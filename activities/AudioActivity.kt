package com.example.projectkuliah.activities

import android.app.Activity
import android.graphics.Color
import android.media.MediaPlayer
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.BaseAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.projectkuliah.R
import kotlinx.android.synthetic.main.activity_audio.*
import kotlinx.android.synthetic.main.song_ticket.view.*

class AudioActivity : AppCompatActivity() {

    var listAudio = ArrayList<AudioInfo>()
    var adapeter:AudioAdapter?=null
    var mp:MediaPlayer?=null
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audio)
        LoadURLOnline()
        adapeter = AudioAdapter(listAudio)
        listaudio.adapter=adapeter

        var mytracking = mySongTrack()
        mytracking.start()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        }

        if (Build.VERSION.SDK_INT >= 21) {
            setWindowFlag(this, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, false)
            window.statusBarColor = Color.TRANSPARENT
        }

    }

    fun LoadURLOnline(){
        listAudio.add(AudioInfo("01. Al Fatihah", "https://server6.mp3quran.net/thubti/001.mp3"))
        listAudio.add(AudioInfo("02. An Naas", "https://server6.mp3quran.net/thubti/114.mp3"))
        listAudio.add(AudioInfo("03. Al Falaq", "https://server6.mp3quran.net/thubti/113.mp3"))
        listAudio.add(AudioInfo("04. Al Ikhlas", "https://server6.mp3quran.net/thubti/112.mp3"))
        listAudio.add(AudioInfo("05. Al Lahab", "https://server6.mp3quran.net/thubti/111.mp3"))
        listAudio.add(AudioInfo("06. An Nashr", "https://server6.mp3quran.net/thubti/110.mp3"))
        listAudio.add(AudioInfo("07. Al Kafirun", "https://server6.mp3quran.net/thubti/109.mp3"))
        listAudio.add(AudioInfo("08. Al Kautsar", "https://server6.mp3quran.net/thubti/108.mp3"))
        listAudio.add(AudioInfo("09. Al Ma'un", "https://server6.mp3quran.net/thubti/107.mp3"))
        listAudio.add(AudioInfo("10. Al Quraisy", "https://server6.mp3quran.net/thubti/106.mp3"))
        listAudio.add(AudioInfo("11. Al Fiil", "https://server6.mp3quran.net/thubti/105.mp3"))
        listAudio.add(AudioInfo("12. Al Humazah", "https://server6.mp3quran.net/thubti/104.mp3"))
        listAudio.add(AudioInfo("13. Al Ashr", "https://server6.mp3quran.net/thubti/103.mp3"))
        listAudio.add(AudioInfo("14. At Takaatsur", "https://server6.mp3quran.net/thubti/102.mp3"))
        listAudio.add(AudioInfo("15. Al Qaari'ah", "https://server6.mp3quran.net/thubti/101.mp3"))
        listAudio.add(AudioInfo("16. Al Aadiyaat", "https://server6.mp3quran.net/thubti/100.mp3"))
        listAudio.add(AudioInfo("17. Al Zalzalah", "https://server6.mp3quran.net/thubti/099.mp3"))
        listAudio.add(AudioInfo("18. Al Bayyinah", "https://server6.mp3quran.net/thubti/098.mp3"))
        listAudio.add(AudioInfo("19. Al Qadr", "https://server6.mp3quran.net/thubti/097.mp3"))
        listAudio.add(AudioInfo("20. Al Alaq", "https://server6.mp3quran.net/thubti/096.mp3"))
        listAudio.add(AudioInfo("21. At Tin", "https://server6.mp3quran.net/thubti/095.mp3"))
        listAudio.add(AudioInfo("22. Al Insyirah", "https://server6.mp3quran.net/thubti/094.mp3"))
        listAudio.add(AudioInfo("23. Adh Dhuha", "https://server6.mp3quran.net/thubti/093.mp3"))
        listAudio.add(AudioInfo("24. Al Lail", "https://server6.mp3quran.net/thubti/092.mp3"))
        listAudio.add(AudioInfo("25. Asy Syams", "https://server6.mp3quran.net/thubti/091.mp3"))
        listAudio.add(AudioInfo("26. Al Balad", "https://server6.mp3quran.net/thubti/090.mp3"))
        listAudio.add(AudioInfo("27. Al A'laa", "https://server6.mp3quran.net/thubti/087.mp3"))
        listAudio.add(AudioInfo("28. Ath Thaariq", "https://server6.mp3quran.net/thubti/086.mp3"))
        listAudio.add(AudioInfo("29. Al Buruuj", "https://server6.mp3quran.net/thubti/085.mp3"))
        listAudio.add(AudioInfo("30. Al Infithaar", "https://server6.mp3quran.net/thubti/082.mp3"))
        listAudio.add(AudioInfo("31. Setelah Makan", "https://ia800200.us.archive.org/7/items/MurottalDoaSehariHari/DoaHisnulMuslim-52DoaSetelahMakan.mp3"))
        listAudio.add(AudioInfo("32. Bangun Tidur", "https://ia800200.us.archive.org/7/items/MurottalDoaSehariHari/DoaHisnulMuslim-02DoaBangunTidur.mp3"))
        listAudio.add(AudioInfo("33. Masuk Toilet", "https://ia800200.us.archive.org/7/items/MurottalDoaSehariHari/DoaHisnulMuslim-03DoaMasukKamarMandi.mp3"))
        listAudio.add(AudioInfo("34. Keluar Toilet", "https://ia600200.us.archive.org/7/items/MurottalDoaSehariHari/DoaHisnulMuslim-04DoaKeluarKamarMandi.mp3"))
        listAudio.add(AudioInfo("35. Keluar Rumah", "https://ia800200.us.archive.org/7/items/MurottalDoaSehariHari/DoaHisnulMuslim-06DoaKeluarRumah.mp3"))
        listAudio.add(AudioInfo("36. Masuk Rumah", "https://ia800200.us.archive.org/7/items/MurottalDoaSehariHari/DoaHisnulMuslim-07DoaMasukRumah.mp3"))
        listAudio.add(AudioInfo("37. Pergi Ke Masjid", "https://ia800200.us.archive.org/7/items/MurottalDoaSehariHari/DoaHisnulMuslim-08DoaPergiKeMasjid.mp3"))
        listAudio.add(AudioInfo("38. Masuk Masjid", "https://ia800200.us.archive.org/7/items/MurottalDoaSehariHari/DoaHisnulMuslim-09DoaMasukMasjid.mp3"))
        listAudio.add(AudioInfo("39. Keluar Masjid", "https://ia800200.us.archive.org/7/items/MurottalDoaSehariHari/DoaHisnulMuslim-10DoaKeluarMasjid.mp3"))
        listAudio.add(AudioInfo("40. Setalah Wudhu", "https://ia800200.us.archive.org/7/items/MurottalDoaSehariHari/DoaHisnulMuslim-05DoaSetelahWudhu.mp3"))
    }

    inner class AudioAdapter: BaseAdapter {
        var mylistAudio = ArrayList<AudioInfo>()
        constructor(mylistAudio:ArrayList<AudioInfo>):super(){
            this.mylistAudio=mylistAudio
        }

        override fun getCount(): Int {
            return this.mylistAudio.size
        }

        override fun getItem(itm: Int): Any {
            return this.mylistAudio[itm]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getView(postion: Int, p1: View?, p2: ViewGroup?): View {
            val myView = layoutInflater.inflate(R.layout.song_ticket, null)
            val Song = this.mylistAudio[postion]
            myView.tvJudul.text = Song.Title

            myView.buPlay.setOnClickListener(View.OnClickListener {

                if(myView.buPlay.text.equals("Stop")){
                    mp!!.stop()
                    myView.buPlay.text = "Start"
                }else{

                    mp = MediaPlayer()
                    try{
                        mp!!.setDataSource(Song.SongURL)
                        mp!!.prepare()
                        mp!!.start()
                        myView.buPlay.text ="Stop"
                        seekbar.max = mp!!.duration
                    }catch (ex: Exception){
                    }
                }
            })

            return myView
        }

    }

    inner class mySongTrack():Thread(){

        override fun run() {
            while (true){
                try {
                    Thread.sleep(1000)
                }catch (ex: Exception){}

                runOnUiThread {
                     if(mp!=null){
                         seekbar.progress = mp!!.currentPosition
                     }
                }
            }

        }
    }

    companion object{
        fun setWindowFlag(activity: Activity, bits: Int, on: Boolean){
            val window = activity.window
            val layoutParams = window.attributes
            if (on){
                layoutParams.flags = layoutParams.flags or bits
            }else {
                layoutParams.flags = layoutParams.flags and bits.inv()
            }
            window.attributes = layoutParams
        }
    }

}