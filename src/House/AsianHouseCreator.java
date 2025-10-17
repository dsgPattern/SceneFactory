package House;

public class AsianHouseCreator extends HouseCreator{
    @Override
    public IHouse BuildHouse() {
        return new AsianHouse();
    }
}
