package mkr1;

import java.util.ArrayList;
import java.util.List;

// Клас для представлення папки, яка може містити файли та інші папки
class Folder extends FileObject {
    private List<FileObject> children; // Список файлів та папок у цій папці

    // Конструктор, який ініціалізує назву папки
    public Folder(String name) {
        super(name); // Виклик конструктора базового класу
        this.children = new ArrayList<>(); // Ініціалізація списку дітей
    }

    // Метод для додавання файлу або папки до поточної папки
    public void add(FileObject fileObject) {
        children.add(fileObject);
    }

    // Метод для видалення файлу або папки з поточної папки
    public void remove(FileObject fileObject) {
        children.remove(fileObject);
    }

    // Метод для розрахунку загального розміру папки (включаючи всі вкладені файли та папки)
    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileObject child : children) {
            totalSize += child.getSize(); // Додаємо розмір кожного об'єкта
        }
        return totalSize;
    }

    // Метод для виводу структури папки та її вмісту (рекурсивно для вкладеності)
    @Override
    public void printStructure(String prefix) {
        System.out.println(prefix + "📁 " + name); // Вивід назви папки
        for (FileObject child : children) {
            child.printStructure(prefix + "  "); // Рекурсивний виклик для вкладених об'єктів
        }
    }
}
