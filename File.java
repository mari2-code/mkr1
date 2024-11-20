package mkr1;

// Клас для представлення файлу
class File extends FileObject {
    private int size; // Розмір файлу в байтах

    // Конструктор, який ініціалізує назву та розмір файлу
    public File(String name, int size) {
        super(name); // Виклик конструктора базового класу
        this.size = size;
    }

    // Метод для отримання розміру файлу
    @Override
    public int getSize() {
        return size;
    }

    // Метод для виводу інформації про файл (з префіксом для вкладеності)
    @Override
    public void printStructure(String prefix) {
        System.out.println(prefix + "📄 " + name + " (" + size + " bytes)");
    }
}
