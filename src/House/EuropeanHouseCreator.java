package House;

public class EuropeanHouseCreator extends HouseCreator{
    @Override
    public IHouse BuildHouse() {
        return new EuropeanHouse();
    }
}
