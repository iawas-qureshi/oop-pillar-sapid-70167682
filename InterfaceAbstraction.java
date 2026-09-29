// Abstraction 2: pure abstraction using an interface
interface RemoteControl {
    void powerOn();
    void powerOff();
}
class TV implements RemoteControl {
    public void powerOn()  { System.out.println("TV is ON"); }
    public void powerOff() { System.out.println("TV is OFF"); }
}
class AC implements RemoteControl {
    public void powerOn()  { System.out.println("AC is ON"); }
    public void powerOff() { System.out.println("AC is OFF"); }
}
public class InterfaceAbstraction {
    public static void main(String[] args) {
        RemoteControl[] devices = { new TV(), new AC() };
        for (RemoteControl d : devices) { d.powerOn(); d.powerOff(); }
    }
}
