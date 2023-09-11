import cryptLogic.Crypter;
import cryptLogic.Decrypter;

public class Facade {


    private Crypter crypter;
    private Decrypter decrypter;

    public Facade(Crypter crypter) {
        this.crypter = crypter;
    }

    public Facade(Decrypter decrypter) {
        this.decrypter = decrypter;
    }

    public String crypt() {
        return crypter.crypt();
    }

    public String decrypt() {
        return decrypter.decrypt();
    }
}
