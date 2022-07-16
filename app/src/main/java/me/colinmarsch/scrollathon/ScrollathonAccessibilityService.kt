package me.colinmarsch.scrollathon

import android.accessibilityservice.AccessibilityService
import android.accessibilityservice.AccessibilityServiceInfo
import android.view.accessibility.AccessibilityEvent
import android.view.accessibility.AccessibilityEvent.TYPE_VIEW_SCROLLED

class ScrollathonAccessibilityService : AccessibilityService() {
    override fun onServiceConnected() {
        serviceInfo = AccessibilityServiceInfo().apply {
            eventTypes = TYPE_VIEW_SCROLLED
        }
    }

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        // TODO: Implement event handling
    }

    override fun onInterrupt() {
        // TODO: Is there some teardown work to do here?
    }
}