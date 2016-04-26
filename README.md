# LayerPermission

When I add Layer as a dependency, the app no longer has the GET_ACCOUNTS permission. I reproduced this bug (running this app) on a Motorola XT1032 running Android version 5.1, and also on a Nexus 5 running Android version 6.0.1.

When I add the line `compile 'com.layer.sdk:layer-sdk:0.20.0'` to build.gradle, then the log prints "Permission: false" because the GET_ACCOUNTS permission was not there. However, if I comment out that line, the log prints "Permission: true".

When switching between the commits, sometimes it will give this error: `java.lang.RuntimeException: Unable to start activity ComponentInfo{com.example.lexi.myapplication/com.example.lexi.myapplication.MainActivity}: android.view.InflateException: Binary XML file line #36: Binary XML file line #36: Error inflating class android.support.v7.widget.Toolbar`  That will go away if you uninstall the app and reinstall it. The app is called "My Application" and uses the default icon.

In the production app where we first discovered this bug, it crashes with this exception: `java.lang.SecurityException: caller uid XXXXX lacks any of android.permission.GET_ACCOUNTS` every time there is any code that uses the GET_ACCOUNTS permission.
