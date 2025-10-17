package Nature;

public class EuropeanCreator extends NatureCreator{
    @Override
    public INature Create() {
        return new EuropeanNature();
    }
}
