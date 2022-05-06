package kr.ac.tukorea.listviewex

import java.io.Serializable

class PlaceList(
    val placeTxt: String,
    val placeDistance: String,
    val photo: String,
    val latitude: String,
    val longitude: String
) :
    Serializable {
}