package de.bybackfish.api.skyblock.dungeons;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.Getter;

@Getter
public class PlayerDungeon {

  @SerializedName("xp")
  private double xp = 0;

  @SerializedName("level")
  private double level = 0;

}
