package mkr1;

// Абстрактний клас для представлення загального типу об'єктів: файлів та папок
abstract class FileObject {
    protected String name; // Назва файлу або папки

    // Конструктор для ініціалізації назви
    public FileObject(String name) {
        this.name = name;
    }

    // Метод для отримання назви
    public String getName() {
        return name;
    }

    // Метод для перейменування файлу або папки
    public void rename(String newName) {
        this.name = newName;
    }

    // Абстрактний метод для отримання розміру (для файлу це розмір у байтах, для папки — сума розмірів вмісту)
    public abstract int getSize();

    // Абстрактний метод для виводу структури файлів/папок (із вкладеністю)
    public abstract void printStructure(String prefix);
}
