package dev.jahir.frames.app

// TODO: Remove comment marks to enable
// import com.onesignal.OSNotificationReceivedEvent
// import com.onesignal.OneSignal
// import dev.jahir.frames.extensions.context.preferences
import dev.jahir.frames.ui.FramesApplication

class MyApplication : FramesApplication(BuildConfig.ONESIGNAL_APP_ID) {
    override fun onCreate() {
        super.onCreate()
        // TODO: Remove comment marks to enable
        /*
        OneSignal.initWithContext(this);
        OneSignal.setAppId(BuildConfig.ONESIGNAL_APP_ID);

        OneSignal.setNotificationWillShowInForegroundHandler { notificationReceivedEvent: OSNotificationReceivedEvent ->
            notificationReceivedEvent.complete(
                if (preferences.notificationsEnabled)
                    notificationReceivedEvent.notification
                else null
            )
        }

        OneSignal.unsubscribeWhenNotificationsAreDisabled(true)
        OneSignal.pauseInAppMessages(true)
        OneSignal.setLocationShared(false)
        */
    }
}
