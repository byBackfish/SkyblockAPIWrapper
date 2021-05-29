package de.bybackfish.api;

public class Example {

  public static void main(String[] args) {

    // Initialize the API

    SkyblockAPI skyblockAPI = new SkyblockAPI();

    /* OPTIONAL */ skyblockAPI.setKey("your-fragrunner-api-key");

    /* OPTIONAL */ skyblockAPI.setUpdateInterval(60000); // Sets the Cache Update Interval

    System.out.println(skyblockAPI.getPlayerCached("byBackfish").getPlayerData().getSkills().getCombat().getProgress());
  }

}
