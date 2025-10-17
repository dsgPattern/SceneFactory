package People;

public class EuropeanCharacterCreator
        extends CharacterCreator {
    @Override
    public ICharacter CreateCharacter() {
        return new EuropeanCharacter();
    }
}
