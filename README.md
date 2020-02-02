# AndroidBackground-Threads
using asycTask to do background threads in android patterns to avoid the UI crushing
![asycTask](https://user-images.githubusercontent.com/34624703/73610411-f34ea180-45e7-11ea-98dc-a5b610bf238c.png)
With  Android operating system, Task that take long time should 
not use same code as of the mainActivity Task.
This may cause the application to hang and android system may 
ask the user to quit the apllication
rendering your app usesless and boring.
To do good and well documented and coded background asyncTask, 
Check this out from android team: https://developer.android.com/reference/android/os/AsyncTask 
To make this simple check  out Github.com/TimzOwen repo on this same issues linked below: 
Make the steps simple by: 
•	Creating a subclass AsyncTask<> -class. //make this private:
•	Handling the doInBackgroundTask() - Method
•	Handle the onProgressUpdate() –method
•	Handle onPostExecute() – method
Make sure to pass in the correct parameter on the class i.e (params, progress , result)
If you have no progress update make the input parameter “Void”;
The awesomeness of the Threads and parallelism is it is difficult for the application to 
Crash while as it allows the app to perform other things waiting for the background task.
Why not make this external java file?
The good thing about this is it allows the user to get and fetch IDs from the MainActivity 
And prevents creation of many java files which is difficult for reviews.
![askprogress](https://user-images.githubusercontent.com/34624703/73610613-5ccfaf80-45ea-11ea-86a9-b7111a83a537.jpg)
Allowing the user to check the progress is better than making a user keep waiting to 
Download a file and not sure if the file is what time left
![askdon](https://user-images.githubusercontent.com/34624703/73610616-60633680-45ea-11ea-95e7-50143b01765a.gif)
This demo shows the onUpdate task. 
![ask task](https://user-images.githubusercontent.com/34624703/73610619-62c59080-45ea-11ea-895b-0cfcfe2426cd.png)



