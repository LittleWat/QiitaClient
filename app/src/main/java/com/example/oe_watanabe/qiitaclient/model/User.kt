package com.example.oe_watanabe.qiitaclient.model

import android.os.Parcel
import android.os.Parcelable

data class User(val id: String,
                val name: String,
                val profileImageUrl: String) : Parcelable {

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<User> = object : Parcelable.Creator<User> {

            override fun createFromParcel(source: Parcel?): User = source.run {
                User(this!!.readString(), readString(), readString())
            }

            override fun newArray(size: Int): Array<User?> = arrayOfNulls(size)
        }
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.run {
            writeString(id)
            writeString(name)
            writeString(profileImageUrl)
        }
    }

    override fun describeContents(): Int {
        return 0
    }
}