package homework.ihorpayensky.homeworks.homework14.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Controller implements CommodityControlImpl{

    private static Controller controller;
    private List<Commodity> commodityList;

    private Controller() {
        this.commodityList = new ArrayList<>();
    }

    public static Controller getController() {
        if (controller == null)
            return new Controller();
        return controller;
    }

    public boolean isEmpty() {
        if (this.commodityList.size() < 0)  // it`s not true (((
            return true;
        return false;
    }

    public boolean indexIsFound(int id) {
        if (id >= 0 && id < commodityList.size())
            return true;
        return false;
    }

    @Override
    public void getInfo() {
        System.out.println("1 - add commodity");
        System.out.println("2 - remove commodity");
        System.out.println("3 - update commodity ");
        System.out.println("4 - sort by name");
        System.out.println("5 - sort by weight");
        System.out.println("6 - sort by width");
        System.out.println("7 - sort by height");
        System.out.println("8 - get commodity by id");
        System.out.println("9 - show all commodity");
        System.out.println("11 - Close session...");
    }

    @Override
    public void addCommodity(Commodity commodity) {
        boolean isNotExist = true;
        for (Commodity c: commodityList) {
            if (c.getName().equalsIgnoreCase(commodity.getName())) {
                System.out.println("That name is already exist...");
                isNotExist = false;
            }
        }
        if (isNotExist) {
            commodityList.add(commodity);
            System.out.println("Adding new commodity: " + commodity.toString());
        }
    }

    @Override
    public void removeCommodity(int commodity) {
        if (indexIsFound(commodity)) {
            commodityList.remove(commodity);
            System.out.println("Element remove successful...");
        }
        else System.out.println("Commodity is not found...");
    }

    @Override
    public void updateCommodity(int id, Commodity commodity) {
        Commodity temp = commodityList.get(id);
        temp.setName(commodity.getName());
        temp.setWeight(commodity.getWeight());
        temp.setWidth(commodity.getWidth());
        temp.setHeight(commodity.getHeight());
        System.out.println("Updating successful...");
    }

    @Override
    public void sortByName() {
        commodityList.sort(Commodity::compareTo);
        int i = 1;
        for (Commodity c: commodityList) {
            System.out.println(i + "\t| " + c.toString());
            i++;
        }
    }

    @Override
    public void sortByWeight() {
        commodityList.sort(new WeightComparator());
        int i = 1;
        for (Commodity c: commodityList) {
            System.out.println(i + "\t| " + c.toString());
            i++;
        }
    }

    @Override
    public void sortByWidth() {
        commodityList.sort(new WidthComparator());
        int i = 1;
        for (Commodity c: commodityList) {
            System.out.println(i + "\t| " + c.toString());
            i++;
        }
    }

    @Override
    public void sortByHeight() {
        commodityList.sort(new HeightComparator());
        int i = 1;
        for (Commodity c: commodityList) {
            System.out.println(i + "\t| " + c.toString());
            i++;
        }
    }

    @Override
    public void getCommodityById(int id) {
        if (indexIsFound(id)) {
            Commodity temp = commodityList.get(id);
            System.out.println(temp.toString());
        } else {
            System.out.println("Element with id '" + id + "' is not found");
        }
    }

    @Override
    public void showListOfCommodities() {
        if (!isEmpty())
            for (Commodity c: commodityList) {
                System.out.println(c.toString());
            }
        else System.out.println("List is empty...");
    }

    @Override
    public void showForeachIdElements() {
        if (!isEmpty()) {
            System.out.println("Id\t|\tElement");
            for (Commodity c: commodityList) {
                System.out.println(commodityList.indexOf(c) + "\t|\t" + c.toString());
            }
        } else {
            System.out.println("List of commodities is empty... nothing to remove...");
        }
    }

    public static class Input {
        public static String inputName(Scanner scanner) {
            System.out.println("Enter name (min 4 chars)");
            System.out.print("Name >> ");
            String name = scanner.nextLine();
            return toUpFirstChar(name);
        }

        public static int inputWidth(Scanner scanner) {
            System.out.println("Enter width (only integer)");
            try {
                System.out.print("Width >> ");
                String widthStr = scanner.nextLine();
                int width = Integer.parseInt(widthStr);
                if(width < 0) width=width*(-1);
                return width;
            } catch (Exception e) {
                System.out.println("Input is not correctly!... " + e.getMessage());
                return 0;
            }
        }

        public static int inputWeight(Scanner scanner) {
            try {
                System.out.println("Enter weight (only integer)");
                System.out.print("Weight >> ");
                String weightStr = scanner.nextLine();
                int weight = Integer.parseInt(weightStr);
                return weight < 0 ? weight*(-1) : weight;
            } catch (Exception e) {
                System.out.println("Input is not correctly!... " + e.getMessage());
                return 0;
            }
        }

        public static int inputHeight(Scanner scanner) {
            try {
                System.out.println("Enter height (only integer)");
                System.out.print("Height >> ");
                String heightStr = scanner.nextLine();
                int height = Integer.parseInt(heightStr);
                return height < 0 ? height*(-1) : height;
            } catch (Exception e) {
                System.out.println("Input is not correctly!... " + e.getMessage());
                return 0;
            }
        }

        public static int inputId(Scanner scanner) {
            try {
                System.out.print("Enter id >> ");
                String idStr = scanner.nextLine();
                return Integer.parseInt(idStr);
            } catch (Exception e) {
                System.out.println("Input is not correctly!... " + e.getMessage());
                return 0;
            }
        }

        private static String toUpFirstChar(String name) {
            return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        }
    }
}
