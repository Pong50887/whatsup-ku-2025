package org.classapp.whatsup

sealed class DestinationScreens(val route : String) {
    object Highlight : DestinationScreens("Highlight")
    object NearMe : DestinationScreens("NearMe")
    object MyEvents : DestinationScreens("myEvents")
}