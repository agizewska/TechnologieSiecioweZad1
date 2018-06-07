package pwr.businesslogic;

import pwr.model.Product;

import java.util.List;

public class Calculator {

    public static double calculateSum(List<Product> products){
        double sum = 0;

            for (int i = 0; i < products.size(); i++) {
                sum += products.get(i).getPrice();
        }

        return sum;
    }

    public static double calculateAVG(List <Product> products){
        double avg = 0;
        if (!products.isEmpty()){
            avg = calculateSum(products)/products.size();
        }
        return avg;
    }
}
