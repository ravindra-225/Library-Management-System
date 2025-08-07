# 📚 Library Management System (Java CLI)

This is a simple command-line **Library Management System** built using Java and Object-Oriented Programming (OOP) concepts. The system helps manage books and users, allowing functionalities like adding books/users, issuing books, and returning books.


## ✅ Objective

Develop a mini system to manage books and users using core Java OOP principles.

### 🛠️ Tools & Technologies Used:
- **Java**
- **Spring Tool Suite (STS)** – Used for development
- **VS Code** (optional)
- **Terminal** (for running CLI)

---

## 📁 Project Structure

com.example.library  
│  
├── main  
│ └── Main.java # CLI Application Entry Point  
│  
├── models  
│ ├── Book.java # Book attributes & logic  
│ └── User.java # User attributes & logic  
│  
└── service  
└── Library.java # Core functionality (CRUD, issue/return, validation)  


## ✨ Features Implemented

| Feature                        | Status  | Description |
|-------------------------------|---------|-------------|
| ➕ Add Book                    | ✅       | Input and store new books with validation |
| ➕ Add User                    | ✅       | Input and store new users with unique ID and phone |
| 📃 View All Books             | ✅       | Lists all books with their details |
| 👥 View All Users             | ✅       | Lists all users, including borrowed book info |
| 📚 Issue Book                 | ✅       | Issue available book to a user |
| 🔄 Return Book                | ✅       | Return book from user |
| ❌ Prevent Duplicate IDs      | ✅       | Checks for unique book ID, user ID, and phone |
| 🖥️ Command Line Interface     | ✅       | Simple menu-based CLI loop |

---

## 📌 Sample Book Attributes

- Book ID (int)
- Title (String)
- Author (String)
- Language (String)
- Category (String)
- Year (int)
- Availability (boolean)

## 📌 Sample User Attributes

- User ID (int)
- Name (String)
- Phone Number (long)
- Borrowed Book (Book object)


## 🚀 How to Run

1. Open the project in **Spring Tool Suite** or any IDE that supports Java.
2. Run the `Main.java` class.
3. Use the menu in terminal to interact with the system.


## 📝 Example Output

Library Management System

Display all books

Display all users

Add a book

Add a user

Issue a book

Return a book

Exit
Choose an option:

## 📌 Notes

- Currently, data is **not persistent** — all entries are in-memory and reset on restart.
- Extendable to support features like editing, deleting, search, or saving to file/DB.  

## 📸 Screenshots

<img width="698" height="337" alt="Screenshot 2025-08-07 161224" src="https://github.com/user-attachments/assets/29219c11-0a60-42cd-8edb-c1dc4b207b51" />

<img width="1604" height="838" alt="Screenshot 2025-08-07 161309" src="https://github.com/user-attachments/assets/105592b7-d78a-4e1f-b68a-09d44b0ee52c" />

<img width="1014" height="474" alt="Screenshot 2025-08-07 161530" src="https://github.com/user-attachments/assets/03912a0a-c849-4bcf-beae-c35572b473a2" />

<img width="790" height="454" alt="Screenshot 2025-08-07 161607" src="https://github.com/user-attachments/assets/dd5d9408-c3ba-4417-bdca-f59364a005bc" />

<img width="1025" height="861" alt="Screenshot 2025-08-07 161930" src="https://github.com/user-attachments/assets/f2f76fbe-65d5-462b-a58b-da1b7e3e1fdc" />

<img width="839" height="584" alt="Screenshot 2025-08-07 162025" src="https://github.com/user-attachments/assets/1d4992fa-35f7-46e5-812e-245928fb8d3c" />

## 👨‍💻 Author

Developed by Raveendra kumar as part of the Java OOP mini-project task.
