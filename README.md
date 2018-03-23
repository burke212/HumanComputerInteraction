# Human Computer Interaction

I did not have to use many resources since I am very familiar with Android Studio and have taken the Mobile Device Application class, where we programmed many apps. One source I did use was the Android Studio docs. 

I did not use the drag and drop feature for the UI/ xml. From my experience I prefer to code the UI myself, and so that is what I did. I created a vertical LinearLayout to hold the data, and three buttons: RED, GREEN, BLUE. Each button matches the phone's width. I gave each button the same "weight" so that they would fill the entire screen equally (i.e. I did not hard code the height values). Each button also uses the onClick method. 

In the ActivityMain.java, I gave each button a setOnClickListener. Each of these calls a switch method, that changes the corresponding button color of the button object that calls the method (i.e. if the red button is pressed/ the red object is utilized, the switch function is called, and changes the red button's color to red because it is the red object that called the function). 

I did not hit any roadblocks that I could not overcome by simply reviewing the Android Studio docs. 
