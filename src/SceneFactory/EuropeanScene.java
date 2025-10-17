package SceneFactory;

import House.EuropeanHouseCreator;
import House.IHouse;
import Nature.EuropeanCreator;
import Nature.EuropeanNature;
import Nature.INature;
import People.EuropeanCharacter;
import People.EuropeanCharacterCreator;
import People.ICharacter;

public class EuropeanScene implements SceneFactory{
    @Override
    public IHouse CreateHouse() {
        return new EuropeanHouseCreator().BuildHouse();
    }

    @Override
    public INature CreateNature() {
        return new EuropeanCreator().Create();
    }

    @Override
    public ICharacter CreateCharacter() {
        return new EuropeanCharacterCreator().CreateCharacter();
    }

    @Override
    public String Draw() {
        return CreateHouse().Render() + "\r\n"
                + CreateNature().Render() +"\r\n"+
                CreateCharacter().Draw();
    }
}
