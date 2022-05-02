package kr.ac.tukorea.listviewex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    var placeList = arrayListOf<PlaceList>(
        PlaceList("오이도 빨간 등대", "23.7km","oido"),
        PlaceList("옥구공원", "23.7km","okgu") ,
        PlaceList("월곶포구", "23.7km","oido") ,
        PlaceList("시흥 갯골 생태공원", "23.7km","sangtae") ,
        PlaceList("그린웨이", "23.7km","oido") ,
        PlaceList("호조벌", "23.7km","dream"),
        PlaceList("연꽃테마파크", "23.7km","lotus"),
        PlaceList("물왕저수지", "23.7km","oido"),
        PlaceList("보통천 자전거길", "23.7km","botong"),
        PlaceList("시화방조제", "23.7km","sihwa")
    )
    lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)
        val placeAdapter = MainListAdapter(this, placeList)
        listView.adapter = placeAdapter

    }
}