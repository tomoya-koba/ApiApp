package jp.techacademy.tomoya.kobayashi5.apiapp
import com.google.gson.annotations.SerializedName


data class ApiResponse(
    @SerializedName("results")
    val results: Results
)

data class Results(
    @SerializedName("api_version")
    val apiVersion: String,
    @SerializedName("results_available")
    val resultsAvailable: Int,
    @SerializedName("results_returned")
    val resultsReturned: String,
    @SerializedName("results_start")
    val resultsStart: Int,
    @SerializedName("shop")
    val shop: List<Shop>
)

data class Shop(
    @SerializedName("coupon_urls")
    val couponUrls: CouponUrls,
    @SerializedName("id")
    val id: String,
    @SerializedName("logo_image")
    val logoImage: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("address")
    var address: String,
)

data class CouponUrls(
    @SerializedName("pc")
    val pc: String,
    @SerializedName("sp")
    val sp: String
)
