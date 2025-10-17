package House;

public class AfricanHouseCreator extends HouseCreator
{
    @Override
    public IHouse BuildHouse() {
        return new AfricanHouse();
    }
}
