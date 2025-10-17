package Nature;

public class AsianCreator extends NatureCreator{
    @Override
    public INature Create() {
        return new AsianNature();
    }
}
