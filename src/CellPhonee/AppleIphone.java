package CellPhonee;

import java.util.Arrays;

public class AppleIphone extends CellPhone{

    // instances run first
    // then after the static blocks run
    // and finally the constructors last

    int lensQuantitiy = 0;
    int galleryCapacity = 0;
    int [] gallery ;

    // this count is used to add value to gallery array
    int count;
    public AppleIphone(String make, String model, int lensQuantitiy, int galleryCapacity) {

        super (make, model);

        this.lensQuantitiy = lensQuantitiy;
        this.galleryCapacity = galleryCapacity;
    }

    public void takePicture () {

        System.out.println("Picture is added to Gallery");

        if (gallery == null) {
            gallery = new int[galleryCapacity];
        }

        if (count <= galleryCapacity) {
            gallery[count] = 1;
            count++;
            usePhone(1);
        }
        else {
            System.out.println("Please Delete a Picture");
            System.out.println("The gallery is full");
        }

    }

    public void lookGallery(){
        System.out.println(Arrays.toString(gallery));
    }

    @Override
    public String toString() {
        return "Make: " + make + "\r\n"
                + "Model: " + model + "\r\n";
    }
}
