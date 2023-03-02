package com.example.pushnotificationdemo

class PushNotificationService : FirebaseMessagingService() {
    fun onMessageReceived(remoteMessage: RemoteMessage?) {
        super.onMessageReceived(remoteMessage)
    }
}