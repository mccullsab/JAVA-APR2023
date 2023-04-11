### Project setup recap
1. Created a new starter project with MySQL driver, JPA, devtools, Spring Web
2. Added dependencies on pom.xml 
   - For database: persistence validation
   - For web: jasper, jstl
3. Added config on application.properties 
   - For database: MySQL connection 
   - For Web: ```spring.mvc.view.prefix=/WEB-INF/```
4. Created all the packages (controllers, models, services, repo)
5. Created the following files
   | Package    | Files | Use |
   | ---------- | ---------------| -------------------------|
   | models     | Donation class | like ERD, building the database design on server |
   | repositores| DonationRepository interface | To perform queries on MySQL | 
   | services   | DonationService class | To handle all backend logic (will stay the same) |  
   | controllers| APIController class | To receive HTTP request and give response with the data (will not be required) | 
