import android.app.Application
import android.content.Context
import com.example.android.marsphotos.BuildConfig
import com.nextmillenium.inappsdk.core.InAppSdk

abstract  class MainApplication: Application() {

    companion object {

        private  lateinit var context: Context

        fun setContext(con:Context){
            context = con
        }
    }

    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG){
            InAppSdk.sendScreenNames(this)
        }
        InAppSdk.initialize(this)
    }

}