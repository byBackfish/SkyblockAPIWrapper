package de.bybackfish.api.skyblock.dungeons;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class PlayerDungeonTypes {

  @SerializedName("catacombs")
  private PlayerDungeons catacombs = new PlayerDungeons();

}
