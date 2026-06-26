# 📚 Library Management System

![Library Management System](https://img.shields.io/badge/Project-Library%20Management%20System-gold?style=for-the-badge)
![HTML](https://img.shields.io/badge/HTML-5-orange?style=flat-square&logo=html5)
![CSS](https://img.shields.io/badge/CSS-3-blue?style=flat-square&logo=css3)
![JavaScript](https://img.shields.io/badge/JavaScript-ES6-yellow?style=flat-square&logo=javascript)

> A fully functional Library Management System built with HTML, CSS, and JavaScript. Manage books, members, issue/return tracking, and fine calculations — all in one place.

---

## 📸 Screenshots

| Home Page | Book List | Issue Book |
|-----------|-----------|------------|

---

## ✨ Features

- 📖 **Add / Remove Books** — Easily manage your book collection
- 🔍 **Search Books** — Find any book instantly by title or author
- 🎓 **Member Login** — Student and member management
- 📤 **Issue Books** — Issue books to members with due dates
- 📥 **Return Books** — Track returned books easily
- 💰 **Fine Calculation** — Auto-calculate fines for late returns
- 💾 **Local Storage** — Data saved in browser, no backend needed

---

## 🛠️ Tech Stack

| Technology | Purpose |
|------------|---------|
| **HTML5** | Page Structure |
| **CSS3** | Styling & Animations |
| **JavaScript (ES6)** | Logic & Interactivity |
| **Local Storage** | Data Persistence |

---

## 📁 Project Structure

```
library-management-system/
│
├── index.html          → Home Page
├── books.html          → Book List Page
├── members.html        → Member Management Page
├── issue.html          → Issue / Return Books Page
│
├── css/
│   └── style.css       → All Styles
│
├── js/
│   ├── main.js         → Main JavaScript Logic
│   ├── books.js        → Book Management Functions
│   ├── members.js      → Member Management Functions
│   └── fines.js        → Fine Calculation Logic
│
├── screenshots/
│   ├── home.png
│   ├── books.png
│   └── issue.png
│
└── README.md           → This File
```

---

## 🚀 Getting Started

### Step 1 — Clone the Repository

```bash
git clone https://github.com/your-username/library-management-system.git
```

### Step 2 — Open the Project

```bash
cd library-management-system
```

### Step 3 — Run It

Simply open `index.html` in your browser — no installation needed!

```bash
# On Windows
start index.html

# On Mac
open index.html
```

---

## 💡 How It Works

### Adding a Book
1. Go to the **Books** page
2. Fill in Book Title, Author, and Category
3. Click **Add Book** — it's saved instantly!

### Issuing a Book
1. Go to **Issue Book** page
2. Enter Member ID and Book ID
3. Set the due date
4. Click **Issue** — done!

### Fine Calculation
- Fine is calculated automatically when a book is returned late
- Default fine: **₹2 per day** after due date

---

## 📊 JavaScript Concepts Used

This project covers these important JavaScript concepts:

| Concept | Where Used |
|---------|-----------|
| Variables & Data Types | Book & Member data |
| Arrays & Objects | Storing book lists |
| Functions | Add, Remove, Search logic |
| DOM Manipulation | Updating the UI |
| Events | Button clicks, Form submit |
| Local Storage | Saving data in browser |
| Date Object | Due date & fine calculation |
| Array Methods (filter, map, find) | Search & display books |

---

## 🎯 What I Learned Building This

- How to structure a multi-page website
- How to use JavaScript to manipulate HTML dynamically
- How to store and retrieve data using Local Storage
- How to calculate dates and time differences in JavaScript
- How to build a complete real-world project from scratch

---

## 🔮 Future Improvements

- [ ] Add backend with Node.js & Express
- [ ] Connect to a real database (MongoDB or MySQL)
- [ ] Add user authentication (Login/Signup)
- [ ] Email notifications for due dates
- [ ] Export reports as PDF
- [ ] Mobile app version

---

## 🤝 Contributing

Contributions are welcome! Here's how:

1. Fork this repository
2. Create a new branch: `git checkout -b feature/your-feature`
3. Make your changes and commit: `git commit -m "Add your feature"`
4. Push to the branch: `git push origin feature/your-feature`
5. Open a Pull Request

---

## 📄 License

This project is licensed under the **MIT License** — feel free to use it for learning and personal projects.

---
