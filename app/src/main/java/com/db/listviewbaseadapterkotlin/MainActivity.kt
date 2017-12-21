package com.db.listviewbaseadapterkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    var lv : ListView? = null;

    var emojis = arrayOf(
            "Smile :) ",
            "Wink ;) ",
            "Laugh :D ",
            "Sad :( ",
            "Tongue :p ",
            "Angry :@ ",
            "Confused :-s ",
            "Crying :'( ",
            "Evil >D ",
            "Surprised :o ",
            "Speechless :-|",
            "Kiss :* ",
            "Devil (6) ",
            "Angel (a) ",
            "Tired (:| ",
            "Sick :-& ",
            "Love <3 ",
            "Heartbroken (u) ",
            "Dont Tell :-# ",
            "Sweat #:-S ",
            "Blushing :$ ",
            "Flower (f) ",
            "Sleeping I-) ",
            "Afraid :-SS ",
            "Jawdrop 8[] "
    )

    var emojxImg = intArrayOf(
            R.drawable.emoticon_smile,
            R.drawable.emoticon_wink,
            R.drawable.emoticon_laugh,
            R.drawable.emoticon_sad,
            R.drawable.emoticon_tongue,
            R.drawable.emoticon_angry,
            R.drawable.emoticon_confused,
            R.drawable.emoticon_crying,
            R.drawable.emoticon_evil,
            R.drawable.emoticon_surprised,
            R.drawable.emoticon_speechless,
            R.drawable.emoticon_kiss,
            R.drawable.emoticon_devil,
            R.drawable.emoticon_angel,
            R.drawable.emoticon_tired,
            R.drawable.emoticon_sick,
            R.drawable.emoticon_love,
            R.drawable.emoticon_heartbroken,
            R.drawable.emoticon_dont_tell,
            R.drawable.emoticon_sweat,
            R.drawable.emoticon_blushing,
            R.drawable.emoticon_flower,
            R.drawable.emoticon_sleeping,
            R.drawable.emoticon_afraid,
            R.drawable.emoticon_jawdrop
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lv = findViewById<View>(R.id.list) as ListView
        val emojisAdapter = EmojisAdapter(applicationContext, emojis, emojxImg)
        lv!!.setAdapter(emojisAdapter)
    }
}
