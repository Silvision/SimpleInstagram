package com.example.simpleinstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application{

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);


        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("PBNs8qJj3B9kb9oeFSYUbxQwWhntJWFikJ39BU2Z")
                .clientKey("7UoOswxO5XebLBbs9zVxPcbEtrtOj3hZZoWtuGcN")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }



}
