public class Computer {
    private String name;
    private String processor;
    private int ram;
    private String ssd;
    private boolean using;
    public Computer(String name, String processor, int ram, String ssd, boolean using) {
        this.name = name;
        this.processor = processor;
        this.ram = ram;
        this.ssd = ssd;
        this.using = using;
    }
    public void use(){
        boolean using = true;
    }
    public void stop(){
        boolean using = false;
    }
}
