# JavaFile-I-O-NotesAPP


Java File I/O Notes App
🎯 Objective

Create a text-based Notes Manager in Java that allows users to add, view, update, and delete notes, with all data persisted permanently using FileWriter and FileReader/BufferedReader.

📄 Project Overview

The Java File I/O Notes App is a simple yet practical console-based application designed to help users create, manage, and store notes efficiently. The key purpose of this project is to demonstrate the use of Java File I/O operations for persistent data storage, allowing notes to be saved permanently in a text file (notes.txt).

This project provides a menu-driven interface, making it user-friendly even for beginners. Users can perform the following operations:

Add a new note: Enter and save notes to the file without overwriting existing data

View notes: Display all saved notes in a numbered list

Update a note: Modify the content of an existing note

Delete a note: Remove unwanted notes permanently

Exit: Close the application safely

Technical Highlights:

Uses FileWriter and BufferedWriter to write notes to a file in append mode, ensuring data persistence

Uses FileReader and BufferedReader to read notes line by line for display

Uses ArrayList to temporarily store notes in memory during update and delete operations

Exception handling ensures the program runs smoothly even if the file is missing or inaccessible

Learning Outcomes:

Understanding Java File I/O operations and data persistence

Creating a practical, real-world mini-project using console-based input/output

Managing a collection of data efficiently using ArrayList

Developing a menu-driven program that handles multiple functionalities

This project is an excellent introduction to Java programming concepts such as file handling, data persistence, exception handling, and user interaction, making it a solid foundation for building more advanced applications.

📦 Deliverables

Fully working Java program (NotesApp.java)

FileWriter / BufferedWriter to write notes to notes.txt

FileReader / BufferedReader to read notes from notes.txt

Menu-driven console interface

Data persistence: all notes remain saved even after closing the program

⚡ Features

➕ Add new notes

📖 View saved notes

✏️ Update existing notes

❌ Delete notes

🚪 Exit the application

📝 Mini Guide
Step 1: Create Project

Create a new Java project: JavaFileIONotesApp

Step 2: Create Class File

Create a Java class named NotesApp

Copy and paste the full code into NotesApp.java

Step 3: Compile and Run
javac NotesApp.java
java NotesApp

Step 4: Use the App

Add, View, Update, Delete notes via menu

Notes are saved permanently in notes.txt

🙏 Closing Note

Thanks for reviewing my project! This project demonstrates practical use of Java File I/O and is a strong foundation for more advanced applications.

Thank you for reviewing my project! 🙏
