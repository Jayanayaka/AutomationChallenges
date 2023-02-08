package functions;

import pages.advertisementPage;

import java.util.ArrayList;

import static functions.Car.carPage;

public class advertisement {

    public static advertisementPage advertisementPage   = new advertisementPage();

    public static ArrayList getActualCarInfo(){

        ArrayList<String> actualDataArray = new ArrayList<String>();

        actualDataArray.add(advertisementPage.getManufacture());
        actualDataArray.add(advertisementPage.getModel());
        actualDataArray.add(advertisementPage.getTransmission());
        actualDataArray.add(advertisementPage.getManufactureYear());
        return actualDataArray;

    }
    public static ArrayList getExpectedCarInfo(){

        ArrayList<String> expDataArray = new ArrayList<String>();

        expDataArray.add(carPage.getManufacturer());
        expDataArray.add(carPage.getModel());
        expDataArray.add(carPage.getTransmission());
        expDataArray.add(carPage.getManufactureYear());
        return expDataArray;

    }
    public static boolean compareExpectedAndActual() {

        boolean isTrue;

        String s1 = "";
        String s2 = "";

        ArrayList<String> arrayExp = getExpectedCarInfo();
        ArrayList<String> arrayAct = getActualCarInfo();

        for (int i = 0; i < arrayExp.size(); i++) {
            s1 = s1 + arrayExp.get(i);

        }

        for (int i = 0; i < arrayAct.size(); i++) {
            s2 = s2 + arrayAct.get(i);
        }
        if (s1.equals(s2)) {
            System.out.println("both the array have same elements.");
            System.out.println(s1);
            System.out.println(s2);
            isTrue = true;
        } else {
            System.out.println("both the array does not have the same elements.");
            System.out.println(s1);
            System.out.println(s2);
            isTrue = false;
        }

        return isTrue;
    }
}
