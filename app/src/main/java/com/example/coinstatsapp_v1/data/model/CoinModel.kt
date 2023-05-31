package com.example.coinstatsapp_v1.data.model

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "_coins_table")
data class CoinModel(
    @PrimaryKey
    var primaryKey:Int = 0,
    val availableSupply: Long,
    val contractAddress: String?,
    val decimals: Int,
    val icon: String?,
    val id: String?,
    val marketCap: Double,
    val name: String?,
    val price: Double,
    val priceBtc: Double,
    val priceChange1d: Double,
    val priceChange1h: Double,
    val priceChange1w: Double,
    val rank: Int,
    val symbol: String?,
    val totalSupply: Long,
    val twitterUrl: String?,
    val volume: Double,
    val websiteUrl: String?
):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readLong(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readDouble(),
        parcel.readString(),
        parcel.readDouble(),
        parcel.readDouble(),
        parcel.readDouble(),
        parcel.readDouble(),
        parcel.readDouble(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readLong(),
        parcel.readString(),
        parcel.readDouble(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(primaryKey)
        parcel.writeLong(availableSupply)
        parcel.writeString(contractAddress)
        parcel.writeInt(decimals)
        parcel.writeString(icon)
        parcel.writeString(id)
        parcel.writeDouble(marketCap)
        parcel.writeString(name)
        parcel.writeDouble(price)
        parcel.writeDouble(priceBtc)
        parcel.writeDouble(priceChange1d)
        parcel.writeDouble(priceChange1h)
        parcel.writeDouble(priceChange1w)
        parcel.writeInt(rank)
        parcel.writeString(symbol)
        parcel.writeLong(totalSupply)
        parcel.writeString(twitterUrl)
        parcel.writeDouble(volume)
        parcel.writeString(websiteUrl)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<CoinModel> {
        override fun createFromParcel(parcel: Parcel): CoinModel {
            return CoinModel(parcel)
        }

        override fun newArray(size: Int): Array<CoinModel?> {
            return arrayOfNulls(size)
        }
    }
}