package pramonow.com.endlesspageadapter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.pramonow.horizontallistbundler.HorizontalListBundler


class RecyclerViewActivity : AppCompatActivity() {

    lateinit var horizontalListBundler: HorizontalListBundler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        horizontalListBundler = findViewById(R.id.horizontal_bundler)

        horizontalListBundler.addList("Layout 1", SampleAdapter())
        horizontalListBundler.addList("Layout 2", SampleAdapter())
        horizontalListBundler.addList("Layout 3", SampleAdapter())
        horizontalListBundler.addList("Layout 4", SampleAdapter())

        var button = horizontalListBundler.getHorizontalList(0).getBottomLeftButton()
        button.setText("SET TEXT")

    }
}
