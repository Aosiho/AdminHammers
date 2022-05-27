package vb.$adminhammers;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import org.bukkit.*;
import org.bukkit.command.*;
import org.bukkit.event.*;
import org.bukkit.plugin.java.*;

public class PluginMain extends JavaPlugin implements Listener {

	private static PluginMain instance;

	@Override
	public void onEnable() {
		instance = this;
		getServer().getPluginManager().registerEvents(this, this);
		saveDefaultConfig();
	}

	@Override
	public void onDisable() {
	}

	@Override
	public boolean onCommand(CommandSender commandSender, Command command, String label, String[] commandArgs) {
		if (command.getName().equalsIgnoreCase("testhammer")) {
			try {
				org.bukkit.Bukkit.dispatchCommand(commandSender, (("minecraft:give "
						+ ((java.lang.String) commandSender.getName()))
						+ " diamond_axe{display:{Name:'{\"text\":\"Ban Hammer\",\"color\":\"dark_red\",\"bold\":true}',Lore:['{\"text\":\"HammerType: Ban\"}']},CustomModelData:1000} 1"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("adminhammer")) {
			try {
				if (!((commandArgs.length > ((int) (0d)) ? commandArgs[((int) (0d))] : null) == null)) {
					if (PluginMain.checkEquals((commandArgs.length > ((int) (0d)) ? commandArgs[((int) (0d))] : null),
							"reload")) {
						commandSender.sendMessage("[\u00A74\u00A7lAdmin\u00A78Hammers] Reloading config!");
						PluginMain.getInstance().reloadConfig();
						commandSender.sendMessage("[\u00A74\u00A7lAdmin\u00A78Hammers] Config reloaded!");
					}
					if (PluginMain.checkEquals((commandArgs.length > ((int) (0d)) ? commandArgs[((int) (0d))] : null),
							"wiki")) {
						commandSender.sendMessage("[\u00A74\u00A7lAdmin\u00A78Hammers] Coming Soon!");
					}
					if (PluginMain.checkEquals((commandArgs.length > ((int) (0d)) ? commandArgs[((int) (0d))] : null),
							"ban")) {
						org.bukkit.Bukkit.dispatchCommand(commandSender, "banhammer");
					}
					if (!((((PluginMain.checkEquals(
							(commandArgs.length > ((int) (0d)) ? commandArgs[((int) (0d))] : null), "reload")
							^ PluginMain.checkEquals(
									(commandArgs.length > ((int) (0d)) ? commandArgs[((int) (0d))] : null), "wiki"))
							^ PluginMain.checkEquals(
									(commandArgs.length > ((int) (0d)) ? commandArgs[((int) (0d))] : null), "ban"))
							^ PluginMain.checkEquals(
									(commandArgs.length > ((int) (0d)) ? commandArgs[((int) (0d))] : null), "kick"))
							^ PluginMain.checkEquals(
									(commandArgs.length > ((int) (0d)) ? commandArgs[((int) (0d))] : null), "help"))) {
						commandSender.sendMessage(
								((java.lang.String[]) (Object) "Usage: /adminham reload, wiki, ban, kick, help"));
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("adminham")) {
			try {
				if (!((commandArgs.length > ((int) (0d)) ? commandArgs[((int) (0d))] : null) == null)) {
					if (PluginMain.checkEquals((commandArgs.length > ((int) (0d)) ? commandArgs[((int) (0d))] : null),
							"reload")) {
						commandSender.sendMessage("[\u00A74\u00A7lAdmin\u00A78Hammers] Reloading config!");
						PluginMain.getInstance().reloadConfig();
						commandSender.sendMessage("[\u00A74\u00A7lAdmin\u00A78Hammers] Config reloaded!");
					}
					if (PluginMain.checkEquals((commandArgs.length > ((int) (0d)) ? commandArgs[((int) (0d))] : null),
							"wiki")) {
						commandSender.sendMessage("[\u00A74\u00A7lAdmin\u00A78Hammers] Coming Soon!");
					}
					if (PluginMain.checkEquals((commandArgs.length > ((int) (0d)) ? commandArgs[((int) (0d))] : null),
							"ban")) {
						org.bukkit.Bukkit.dispatchCommand(commandSender, "banhammer");
					}
					if (!((((PluginMain.checkEquals(
							(commandArgs.length > ((int) (0d)) ? commandArgs[((int) (0d))] : null),
							((java.lang.Object) null))
							^ PluginMain.checkEquals(
									(commandArgs.length > ((int) (0d)) ? commandArgs[((int) (0d))] : null), "wiki"))
							^ PluginMain.checkEquals(
									(commandArgs.length > ((int) (0d)) ? commandArgs[((int) (0d))] : null),
									((java.lang.Object) null)))
							^ PluginMain.checkEquals(
									(commandArgs.length > ((int) (0d)) ? commandArgs[((int) (0d))] : null), "kick"))
							^ PluginMain.checkEquals(
									(commandArgs.length > ((int) (0d)) ? commandArgs[((int) (0d))] : null), "help"))) {
						commandSender.sendMessage(
								((java.lang.String[]) (Object) "Usage: /adminham reload, wiki, ban, kick, help"));
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("banhammer")) {
			try {
				org.bukkit.Bukkit.dispatchCommand(commandSender,
						(("minecraft:give " + ((java.lang.String) commandSender.getName())) + (("" + String.valueOf(
								((org.bukkit.configuration.ConfigurationSection) (Object) org.bukkit.configuration.file.YamlConfiguration
										.loadConfiguration(
												new File(String.valueOf(PluginMain.getInstance().getDataFolder()),
														"config.yml"))).get("ItemName")))
								+ "{display:{Name:'{\"text\":\"Ban Hammer\",\"color\":\"dark_red\",\"bold\":true}',Lore:['{\"text\":\"HammerType: Ban\"}']},CustomModelData:1000} 1")));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("banhammer")) {
			try {
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		return true;
	}

	public static void procedure(String procedure, List procedureArgs) throws Exception {
	}

	public static Object function(String function, List functionArgs) throws Exception {
		return null;
	}

	public static List createList(Object obj) {
		if (obj instanceof List) {
			return (List) obj;
		}
		List list = new ArrayList<>();
		if (obj.getClass().isArray()) {
			int length = java.lang.reflect.Array.getLength(obj);
			for (int i = 0; i < length; i++) {
				list.add(java.lang.reflect.Array.get(obj, i));
			}
		} else if (obj instanceof Collection<?>) {
			list.addAll((Collection<?>) obj);
		} else if (obj instanceof Iterator) {
			((Iterator<?>) obj).forEachRemaining(list::add);
		} else {
			list.add(obj);
		}
		return list;
	}

	public static void createResourceFile(String path) {
		Path file = getInstance().getDataFolder().toPath().resolve(path);
		if (Files.notExists(file)) {
			try (InputStream inputStream = PluginMain.class.getResourceAsStream("/" + path)) {
				Files.createDirectories(file.getParent());
				Files.copy(inputStream, file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static PluginMain getInstance() {
		return instance;
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void event1(org.bukkit.event.server.TabCompleteEvent event) throws Exception {
		if (PluginMain.checkEquals(((java.lang.String) event.getBuffer()), "/adminhammer")) {
			event.setCompletions(new ArrayList(Arrays.asList("reload", "wiki", "ban", "kick", "help")));
		}
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void event2(org.bukkit.event.entity.EntityDamageByEntityEvent event) throws Exception {
		if (PluginMain.checkEquals(((org.bukkit.entity.Entity) event.getDamager()), ((java.lang.Object) null))) {
			((org.bukkit.BanList) null).addBan(String.valueOf(((org.bukkit.entity.Entity) event.getDamager())),
					((java.lang.String) null), ((java.util.Date) null), ((java.lang.String) null));
		}
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void event3(org.bukkit.event.player.PlayerInteractEvent event) throws Exception {
		if (PluginMain.checkEquals(((org.bukkit.inventory.ItemStack) event.getItem()),
				((java.lang.Object) (Object) ((boolean) ((org.bukkit.inventory.meta.ItemMeta) (Object) PluginMain
						.getNamedItemWithLore(((org.bukkit.Material) org.bukkit.Material.valueOf(String.valueOf(
								((org.bukkit.configuration.ConfigurationSection) (Object) org.bukkit.configuration.file.YamlConfiguration
										.loadConfiguration(
												new File(String.valueOf(PluginMain.getInstance().getDataFolder()),
														"config.yml"))).get("ItemName")))),
								"\u00A74\u00A7lBan Hammer", new ArrayList(Arrays.asList(("HammerType: " + "Ban")))))
										.hasCustomModelData())))) {
			if (PluginMain.checkEquals(((org.bukkit.event.block.Action) event.getAction()),
					((org.bukkit.event.block.Action) org.bukkit.event.block.Action.LEFT_CLICK_AIR))) {
				((org.bukkit.BanList) org.bukkit.Bukkit
						.getBanList(((org.bukkit.BanList.Type) org.bukkit.BanList.Type.NAME)))
								.addBan(String.valueOf(((org.bukkit.entity.Player) event.getPlayer())),
										"Banned by mod.",
										((java.util.Date) (Object) java.time.format.DateTimeFormatter
												.ofPattern("99/99/9999").format(java.time.LocalDateTime.now())),
										"What");
			}
		}
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void event4(org.bukkit.event.server.PluginEnableEvent event) throws Exception {
		((org.bukkit.entity.Player) (Object) PluginMain.createList(org.bukkit.Bukkit.getOnlinePlayers()))
				.setResourcePack("https://download1499.mediafire.com/jwbw1ijtbagg/zpz0b1nlswwltz6/BanHammer.zip");
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void event5(org.bukkit.event.server.TabCompleteEvent event) throws Exception {
		if (PluginMain.checkEquals(((java.lang.String) event.getBuffer()), "/adminham")) {
			event.setCompletions(new ArrayList(Arrays.asList("reload", "wiki", "ban", "kick", "help")));
		}
	}

	public static org.bukkit.inventory.ItemStack getNamedItemWithLore(Material material, String name,
			List<String> lore) {
		org.bukkit.inventory.ItemStack item = new org.bukkit.inventory.ItemStack(material);
		org.bukkit.inventory.meta.ItemMeta itemMeta = item.getItemMeta();
		if (itemMeta != null) {
			itemMeta.setDisplayName(name);
			itemMeta.setLore(lore);
			item.setItemMeta(itemMeta);
		}
		return item;
	}

	public static boolean checkEquals(Object o1, Object o2) {
		if (o1 == null || o2 == null) {
			return false;
		}
		return o1 instanceof Number && o2 instanceof Number
				? ((Number) o1).doubleValue() == ((Number) o2).doubleValue()
				: o1.equals(o2);
	}
}
