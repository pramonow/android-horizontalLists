package com.pramonow.horizontallistbundler

import android.content.Context
import android.support.v4.widget.NestedScrollView
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout

class HorizontalListBundler:NestedScrollView{

    private var horizontalList:MutableList<HorizontalListLayout> = ArrayList()

    lateinit var listLayout:LinearLayout

    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet) {
        init(context)
    }

    private fun init(context: Context) {
        View.inflate(context, R.layout.layout_list_bundler,this)
        listLayout = findViewById(R.id.layout_list)
    }

    fun addList(title:String, listAdapter:RecyclerView.Adapter<*>) {
        var horizontalLayout = HorizontalListLayout(context)

        //Programmatically creating the horizontal layout view
        horizontalLayout.setLayoutParams(LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT))
        horizontalLayout.recyclerView.adapter = listAdapter
        horizontalLayout.title.text = title

        horizontalList.add(horizontalLayout)
        listLayout.addView(horizontalLayout)
    }

    //Get the horizontal list for targeted position
    //Can be used to access the title and recycler view
    fun getHorizontalList(index:Int):HorizontalListLayout {
        return horizontalList[index]
    }

}