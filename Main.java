package mkr1;
public class Main {
    public static void main(String[] args) {
        // Створення кореневої папки
        Folder root = new Folder("Root");
        root.add(new File("File1.txt", 1200)); // Додаємо файл розміром 1200 байтів
        root.add(new File("File2.txt", 800)); // Додаємо файл розміром 800 байтів

        // Створення вкладеної папки
        Folder subFolder = new Folder("SubFolder");
        subFolder.add(new File("File3.txt", 500)); // Файл у вкладеній папці
        subFolder.add(new File("File4.txt", 1500)); // Інший файл у вкладеній папці

        // Створення ще однієї вкладеної папки
        Folder nestedFolder = new Folder("NestedFolder");
        nestedFolder.add(new File("File5.txt", 300)); // Файл у вкладеній підпапці

        // Додавання вкладеної підпапки до папки SubFolder
        subFolder.add(nestedFolder);

        // Додавання папки SubFolder до кореневої папки
        root.add(subFolder);

        // Вивід структури кореневої папки
        System.out.println("File Structure:");
        root.printStructure(""); // Використовуємо "" як початковий префікс

        // Розрахунок загального розміру кореневої папки
        System.out.println("\nTotal Size of Root Folder: " + root.getSize() + " bytes");

        // Перейменування файлу у вкладеній папці
        System.out.println("\nRenaming 'File3.txt' to 'RenamedFile3.txt'...");
        subFolder.children.get(0).rename("RenamedFile3.txt"); // Змінюємо назву першого файлу у списку

        // Вивід оновленої структури кореневої папки
        System.out.println("\nUpdated File Structure:");
        root.printStructure(""); // Знову виводимо структуру з оновленнями
    }
}
