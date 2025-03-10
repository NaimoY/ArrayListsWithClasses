import java.util.ArrayList;

public class User {
    String firstName;

    String lastName;

    String email;

    ArrayList<String> productsPurchased;

    ArrayList<String> wishList;

    public User(String firstName, String lastName, String email, ArrayList<String> productsPurchased, ArrayList<String> wishList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.productsPurchased = productsPurchased;
        this.wishList = wishList;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<String> getProductsPurchased() {
        return productsPurchased;
    }

    public void setProductsPurchased(ArrayList<String> productsPurchased) {
        this.productsPurchased = productsPurchased;
    }

    public ArrayList<String> getWishList() {
        return wishList;
    }

    public void setWishList(ArrayList<String> wishList) {
        this.wishList = wishList;
    }

    public void addToProductsPurchased(String name) {
        productsPurchased.add(name);
    }

    public void removeProductsPurchased(String name) {
        productsPurchased.remove(name);
    }

    public void addToWishList(String name) {
        wishList.add(name);
    }

    public void removeFromWishList(String name) {
        wishList.remove(name);
    }

}

