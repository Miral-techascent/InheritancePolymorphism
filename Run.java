package InheritancePolymorphism;

public class Run {

    public static void main(String[] args) {
        ElectronicDevice MyDevice = new ElectronicDevice();
        Mobile M = new Mobile();
        Laptop L = new Laptop();
        Tablet T = new Tablet();
        Desktop D = new Desktop();

        MyDevice.size();
        M.size();
        M.Mobilesize();
        L.size();
        L.Laptopsize();
        T.size();
        T.Tabletsize();
        D.size();
        D.Desktopsize();
    }
}
