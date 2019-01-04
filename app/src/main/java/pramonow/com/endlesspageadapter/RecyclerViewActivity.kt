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

    lateinit var horizontalListBundler: HorizontalListBundler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        horizontalListBundler = findViewById(R.id.horizontal_bundler)


        horizontalListBundler.addList("Layout 1", SampleAdapter())
        horizontalListBundler.addList("Layout 1=2", SampleAdapter())
        horizontalListBundler.addList("Layout 3", SampleAdapter())
        horizontalListBundler.addList("Layout 4", SampleAdapter())


    }
}
