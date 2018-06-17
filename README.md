# GlideToast
An Android library to build flying animated toast message.

---

## Releases:

#### Current release: 1.0

You can see all the library releases [here](https://github.com/imjeevandeshmukh/GlideToast/releases).

---

## Screenshots
<kbd><img src="https://github.com/imjeevandeshmukh/GlideToast/blob/master/gifs/default.gif?raw=true" width="250"></kbd>&nbsp;&nbsp;&nbsp;&nbsp;
<kbd><img src="https://github.com/imjeevandeshmukh/GlideToast/blob/master/gifs/success.gif?raw=true" width="250"></kbd>

<kbd><img src="https://github.com/imjeevandeshmukh/GlideToast/blob/master/gifs/fail.gif?raw=true" width="250"></kbd>
<kbd><img src="https://github.com/imjeevandeshmukh/GlideToast/blob/master/gifs/info.gif?raw=true" width="250"></kbd>
<kbd><img src="https://github.com/imjeevandeshmukh/GlideToast/blob/master/gifs/warn.gif?raw=true" width="250"></kbd>
<kbd><img src="https://github.com/imjeevandeshmukh/GlideToast/blob/master/gifs/top.gif?raw=true" width="250"></kbd>
<kbd><img src="https://github.com/imjeevandeshmukh/GlideToast/blob/master/gifs/center.gif?raw=true" width="250"></kbd>
<kbd><img src="https://github.com/imjeevandeshmukh/GlideToast/blob/master/gifs/bottom.gif?raw=true" width="250"></kbd>
---
Download the sample apk [here](https://github.com/imjeevandeshmukh/GlideToast/raw/master/app-debug.apk).

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
  implementation 'com.github.imjeevandeshmukh:GlideToast:1.0'
	
```

### Creating the GlideToast with Java

Here is a complete snippet of it usage:

```java
### USE CASE 1:Simple GlideToast;
     
     1st parameter = Activity
     2nd parameter = String
     3rd parameter = int i.e., duration
     
### SAMPLE CODE:
     
     new GlideToast.makeToast(MainActivity.this,"Some random text here", GlideToast.LENGTHLONG).show();
     
### USE CASE 2:Style GlideToast;
     
     1st parameter = Activity
     2nd parameter = String
     3rd parameter = int i.e., duration
     4th parameter = string style i.e., 
            DEFAULTTOAST
            SUCCESSTOAST
            FAILTOAST
            WARNINGTOAST
            INFOTOAST
            CUSTOMTOAST(When you pass in CUSTOMTOAST,you must pass in icon and background color using use case 4 or case 4 construtor)
	    
### SAMPLE CODE:
     
     
    new GlideToast.makeToast(MainActivity.this,"Some random text here", GlideToast.LENGTHLONG,GlideToast.SUCCESSTOAST).show();
    
    
### USE CASE 3:Set Gravity to GlideToast;
     
      1st parameter = Activity
     2nd parameter = String
     3rd parameter = int i.e., duration
     4th parameter = String style i.e.,6 Options to select from. (default is DEFAULTTOAST)
            1.DEFAULTTOAST
            2.SUCCESSTOAST
            3.FAILTOAST
            4.WARNINGTOAST
            5.INFOTOAST
            6.CUSTOMTOAST(When you pass in CUSTOMTOAST,you must pass in icon and background color using use case 4 or case 4 construtor)
	    5th parameter = int gravity i.e.,
	    1.TOP
	    2.BOTTOM
	    3.CENTER
	    
### SAMPLE CODE:
     
     
     new GlideToast.makeToast(MainActivity.this,"Some random text here",GlideToast.LENGTHLONG,GlideToast.SUCCESSTOAST,GlideToast.TOP).show();
     
     
### USE CASE 4:Custom background color and icon to GlideTOAST;
     
     1st parameter = Activity
     2nd parameter = String
     3rd parameter = int i.e., duration
     4th parameter = String style i.e.,6 Options to select from. (default is DEFAULTTOAST)
            1.DEFAULTTOAST
            2.SUCCESSTOAST
            3.FAILTOAST
            4.WARNINGTOAST
            5.INFOTOAST
            6.CUSTOMTOAST(When you pass in CUSTOMTOAST,you must pass in icon and background color using this construtor)
     5th parameter = int gravity i.e.,
	    1.TOP
	    2.BOTTOM
	    3.CENTER
     6th parameter = int icon i.e.,drawable icon
     7th parameter = String color i.e.,pass in hex color code in a string.
     
 ### SAMPLE CODE:
       
       
     new GlideToast.makeToast(MainActivity.this,"Some random text here",GlideToast.LENGTHLONG,GlideToast.SUCCESSTOAST,GlideToast.TOP,R.drawable.someicon,"#ffffff").show();

     
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

