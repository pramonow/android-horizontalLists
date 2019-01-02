package pramonow.com.endlesspageadapter

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

/*
    Example on making recycler view (list)
    Uncomment the call for trying API call
 */
class RecyclerViewActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var sampleAdapter: SampleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        recyclerView = findViewById(R.id.list)

        val linearLayoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerView.layoutManager = linearLayoutManager

        sampleAdapter = SampleAdapter()

        //Set callback for clicking
        recyclerView.adapter = sampleAdapter

    }
}
