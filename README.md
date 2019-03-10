# Android horizontal adapter list bundling [![](https://jitpack.io/v/pramonow/android-horizontalLists.svg)](https://jitpack.io/#pramonow/android-horizontalLists)

Bundling List of horizontal recycler view in one components

![alt text](https://github.com/pramonow/android-horizontalLists/blob/master/screenshoot.png?raw=true)

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
Dependency

	dependencies {
	        implementation 'com.github.pramonow:android-horizontalLists:1.0.1'
	}
  
Or you can use SNAPSHOT to keep your module up to date

	dependencies {
	        implementation 'com.github.pramonow:android-horizontalLists:-SNAPSHOT'
	}

# Making Horizontal List Bundler

In your xml layout file put in this block

```
<com.pramonow.horizontallistbundler.HorizontalListBundler
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:id="@+id/horizontal_bundler"/>
```

As for your activity

```     var horizontalListBundler: HorizontalListBundler
        horizontalListBundler = findViewById(R.id.horizontal_bundler)

        //The adapter followed by title
        horizontalListBundler.addList("Layout 1", SampleAdapter())
        horizontalListBundler.addList("Layout 2", SampleAdapter())
        horizontalListBundler.addList("Layout 3", SampleAdapter())
        horizontalListBundler.addList("Layout 4", SampleAdapter())
        
        //each list can be accessed like this
        //the horizontal list extends towards recycler view
        horizontalListBundler.getHorizontalList(0)
        
```
        
As for the buttons, 3 buttons are provided (Top right, bottom left and bottom right). In default they are invisible, but if you get the button it will automatically be visible.

```     var buttonLeftBot = horizontalListBundler.getHorizontalList(0).getBottomLeftButton()
        buttonLeftBot.setText("Button 1")
        var buttonTopRight = horizontalListBundler.getHorizontalList(0).getTopRightButton()
        buttonTopRight.setText("Button 2")
        var buttonTopLeft = horizontalListBundler.getHorizontalList(0).getBottomRightButton()
        buttonTopLeft.setText("Button 3")
```

# Making Horizontal List 

Making only one horizontal list is also possible if you don't need multiple list.
Do this in your xml
```
    <com.pramonow.horizontallistbundler.HorizontalListLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/horizontal_list"/>
```

And in your activity
```
        // Used if you only want to create one horizontal layout
        var horizontalList:HorizontalListLayout
        horizontalList = findViewById(R.id.horizontal_list)
        horizontalList.recyclerView.adapter = SampleAdapter()
```
