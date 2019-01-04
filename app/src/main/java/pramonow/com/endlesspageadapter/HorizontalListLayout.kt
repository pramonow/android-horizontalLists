package pramonow.com.endlesspageadapter

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView

class HorizontalListLayout:LinearLayout{

    lateinit var title: TextView
    lateinit var recyclerView: RecyclerView

    constructor(context: Context) : super(context) {
        init(context)
    }

    private fun init(context: Context)
    {
        View.inflate(context, R.layout.layout_horizontal_list,this)

        //INIT EVERY VIEW
        title = findViewById(R.id.title_text)
        recyclerView = findViewById(R.id.item_list)
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false)
    }
}