package sh.pancake.mod.example;

import sh.pancake.server.mod.IPancakeMod;
import sh.pancake.server.mod.ModData;

public class ExampleMod implements IPancakeMod {

    private ModData data;

    @Override
    public void init(ModData data) {
        this.data = data;
        
        System.out.println("Hello world!");
    }

    @Override
    public void onLoad() {
        
    }

    @Override
    public void onUnload() {
        
    }

}
