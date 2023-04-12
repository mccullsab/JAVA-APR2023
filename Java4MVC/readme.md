# One-to-Many notes 

#### Reference:
- MVC demo repo: 
[models-controllers-service-repo](https://github.com/heidi1105/JAVA-APR2023/tree/main/Java4MVC/mvc-demo/src/main/java/com/heidichen/mvcdemo) | [jsp files](https://github.com/heidi1105/JAVA-APR2023/tree/main/Java4MVC/mvc-demo/src/main/webapp/WEB-INF)

## 1. Project Setup
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
   | controllers| HomeController class | To receive HTTP request and render the jsp |

## 2. Models
1. Refer to the MVC demo models that follow POJO (private attributes, constructor, getters/setters) for both models (User & Donation)
2. Create the foreign key reference so that these 2 tables are joint
    ##### Donation model
    ```java
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="donor_id")
    private User donor;
    ```

    ##### User model
    ```java
    @OneToMany(mappedBy="donor", fetch = FetchType.LAZY)
    private List<Donation> sentDonations;
    ```

3. Don't forget about all the getters/setters

## 3. Repositories
Refer to the MVC demo repository interface and create one repo for each model. (In donation-donor example, you will need 2 repo)

## 4. Services
- Refer to the MVC demo service for CRUD. You could create 2 services for the corresponding model.
- You can also create 1 MainService that autowire both repo into the same service

## 5. Controllers & Views
1. Create Users
    - Refer to MVC demo for the create form & create process for User
2. Create Donation
    - As Donation requires the foreign key (User as the donor), a dropdown menu is required in this situation. 
    - To create the drop-down menu to pick the user, get all users from the service and put the userList in Model model
    - Make use of the forEach to display all the options

    ```html
		<form:select path="donor">
            <!-- TODO: forEach for the form:option -->
		</form:select>    
    ```
    ##### HINT: we need to use form:select with the correct PATH that corresponding to the getters/setters in Donation model

3. Donation Dashboard
   - Refer to MVC demo for dashboard
   - Note that ``` eachDonation.donor ``` is no longer a String, it is a User datatype 
   - Make use of the User datatype to display the username or email (whichever you want to display on the dashboard)

4. Edit Donation
   - Refer to MVC demo for Edit
   - If we do not wish to change the 1:n (donor), make sure use hidden input for the donor so that users cannot change it in the form 

5. Delete Donation
   - Refer to MVC demo for the delete button. 




