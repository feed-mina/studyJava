package Overrideexample;

public class HddEx {
    
    public static void main(String[] args){
        HddDisk hddDisk = new HddDisk(500, 7200);
        UsbMemory usbMemory = new UsbMemory(32, 960);
        // 오버라이딩
        System.out.println("HDD 상세");
        System.out.println(hddDisk.status());
        
        System.out.println("USB 상세");
        System.out.println("USB 상세 오버라이딩 :"+ usbMemory.status());
        
    // 오버로딩
        System.out.println("USB 상세 오버로딩 : "+ usbMemory.status(9999));
        
    }
}
