# android-horizontalLists

Bundling List of horizontal recycler view in one components

```<com.pramonow.horizontallistbundler.HorizontalListBundler
      android:layout_width="match_parent"
      android:layout_height="wrap_content"
      android:id="@+id/horizontal_bundler"/>
```

For making horizontal list bundler

```        var horizontalListBundler: HorizontalListBundler
        horizontalListBundler = findViewById(R.id.horizontal_bundler)

        //The adapter followed by title
        horizontalListBundler.addList("Layout 1", SampleAdapter())
        horizontalListBundler.addList("Layout 2", SampleAdapter())
        horizontalListBundler.addList("Layout 3", SampleAdapter())
        horizontalListBundler.addList("Layout 4", SampleAdapter())
```
        
Buttons provided

```        var buttonLeftBot = horizontalListBundler.getHorizontalList(0).getBottomLeftButton()
        buttonLeftBot.setText("Button 1")
        var buttonTopRight = horizontalListBundler.getHorizontalList(0).getTopRightButton()
        buttonTopRight.setText("Button 2")
        var buttonTopLeft = horizontalListBundler.getHorizontalList(0).getBottomRightButton()
        buttonTopLeft.setText("Button 3")
```

Also if you only want to make one
```
        // Used if you only want to create one horizontal layout
        var horizontalList:HorizontalListLayout
        horizontalList = findViewById(R.id.horizontal_list)
        horizontalList.recyclerView.adapter = SampleAdapter()
```
