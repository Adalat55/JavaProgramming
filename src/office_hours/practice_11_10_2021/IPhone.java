package office_hours.practice_11_10_2021;

public final class IPhone extends Phone implements AppleApps  {


    public IPhone( String model, double price, int size) {
        super("IPhone", model, price, size);
    }

    @Override
    public void facetime() {
        System.out.println("IPhone using facetime");
    }

    @Override
    public boolean download() {
        System.out.println("Downloading from: "+APP_STORE_NAME);
        return true;
    }

    @Override
    public void calling() {
        System.out.println("Iphone is calling");

    }

    @Override
    public void texting() {

        System.out.println("Texting on iMessage");

    }
}
