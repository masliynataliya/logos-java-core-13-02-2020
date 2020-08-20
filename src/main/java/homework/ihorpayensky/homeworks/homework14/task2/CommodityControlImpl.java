package homework.ihorpayensky.homeworks.homework14.task2;

public interface CommodityControlImpl {

    void getInfo();                                 // for information
    void addCommodity(Commodity commodity);         // 1
    void removeCommodity(int commodity);            // 2
    void updateCommodity(int id, Commodity commodity);// 3
    void sortByName();                              // 4
    void sortByWeight();                            // 5
    void sortByWidth();                             // 6
    void sortByHeight();                            // 7
    void getCommodityById(int id);                  // 8
    void showListOfCommodities();                   // 9
                                                    // 11 exit

    void showForeachIdElements();

}
