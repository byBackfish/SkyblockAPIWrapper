package de.bybackfish.api;

import com.google.gson.Gson;
import de.bybackfish.api.skyblock.APIData;
import lombok.Data;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;

@Data
public class SkyblockAPI {

  protected final HashMap<String, Pair<Long, APIData>> playerCache = new HashMap<>();
  private String key;
  private long updateInterval = 300000;

  @SneakyThrows
  public APIData getPlayerData(String username) {
    Gson gson = new Gson();
    String url = "https://fragrunner.me:8000/skyblock?id=" + username;
    if (key != null) {
      url += "&key=" + key;
    }
    String json = readUrl(url);
    return gson.fromJson(json, APIData.class);
  }

  public APIData getPlayerCached(String username) {
    if (playerCache.containsKey(username)) {
      Pair<Long, APIData> pair = playerCache.get(username);

      if (pair.getKey() + updateInterval <= System.currentTimeMillis()) {
        APIData playerData = getPlayerData(username);
        playerCache.put(username, new Pair<>(System.currentTimeMillis(), playerData));
        System.out.println("Found outdated Player in Cache");
        return playerData;
      }
      System.out.println("Found Player in Cache");
      return playerCache.get(username).getValue();
    }
    APIData playerData = getPlayerData(username);
    System.out.println("Registering new Player in Cache");
    playerCache.put(username, new Pair<>(System.currentTimeMillis(), playerData));
    return playerData;
  }

  private String readUrl(String urlString) throws Exception {
    BufferedReader reader = null;
    try {
      URL url = new URL(urlString);
      reader = new BufferedReader(new InputStreamReader(url.openStream()));
      StringBuffer buffer = new StringBuffer();
      int read;
      char[] chars = new char[1024];
      while ((read = reader.read(chars)) != -1) {
        buffer.append(chars, 0, read);
      }

      return buffer.toString();
    } finally {
      if (reader != null) {
        reader.close();
      }
    }
  }
}
