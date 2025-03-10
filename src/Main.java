import java.lang.reflect.Array;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        books.add("Twilight");
        books.add("Twilight2");
        books.add("Breaking Dawn");
        books.add("Eclipse");

        Library seattleLibrary = new Library("206 Library St", 10, books);

        Library bellevueLibrary = new Library("100 Library St", 11, books);
        books.add("Hocus Pocus");
        System.out.println(bellevueLibrary.getBooks());

        ArrayList<String> wishList = new ArrayList();
        wishList.add("range rover");
        wishList.add("jannah for all of ummah");
        wishList.add("Hafiz");

        ArrayList<String> productsPurchased = new ArrayList();
        productsPurchased.add("ice");
        productsPurchased.add("cookies");
        productsPurchased.add("milk");

        User amazonUser = new User("Naima", "Y", "na@yahoo.com", productsPurchased, wishList);
        User amazonUser2 = new User("Naima", "Y", "na@yahoo.com", productsPurchased, wishList);
        wishList.add("Umrah");
        wishList.remove("range rover");
        productsPurchased.add("desk");
        productsPurchased.remove("cookies");
        System.out.println(amazonUser.getWishList());
        System.out.println(amazonUser.getProductsPurchased());
    }
}

