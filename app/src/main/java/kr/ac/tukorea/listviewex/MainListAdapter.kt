package kr.ac.tukorea.listviewex

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MainListAdapter(val context: Context, val placeList : ArrayList<PlaceList>) : BaseAdapter() {
    override fun getView(position : Int, convertView: View?, parent : ViewGroup?): View {
        val view : View = LayoutInflater.from(context).inflate(R.layout.main_lv_item, null)

        val photo = view.findViewById<ImageView>(R.id.placeImg)
        val placeName = view.findViewById<TextView>(R.id.placeTxt)
        val distance = view.findViewById<TextView>(R.id.placeDistance)

        val place = placeList[position]
        val resourceId = context.resources.getIdentifier(place.photo, "drawable", context.packageName)
        photo.setImageResource(resourceId)
        placeName.text = place.placeTxt
        distance.text = place.placeDistance

        return view
    }
    override fun getCount(): Int {
        return placeList.size
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItem(position : Int): Any {
        return placeList[position]
    }
}