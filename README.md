# PlantixDemo Challenge


## Problem statement ##

  * Implement a simple app to showcase your understanding of a robust, scalable and production-quality app architecture. 
    The app should show a list of names with the first letter capitalized. But our data sources only hold lower case names. 

  * Specifications: <br/>
      o   Separation of concerns <br/>
      o   A remote and local data source both returning the same list of lower case names. Local data is preferred over remote data. If no local data is available we need to fetch from remote. <br/>
      o   Data sources can be mocked (no http client or database implementation needed) <br/>
      o   Please use Kotlin to solve this task <br/>

* Additional question: Which technologies would you use for implementing the remote & local data source in a real application assumed our backend provides a REST API <br/>
  Answer: <br/> 
    o   Retrofit for network apis <br/>
    o   Dagger2 with hilt for dependency injection so we can easly to inject classes throughout the app <br/>
    o   LiveData for db reactive programming <br/>
    o   Room db for local database <br/>

	
  ** Skills Set : Kotlin, ViewModel, Databinding, Livedata
  
 
  ** Screenshots
  
  https://drive.google.com/file/d/13fdUru-Yp4qDHbXgkg3y_jmm-3PYoQvS/view?usp=sharing
  
  
  --- Don't forget to comments for more improvement ---
  
