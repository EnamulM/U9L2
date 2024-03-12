public class WorkComp extends Computer{
    private boolean isWorking;
    public WorkComp(String name, String processor, int ram, String ssd, boolean using, boolean isWorking) {
        super(name,processor, ram, ssd, using);
        this.isWorking = isWorking;
    }
    public void work(){
        isWorking = true;
    }
    public void stopWorking(){
        isWorking = false;
    }
}
