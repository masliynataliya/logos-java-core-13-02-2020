package homework.katerynakikidzhan.JC04.additional;
//- Створити батьківський клас ChessItem з полями - колір, координата х, координата у, кількість(подібних фігур на дошці)
//- Створити контруктор (або кілька)
//- Створити геттери та сеттери для цих полів
//- Створити метод move()
//- Створити 6 класів нащадків для кожного типу шахової фігури
//- Наслідувати їх від ChessItem
//- Перевизначити метод move() -- так щоб він друкував в консоль фразу з описом, як рухається та чи інша фігура, і з описом самої фігури,
//наприклад "One of 6 white pawns moves forward for 1 step",
//де 6 - значення змінної "кількість(подібних фігур на дошці)",
//white - колір фігури
//Пам'ятайте, що ці поля наслідуються від батьківського класу -- тому не потрібно оголошувати їх в дочірньому класі.
//- Створити клас Application
//- Створити по об'єкту для кожного з дочірніх класів
//- Викликати метод move() для кожної з них.
public class ChessPiece {

    private Integer locationX;
    private Integer locationY;
    private Integer pieceQuantity;
    private String pieceName;
    private String colour;

    public ChessPiece(Integer locationX,
                      Integer locationY,
                      Integer pieceQuantity,
                      String pieceName,
                      String colour) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.pieceQuantity = pieceQuantity;
        this.pieceName = pieceName;
        this.colour = colour;
    }

    public ChessPiece() {
        this.locationX = null;
        this.locationY = null;
        this.pieceQuantity = null;
        this.pieceName = null;
        this.colour = null;
    }

    public Integer getLocationX() {
        return locationX;
    }

    public void setLocationX(Integer locationX) {
        this.locationX = locationX;
    }

    public Integer getLocationY() {
        return locationY;
    }

    public void setLocationY(Integer locationY) {
        this.locationY = locationY;
    }

    public Integer getPieceQuantity() {
        return pieceQuantity;
    }

    public void setPieceQuantity(Integer pieceQuantity) {
        this.pieceQuantity = pieceQuantity;
    }

    public String getPieceName() {
        return pieceName;
    }

    public void setPieceName(String pieceName) {
        this.pieceName = pieceName;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void move() {
        System.out.println("One of " + getPieceQuantity() + " " + getColour() + " " + getPieceName() + "s moves " + moveDescription());
    }

    public String moveDescription() {
        return "";
    }
}
