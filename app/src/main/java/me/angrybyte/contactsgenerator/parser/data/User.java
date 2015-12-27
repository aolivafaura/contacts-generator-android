package me.angrybyte.contactsgenerator.parser.data;

import android.graphics.Bitmap;

/**
 * A data class holding all the relevant info about the user needed by our app.
 */
public class User {
    private static final String NEW_LINE = "\n";
    private String gender;
    private String title;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String imageUrl;
    private String thumbImageUrl;
    private Bitmap image;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getThumbImageUrl() {
        return thumbImageUrl;
    }

    public void setThumbImageUrl(String thumbImageUrl) {
        this.thumbImageUrl = thumbImageUrl;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Gender: " + getGender() + NEW_LINE +
                "Title: " + getTitle() + NEW_LINE +
                "First name: " + getFirstName() + NEW_LINE +
                "Last name: " + getLastName() + NEW_LINE +
                "Email: " + getEmail() + NEW_LINE +
                "Phone: " + getPhone(); // etc.
    }
}
