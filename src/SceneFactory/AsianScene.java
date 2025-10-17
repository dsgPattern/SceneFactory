package SceneFactory;

import House.AsianHouseCreator;
import House.IHouse;
import Nature.EuropeanCreator;
import Nature.INature;
import Nature.NatureCreator;
import People.AsianCharacter;
import People.AsianCharacterCreator;
import People.ICharacter;

public class AsianScene implements SceneFactory{
    @Override
    public IHouse CreateHouse() {
        return new AsianHouseCreator().BuildHouse();
    }

    @Override
    public INature CreateNature() {
        return new EuropeanCreator().Create();
    }

    @Override
    public ICharacter CreateCharacter() {
        return new AsianCharacterCreator().CreateCharacter();
    }

    @Override
    public String Draw() {
        return "Drawing asian scene with asian houses, nature and characters";
    }
}
