# TodoApp

A simple Todo List application and a practice project built with **Spring Boot**, **Thymeleaf**, and **MySQL**.

## Features

- Add new tasks
- View all tasks
- Mark tasks as completed/incomplete
- Delete tasks

## Technologies Used

- Java + Spring Boot
- Thymeleaf
- MySQL
- Gradle

## Setup Instructions

### 1. Clone the repo

git clone https://github.com/Sameer07x19/todoapp.git <br/>
cd todoapp

### 2. Set up MySQL

- Create a database (in MySQL Workbench or CLI):

```sql
CREATE DATABASE todo_app;
```

- Update your `application.properties` with DB details:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todo_app
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
```

### 3. Run the app

```bash
./gradlew spring-boot:run
```

Then open: [http://localhost:8080](http://localhost:8080)

---

## License

This project is open source and free to use.
