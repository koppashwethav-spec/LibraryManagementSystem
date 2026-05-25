
import java.io.*;
import java.util.ArrayList;

public class FileHandler {

    private static final String FILE_NAME = "books.txt";

    // SAVE ALL BOOKS TO FILE
    public static void saveBooks(ArrayList<Book> books) {

        try {
            FileWriter fw = new FileWriter(FILE_NAME);

            for (Book b : books) {
                fw.write(b.id + "," + b.title + "," + b.author + "," + b.isIssued + "\n");
            }

            fw.close();

        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }

    // LOAD BOOKS FROM FILE
    public static ArrayList<Book> loadBooks() {

        ArrayList<Book> books = new ArrayList<>();

        try {
            File file = new File(FILE_NAME);

            if (!file.exists()) {
                return books;
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                Book book = new Book(
                        Integer.parseInt(data[0]),
                        data[1],
                        data[2]
                );

                book.isIssued = Boolean.parseBoolean(data[3]);

                books.add(book);
            }

            br.close();

        } catch (Exception e) {
            System.out.println("Error loading file.");
        }

        return books;
    }
}