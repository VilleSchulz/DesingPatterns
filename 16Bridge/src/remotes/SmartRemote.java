package remotes;

import devices.Device;
import devices.SmartRadio;
import devices.SmartTV;

public class SmartRemote extends BasicRemote {
    public SmartRemote(Device device) {
        super.device = device;
    }


    public void voiceControl(String voiceCommand) {
        switch (voiceCommand) {
            case "turn on":
                System.out.println("Voice control: turn on");
                device.enable();
                break;
            case "turn off":
                System.out.println("Voice control: turn off");
                device.disable();
                break;
            case "mute":
                System.out.println("Voice control: mute");
                device.setVolume(0);
                break;
            case "volume up":
                System.out.println("Voice control: volume up");
                device.setVolume(device.getVolume() + 10);
                break;

            case "volume down":
                System.out.println("Voice control: volume down");
                device.setVolume(device.getVolume() - 10);
                break;


            case "channel up":
                System.out.println("Voice control: channel up");
                device.setChannel(device.getChannel() + 1);
                break;
            case "channel down":
                System.out.println("Voice control: channel down");
                device.setChannel(device.getChannel() - 1);
                break;
            case "browse internet":
                System.out.println("Voice control: browse internet");
                if (device instanceof SmartTV) {
                    ((SmartTV) device).browseInternet();
                } else {
                    System.out.println("Voice control: this " +
                            device.getClass().getSimpleName() + " does not support this feature");
                }
                break;
            case "open netflix":
                System.out.println("Voice control: open netflix");
                if (device instanceof SmartTV) {
                    ((SmartTV) device).openNetflix();

                } else {
                    System.out.println("Voice control: this " +
                            device.getClass().getSimpleName() + " does not support this feature");
                }
                break;
            case "open spotify":
                System.out.println("Voice control: open spotify");
                if (device instanceof SmartRadio) {
                    ((SmartRadio) device).openSpotify();

                } else {

                    System.out.println("Voice control: this " +
                            device.getClass().getSimpleName() + " does not support this feature");
                }
                break;
        }

    }

    public void openNetflix() {
        System.out.println("SmartRemote: open netflix");
        if (device instanceof SmartTV) {
            ((SmartTV) device).openNetflix();
        } else {
            System.out.println("SmartRemote: this " + device.getClass().getSimpleName() + " does not support this feature");
        }
    }

    public void openSpotify() {
        System.out.println("SmartRemote: open spotify");
        if (device instanceof SmartRadio) {
            ((SmartRadio) device).openSpotify();

        }
        if (device instanceof SmartTV) {
            ((SmartTV) device).openSpotify();
        } else {
            System.out.println("SmartRemote: this " + device.getClass().getSimpleName() + " does not support this feature");
        }
    }

    public void browseInternet() {
        System.out.println("SmartRemote: browse internet");
        if (device instanceof SmartTV) {
            ((SmartTV) device).browseInternet();
        } else {
            System.out.println("SmartRemote: this " + device.getClass().getSimpleName() + " does not support this feature");
        }
    }


}
