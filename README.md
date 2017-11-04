# AppWidget
Android桌面小组件，点击可进入活动，并给活动传递参数。并且在卸载过后，小控件会自动消失。<br>
在活动中，因为给活动定义了andrdroid:lauchMode=singleTask,在活动未被finish()情况下，intent传递数
据在Activity的onNewIntent()方法中获取。
效果<br>
![图片加载失败](https://github.com/HeTingwei/AppWidget/blob/master/doc/%E6%95%88%E6%9E%9C.gif)
