package homework.denysyerchenko.car;

public class CarBody {

    private String carBodyType;
    private int length;
    private int width;
    private int height;

    public String getCarBodyType() {
        return carBodyType;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setCarBodyType(String newCarBodyType) {
        carBodyType = newCarBodyType;
    }

    public void setLength(int newLength) {
        length = newLength;
    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }

    public void setHeight(int newHeight) {
        height = newHeight;
    }

    public CarBody(String initCarBodyType, int initLength, int initWidth, int initHeight) {
        carBodyType = initCarBodyType;
        length = initLength;
        width = initWidth;
        height = initHeight;
    }

    @Override
    public String toString() {
        return "" + carBodyType + ", length = " + length + " inches " + ", width = " + width + " inches" + ", height = " + height + " inches " + "";
    }
}
