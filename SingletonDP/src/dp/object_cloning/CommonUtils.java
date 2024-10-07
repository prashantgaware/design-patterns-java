package dp.object_cloning;

public class CommonUtils  implements Cloneable {

    // Clone() method is protected, is not accessible outside the immediate inherited class.
    // this is why we are overriding the clone() method in this class.
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
