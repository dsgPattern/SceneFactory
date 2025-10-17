import House.AfricanHouseCreator;
import Nature.AsianCreator;
import People.AsianCharacterCreator;
import People.EuropeanCharacterCreator;
import SceneFactory.EuropeanScene;
import SceneFactory.SceneFactory;
import SceneFactory.AsianScene;

public class Main {
    public static void main(String[] args) {
        var asianFactory = new AsianCharacterCreator();
        var europeanFactory = new EuropeanCharacterCreator();

        System.out.println(europeanFactory.CreateCharacter().Draw());
        System.out.println(asianFactory.CreateCharacter().Draw());

        var asianNature = new AsianCreator();
        System.out.println(asianNature.Create().Render());

        var africanHouse = new AfricanHouseCreator();
        System.out.println(africanHouse.BuildHouse().Render());


        RenderScene(new EuropeanScene());
        RenderScene(new AsianScene());
    }


    public static void RenderScene(SceneFactory sceneFactory) {
        System.out.println(sceneFactory.Draw());
    }
}