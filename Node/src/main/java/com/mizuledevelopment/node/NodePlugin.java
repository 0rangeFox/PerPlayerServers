package com.mizuledevelopment.node;

import com.mizuledevelopment.node.jedis.JedisManager;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public class NodePlugin extends JavaPlugin {

    @Getter private static NodePlugin plugin;
    @Getter private static JedisManager jedisManager;

    public void onEnable() {
        plugin = this;

        jedisManager = new JedisManager(getConfig().getString("redis.host"), getConfig().getInt("redis.port"), "Testing-Master", getConfig().getString("password"));
        System.out.println("SERVER ID: " + System.getenv("ID"));
    }
}