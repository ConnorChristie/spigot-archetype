#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import java.util.logging.Level;
import org.bukkit.plugin.java.JavaPlugin;

public class ${pluginFile} extends JavaPlugin
{
    @Override
    public void onEnable()
	{
        getLogger().log(Level.INFO, "{0}.onEnable()", this.getClass().getName());
    }

    @Override
    public void onDisable()
	{
        getLogger().log(Level.INFO, "{0}.onDisable()", this.getClass().getName());
    }
}
