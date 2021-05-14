# PlantixDemo Challenge


## Problem statement ##

  * Implement a simple app to showcase your understanding of a robust, scalable and production-quality app architecture. 
    The app should show a list of names with the first letter capitalized. But our data sources only hold lower case names. 

  * Specifications: 
      o   Separation of concerns 
      o   A remote and local data source both returning the same list of lower case names. 
         Local data is preferred over remote data. If no local data is available we need to fetch from remote. 
      o   Data sources can be mocked (no http client or database implementation needed)
      o   Please use Kotlin to solve this task 

* Additional question: Which technologies would you use for implementing the remote & local data source in a real application assumed our backend provides a REST API
  Answer:  
    o   Retrofit for network apis
    o   Dagger2 with hilt for dependency injection so we can easly to inject classes throughout the app
    o   LiveData for db reactive programming 
    o   Room db for local database

	
  ** Skills Set : Kotlin, ViewModel, Databinding, Livedata
  
 
  ** Screenshots
  
  https://drive.google.com/file/d/13fdUru-Yp4qDHbXgkg3y_jmm-3PYoQvS/view?usp=sharing
  
  
  --- Don't forget to comments for more improvement ---
  
