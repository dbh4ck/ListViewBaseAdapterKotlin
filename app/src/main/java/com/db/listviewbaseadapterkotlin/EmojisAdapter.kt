package com.db.listviewbaseadapterkotlin

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView


/**
 * Created by DB on 21-12-2017.
 */
class EmojisAdapter(applicationContext: Context?, emojis: Array<String>, emojxImg: IntArray) : BaseAdapter() {
    var context: Context? = applicationContext
    var emojis: Array<String>? = emojis
    var emojxImg: IntArray? = emojxImg
    var inflater: LayoutInflater? = null

    init {
        this.inflater = LayoutInflater.from(context)
    }

    override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {
        val view : View?
        val vh : ListRowHolder

        if(convertView == null){

            view = this.inflater!!.inflate(R.layout.list_item, viewGroup, false)
            vh = ListRowHolder(view)
            view?.tag = vh

        }else{
            view = convertView
            vh = view.tag as ListRowHolder
        }

        vh.emoTxt.setText(emojis!![position])
        vh.emoImg.setImageResource(emojxImg!![position])
        return view!!
    }

    override fun getItem(position: Int): Any {
        return emojis!![position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return emojis!!.size
    }


    private class ListRowHolder(row : View?){
        val emoTxt : TextView
        val emoImg : ImageView

        init {
            this.emoTxt = row?.findViewById<View>(R.id.emojiName) as TextView
            this.emoImg = row?.findViewById<View>(R.id.emojiImg) as ImageView
        }
    }
}