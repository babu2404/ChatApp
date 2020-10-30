package models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize

class User(val uid: String, val username: String, val profileImageUrl: String): Parcelable {

    // user need define a argument constructor
    constructor() : this("","","")

}