package ir.poolitoapp.utils

object Constants {

}

//region Destinations
object Destinations{
    const val SPLASH_SCREEN = "splash"
    const val LOGIN_SCREEN = "login"

}
//endregion

//region ArgumentKeys
object ArgumentKeys{


}
//endregion

//region ServerConstants
object ServerConstants{


}
//endregion

//region JSonStatusCode
object JSonStatusCode{
    const val SUCCESS = 200
    const val EXPIRED_TOKEN = 401
    const val BAD_REQUEST = 400
    const val NOT_AUTHORIZED = 402
    const val SERVER_CONNECTION = 404
    const val INTERNET_CONNECTION = 13720818
}
//endregion

enum class AppKeyboard {
    Opened, Closed
}

