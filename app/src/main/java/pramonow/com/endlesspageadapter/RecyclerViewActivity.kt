package pramonow.com.endlesspageadapter

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.widget.Button
import android.widget.FrameLayout
import android.widget.LinearLayout

/*
    Example on making recycler view (list)
    Uncomment the call for trying API call
 */
class RecyclerViewActivity : AppCompatActivity() {

    var recyclerViewList:MutableList<RecyclerView> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        var mainLayout = findViewById<LinearLayout>(R.id.mainLayout)

        recyclerViewList.add(RecyclerView(this))
        recyclerViewList.add(RecyclerView(this))
        recyclerViewList.add(RecyclerView(this))
        recyclerViewList.add(RecyclerView(this))
        recyclerViewList.add(RecyclerView(this))
        recyclerViewList.add(RecyclerView(this))

        recyclerViewList.forEach{
            it.setLayoutParams(LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT))
            it.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
            it.adapter = SampleAdapter()
            mainLayout.addView(it)
        }



    }
}
