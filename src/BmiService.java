public class BmiService {

    public int index(int mass, double height) {
        int index = 28;
        System.out.println(mass / height / height);
        return index;
    }
}
