package com.pramonow.horizontallistbundler

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class HorizontalListLayout:LinearLayout{

    lateinit var title: TextView
    lateinit var recyclerView: RecyclerView
    lateinit var buttonTopRight:Button
    lateinit var buttonBottomLeft:Button
    lateinit var buttonBottomRight:Button

    constructor(context: Context) : super(context) {
        init(context)
    }

    private fun init(context: Context) {
        View.inflate(context, R.layout.layout_horizontal_list,this)

        //INIT EVERY VIEW
        title = findViewById(R.id.title_text)
        recyclerView = findViewById(R.id.item_list)

        buttonTopRight = findViewById(R.id.button_top_right)
        buttonBottomRight = findViewById(R.id.button_bottom_right)
        buttonBottomLeft = findViewById(R.id.button_bottom_left)

        //layout manager for horizontal scrolling
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false)
    }

    fun getTopRightButton():Button{
        buttonTopRight.visibility = View.VISIBLE
        return buttonTopRight
    }

    fun getBottomLeftButton():Button{
        buttonBottomLeft.visibility = View.VISIBLE
        return buttonBottomLeft
    }

    fun getBottomRightButton():Button{
        buttonBottomRight.visibility = View.VISIBLE
        return buttonBottomRight
    }

    fun hideTopRightButton(){
        buttonTopRight.visibility = View.INVISIBLE
    }

    fun hideBottomLeftButton(){
        buttonBottomLeft.visibility = View.GONE
    }

    fun hideBottomRightButton(){
        buttonBottomRight.visibility = View.GONE
    }

}