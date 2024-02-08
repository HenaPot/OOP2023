package org.example.lab11;

public class task4 {
    public static void main(String[] args) {}

}

// adaptees interface
interface OldDevice {
    void operateOldFunction();
}

// target interface
interface NewDevice {
    void operateNewFunction();
}

// implementations
// adaptee
class OldDeviceImpl implements OldDevice {

    @Override
    public void operateOldFunction() {
        System.out.println("Old ways");
    }
}

class NewDeviceImlp implements NewDevice {

    @Override
    public void operateNewFunction() {
        System.out.println("New ways");
    }
}

// adapter

class DeviceAdapter implements NewDevice{
    private OldDeviceImpl oldDevice = new OldDeviceImpl();
    @Override
    public void operateNewFunction() {
        System.out.println("Adapter is translating...");
        oldDevice.operateOldFunction();
    }
}


