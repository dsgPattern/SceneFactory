package People;

public class AsianCharacterCreator
        extends CharacterCreator{
    @Override
    public ICharacter CreateCharacter() {
        return new AsianCharacter();
    }
}
