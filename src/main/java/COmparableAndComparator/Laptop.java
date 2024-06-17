package COmparableAndComparator;

public class Laptop implements Comparable<Laptop>{
    public String brand;
    public int price;
    public Laptop(String brand,int price){
        this.brand=brand;
        this.price=price;
    }


    @Override
    public int compareTo(Laptop lap) {
        if(this.price > lap.price){  //here this.price is referring to the object which ahd called the compareTo method.
            return 1;
        }else
            return -1;
    }
}
