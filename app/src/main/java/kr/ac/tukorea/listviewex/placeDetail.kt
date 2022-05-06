package kr.ac.tukorea.listviewex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class placeDetail : AppCompatActivity() {
    lateinit var rPlace: TextView
    lateinit var rPhoto: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_place_detail)

        setValues()
    }

    fun setValues() {
        val place = intent.getSerializableExtra("placeInfo") as Place
        var url:Int=getResources().getIdentifier(place.photo, "drawable", this.getPackageName())
        rPhoto.setImageResource(url)
        rPlace.text = "${place.placeName}"
        rPhoto.setImageResource(url)
    }
}