Software Project Report


First I linked SonarCloud with my project repository on GitHub
 
Then , I set up a GitHub Action environment
 

After ensuring the correct connection. I started making fixes to the code as there were a lot of issues that needed to be resolved


This image shows the issues in the project and the overall status of the project before repairs begin

 
These are the first cases I solved
 
Here the improvements appear after the first problem is solved and the code is updated correctly

 
I had a problem opening the built-in IDE in Sonar Cloud. So I was editing from GitHub 
Below are some photos I took while working on the repairs











The issue of placing the Main in Package

 
 
 
 
Other issues

 
 
 
 
 
 
  
 
 
 
 
 
 
 
 

















One of the most important issues related to security that has been solved is hiding the API key from the code and keeping it in a safe place.
 
--------------------------
 
-----------------
 
----------------------
 

Another issue in the field of security
 
 

This problem was solved by adding a file containing the login information separately from the code
 

.



               

Above is a group of issues that have been solved. The issues varied between: modifying variable names, removing unused methods, refactoring the code to comply with specific programming rules, refactoring the code to reduce its complexity and facilitate reading and facilitating maintenance.


Through these images, we can notice the significant and noticeable improvements that occurred in the code after the completion of the refactoring process😊







Before:(

 

After:)

 
![Screenshot 2024-08-19 152535](https://github.com/user-attachments/assets/f911bd70-ad9a-460e-b092-f0359e11904c)

 
 
   
  
Among the problems that I benefited from fixing were security problems, where I learned how to deal correctly with API keys, how to pass sensitive variables to public programs, and the necessary modifications to the program in terms of displaying developer-specific error messages, which must be removed when the final product is released because these error messages may contain information. Sensitive to internal program structure.


Regarding the coverage percentage for Features and Test Cases, it did not appear in the Sonar Cloud despite many attempts to do so. I will use the Eclipse results to display the coverage percentage
 
