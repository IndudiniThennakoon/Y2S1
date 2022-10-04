public class Shape {
    public void show(){

    }

    // we can not define area for a shape because there is no any function to
    // to calculate the area of a class. So in here getArea(
    // method does not have a return type.

    // In java if we do nit find a particular implementation
    //  but still we want to keep that in the super class
    //  then the best option is defined as abstracts.

    // Abstract methods do not have a method body. Not even
    // opening or ending curly brackets.

    abstract public int getArea(); // if we want we can add parameters also


}
