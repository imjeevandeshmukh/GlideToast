# DialogSheet
An Android library to build bottom sheet dialog.

---

## Releases:

#### Current release: 1.0

You can see all the library releases [here](https://github.com/imjeevandeshmukh/FancyBottomSheetDialog/releases).

---

## Screenshots
<kbd><img src="https://raw.githubusercontent.com/imjeevandeshmukh/FancyBottomSheetDialog/master/Screenshots/WhatsApp%20Image%202018-06-14%20at%205.41.42%20PM%20(2).jpeg" width="350"></kbd>&nbsp;&nbsp;&nbsp;&nbsp;
<kbd><img src="https://raw.githubusercontent.com/imjeevandeshmukh/FancyBottomSheetDialog/master/Screenshots/WhatsApp%20Image%202018-06-14%20at%205.41.42%20PM%20(3).jpeg" width="350"></kbd>

<kbd><img src="https://raw.githubusercontent.com/imjeevandeshmukh/FancyBottomSheetDialog/master/Screenshots/WhatsApp%20Image%202018-06-14%20at%205.41.42%20PM%20(4).jpeg" width="350"></kbd>
<kbd><img src="https://raw.githubusercontent.com/imjeevandeshmukh/FancyBottomSheetDialog/master/Screenshots/WhatsApp%20Image%202018-06-14%20at%205.41.42%20PM%20(6).jpeg" width="350"></kbd>
<kbd><img src="https://raw.githubusercontent.com/imjeevandeshmukh/FancyBottomSheetDialog/master/Screenshots/WhatsApp%20Image%202018-06-14%20at%205.41.42%20PM.jpeg" width="350"></kbd>
Download the sample apk [here](https://github.com/imjeevandeshmukh/FancyBottomSheetDialog/raw/master/app-debug.apk).

---

## Usage:

### Adding the depencency

Add this to your root *build.gradle* file:

```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Now add the dependency to your app build.gradle file:

```
 implementation 'com.github.imjeevandeshmukh:FancyBottomSheetDialog:1.0'
	
```

### Creating the dialog with Java

Here is a complete snippet of it usage:

```java
new FancyBottomSheetDialog.Builder(this)
                .setTitle("Alert bottom sheet dialog")
                .setMessage("This is where we show the information.This is a message.This is where we show message explain or showing the information.")
                .setBackgroundColor(Color.parseColor("#3F51B5")) //don't use R.color.somecolor
                .setIcon(R.drawable.ic_pan_tool_black_24dp,true)
                .isCancellable(false)
                .OnNegativeClicked(new FancyBottomSheetDialog.FancyBottomSheetDialogListener() {
                    @Override
                    public void OnClick() {

                    }
                })
                .OnPositiveClicked(new FancyBottomSheetDialog.FancyBottomSheetDialogListener() {
                    @Override
                    public void OnClick() {

                    }
                })
                .setNegativeBtnText("Cancel")
                .setPositiveBtnText("Ok")
                .setPositiveBtnBackground(Color.parseColor("#3F51B5"))//don't use R.color.somecolor
                .setNegativeBtnBackground(Color.WHITE)//don't use R.color.somecolor
                .build();
```

## License

```
MIT License

Copyright (c) 2018 imjeevandeshmukh

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

