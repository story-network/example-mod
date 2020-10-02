package sh.pancake.mod.example;

import sh.pancake.server.mod.IPancakeMod;
import sh.pancake.server.mod.ModData;
import sh.pancake.server.event.EventHandler;
import sh.pancake.server.event.IEventListener;

public class ExampleMod implements IPancakeMod, IEventListener {

    private ModData data;

    @Override
    public void init(ModData data) {
        this.data = data;
        
        System.out.println("Hello world!");

        // Event example
        data.getServer().getEventManager().registerAll(this);
        data.getServer().getEventManager().callEvent(new Object());
    }

    @Override
    public void onLoad() {
        
    }

    @Override
    public void onUnload() {
        
    }

    @EventHandler
    public void testEvent(Object o) {
        System.out.println("Hello " + o);
    }
    

}
