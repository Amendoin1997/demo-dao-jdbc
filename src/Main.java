import Entities.Department;
import Entities.Seller;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Department obj = new Department(1, "books");

        Seller seller = new Seller(21, "bob", "bob@gmail.com", new Date(), 3000.00, obj);

        System.out.println(seller);
        System.out.println(obj);
    }


}