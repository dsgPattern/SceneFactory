package SceneFactory;

import House.IHouse;
import Nature.INature;
import People.ICharacter;

public interface SceneFactory {
    IHouse CreateHouse();
    INature CreateNature();
    ICharacter CreateCharacter();
    String Draw();
}
