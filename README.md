# 🎓 Basic Student Entry (Servlet + JSP)

## 📌 Overview

This project is a simple **Student Record Entry** built using Java Servlets, JSP, and JDBC.
It demonstrates how to perform basic **CRUD operations** and follow the **MVC (Model-View-Controller)** architecture in a web application.

---

## 🛠️ Technologies Used

* Java
* Servlets
* JSP (JSTL & Expression Language)
* JDBC
* MySQL
* Apache Tomcat

---

## 🧠 Concepts Covered

* Servlet Lifecycle (`doGet`, `doPost`)
* Request & Response Handling
* MVC Architecture
* JDBC Connectivity
* PreparedStatement vs Statement
* JSP with JSTL (`<c:forEach>`, `<c:out>`)
* RequestDispatcher (Forwarding)
* Form Handling

---

## 💻 Features

* ➕ Add new student (ID, Name, Marks)
* 📋 View all students
* 🔄 Automatic refresh after adding student
* 🧾 Dynamic data rendering using JSP & JSTL

---

## 🗂️ Project Structure

```
web_tut/
│
├── Student.java           (Model)
├── StudentService.java    (DAO / Service Layer)
├── StudentServlet.java    (Controller)
│
WebContent/
│
├── index.jsp              (Home Page)
├── addstudent.jsp         (Add Student Form)
├── displaystudents.jsp    (View Students)
```

---

## ⚙️ How It Works (Flow)

1. User submits form in `addstudent.jsp`
2. Request goes to `StudentServlet` (`doPost`)
3. Data is sent to `StudentService`
4. Data is stored in MySQL using JDBC
5. Redirect to `StudentServlet` (`doGet`)
6. Data is fetched and forwarded to `displaystudents.jsp`
7. Students displayed using JSTL

---

## 🗄️ Database Setup

### Create Database

```sql
CREATE DATABASE Student;
USE Student;
```

### Create Table

```sql
CREATE TABLE student (
    id INT PRIMARY KEY,
    StudentName VARCHAR(50),
    Marks INT
);
```

---

## ▶️ How to Run

1. Clone the repository
2. Import into Eclipse / IDE
3. Configure Apache Tomcat Server
4. Update DB credentials in `StudentService.java`
5. Run the project
6. Open browser:

```
http://localhost:8080/your-project-name/
```

---

## 📸 Screenshots

(Add screenshots here)

---

## 🚀 Future Improvements

* Update & Delete functionality
* Input validation
* Better UI using CSS
* Login authentication
* Convert to Spring Boot

---

## 🙌 Author

**Bharath**
