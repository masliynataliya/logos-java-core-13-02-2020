package homework.katerynakikidzhan.JC05.fourth;
// Створіть клас із двома перевантаженими конструкторами.
// Використовуючи ключове слово this, викличте один конструктор в іншому.
public class fourth {
    private int a;
    private int b;

    public fourth(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public fourth() {
        this(1, 2);
    }
}
