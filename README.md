# cibus-food-app-spring-boot

Backend for Cibus Food App

## Log

### October 29, 2025

Removed Ingredient class (replaced by FoodRecipe class), edited other classes

### October 28, 2025

Planned out the structure some more, made changes to existing files and created new files

For instance, made models for the planned out tables, and decided to make another table for images

![sql2](screenshots/sqlschema2.png)

### October 27, 2025

Planned out the structure of the database and removed unnecessary fields

![sqlschema](screenshots/sqlschema.png)

### October 25, 2025

Created tables in PGAdmin. Added more attributes to Food model to allow for brand and product information.

Create the migration table for food, and now GET foods and POST food routes work.

GET when there was nothing in food table

![GET](screenshots/postmanGET.png)

POST first food

![POST](screenshots/postmanPOST.png)

GET after first food was inserted

![GET After POST](screenshots/postmanGETafterPOST.png)

### October 24, 2025

Added Food, Ingredient and Recipe models. Restructured.

### October 21st, 2025

Connected PostgreSQL to backend, logging works now

![First proper log](screenshots/log.png)

### October 20, 2025

Created backend
