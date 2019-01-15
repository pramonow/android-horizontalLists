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

        var buttonLeftBot = horizontalListBundler.getHorizontalList(0).getBottomLeftButton()
        buttonLeftBot.setText("Button 1")
        var buttonTopRight = horizontalListBundler.getHorizontalList(0).getTopRightButton()
        buttonTopRight.setText("Button 2")
        var buttonTopLeft = horizontalListBundler.getHorizontalList(0).getBottomRightButton()
        buttonTopLeft.setText("Button 3")

        // Used if you only want to create one horizontal layout
        //var horizontalList:HorizontalListLayout
        //horizontalList = findViewById(R.id.horizontal_list)
        //horizontalList.recyclerView.adapter = SampleAdapter()

    }
}
