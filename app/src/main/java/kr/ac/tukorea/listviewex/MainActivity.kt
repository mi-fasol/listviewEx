package kr.ac.tukorea.listviewex

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var placeList = arrayListOf<PlaceList>(
        PlaceList("오이도 빨간 등대", "23.7km", "oido", "37.3454877", "126.6878909"),
        PlaceList("옥구공원", "23.7km", "okgu", "37.3555837", "126.7123902"),
        PlaceList("월곶포구", "23.7km", "oido", "37.3884907", "126.7371040"),
        PlaceList("시흥 갯골 생태공원", "23.7km", "sangtae", "37.3899716", "126.7804895"),
        PlaceList("그린웨이", "23.7km", "oido", "37.3908322", "126.7805773"),
        PlaceList("호조벌", "23.7km", "dream", "37.4031408", "126.8122190"),
        PlaceList("연꽃테마파크", "23.7km", "lotus", "37.4022234", "126.8072335"),
        PlaceList("물왕저수지", "23.7km", "mulwang", "37.3845244", "126.8363517"),
        PlaceList("보통천 자전거길", "23.7km", "botong", "37.3932795", "126.8191739"),
        PlaceList("시화방조제", "23.7km", "sihwa", "37.3267492", "126.6543702")
    )
    lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)
        listView.isNestedScrollingEnabled = false
        val placeAdapter = MainListAdapter(this, placeList)
        listView.adapter = placeAdapter

        setupEvents();
    }

    fun setupEvents() {
        listView.setOnItemClickListener { adapterView, view, i, l ->
            val Place = Place(placeList!![i].placeTxt, placeList!![i].photo)
            val intent = Intent(this, placeDetail::class.java)
            intent.putExtra("placeInfo", Place)
            startActivity(intent)
        }
    }
}