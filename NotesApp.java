package notesapp;

import java.io.*;
import java.util.*;

public class NotesApp {
    private static final String FILE_NAME = "notes.txt";
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== Notes App =====");
            System.out.println("1. Add Note");
            System.out.println("2. View Notes");
            System.out.println("3. Update Note");
            System.out.println("4. Delete Note");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: addNote(); break;
                case 2: viewNotes(); break;
                case 3: updateNote(); break;
                case 4: deleteNote(); break;
                case 5: 
                    System.out.println("Thanks for reviewing my project! 🙏");
                    return;
                default: System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // Add a new note using FileWriter
    private static void addNote() {
        System.out.print("Enter your note: ");
        String note = sc.nextLine();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            bw.write(note);
            bw.newLine();
            System.out.println("✅ Note added successfully!");
        } catch (IOException e) {
            System.out.println("Error while adding note: " + e.getMessage());
        }
    }

    // View all notes using FileReader / BufferedReader
    private static void viewNotes() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            int count = 1;
            System.out.println("\n--- Saved Notes ---");
            while ((line = br.readLine()) != null) {
                System.out.println(count + ". " + line);
                count++;
            }
            if (count == 1) System.out.println("No notes found.");
        } catch (IOException e) {
            System.out.println("Error while reading notes: " + e.getMessage());
        }
    }

    // Update an existing note
    private static void updateNote() {
        List<String> notes = readNotes();
        if (notes.isEmpty()) {
            System.out.println("No notes to update.");
            return;
        }

        viewNotes();
        System.out.print("Enter note number to update: ");
        int noteNo = sc.nextInt();
        sc.nextLine();

        if (noteNo < 1 || noteNo > notes.size()) {
            System.out.println("Invalid note number.");
            return;
        }

        System.out.print("Enter new content: ");
        String newNote = sc.nextLine();
        notes.set(noteNo - 1, newNote);
        writeNotes(notes);
        System.out.println("✅ Note updated successfully!");
    }

    // Delete a note
    private static void deleteNote() {
        List<String> notes = readNotes();
        if (notes.isEmpty()) {
            System.out.println("No notes to delete.");
            return;
        }

        viewNotes();
        System.out.print("Enter note number to delete: ");
        int noteNo = sc.nextInt();
        sc.nextLine();

        if (noteNo < 1 || noteNo > notes.size()) {
            System.out.println("Invalid note number.");
            return;
        }

        notes.remove(noteNo - 1);
        writeNotes(notes);
        System.out.println("🗑 Note deleted successfully!");
    }

    // Helper method to read all notes from file into a list
    private static List<String> readNotes() {
        List<String> notes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                notes.add(line);
            }
        } catch (IOException e) {
            // file may not exist initially, ignore
        }
        return notes;
    }

    // Helper method to write all notes from list back to file
    private static void writeNotes(List<String> notes) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (String note : notes) {
                bw.write(note);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error while saving notes: " + e.getMessage());
        }
    }
}