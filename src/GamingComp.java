public class GamingComp extends Computer{
    private boolean isGaming;
    public GamingComp(String name, String processor, int ram, String ssd, boolean using, boolean isGaming) {
        super(name,processor, ram, ssd, using);
        this.isGaming = isGaming;
    }
    public void game(){
        isGaming = true;
    }
    public void stopGaming(){
        isGaming = false;
    }
}
