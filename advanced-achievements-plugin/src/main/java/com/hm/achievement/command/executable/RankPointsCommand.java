package com.hm.achievement.command.executable;

import com.hm.achievement.gui.CategoryGUI;
import com.hm.achievement.gui.GUIItems;
import com.hm.achievement.gui.MainGUI;
import com.hm.mcshared.file.CommentedYamlConfiguration;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/**
 * Class in charge of handling the /aach list command, which displays interactive GUIs.
 * 
 * @author Pyves
 */
@Singleton
@CommandSpec(name = "rankpoints", permission = "rankpoints", minArgs = 1, maxArgs = 1)
public class RankPointsCommand extends AbstractCommand {

	private final MainGUI mainGUI;
	private final CategoryGUI categoryGUI;
	private final GUIItems guiItems;

	@Inject
	public RankPointsCommand(@Named("main") CommentedYamlConfiguration mainConfig,
                             @Named("lang") CommentedYamlConfiguration langConfig,StringBuilder pluginHeader,
                             MainGUI mainGUI, CategoryGUI categoryGUI, GUIItems guiItems) {
		super(mainConfig, langConfig, pluginHeader);
		this.mainGUI = mainGUI;
		this.categoryGUI = categoryGUI;
        this.guiItems = guiItems;
	}

	@Override
	void onExecute(CommandSender sender, String[] args) {
		if (!(sender instanceof Player)) {
			return;
		}

		Player player = (Player) sender;

		ItemStack catagoryItem = guiItems.createItemStack("Custom");

		categoryGUI.displayRankPointsGUI(catagoryItem, player, 0);
	}
}
