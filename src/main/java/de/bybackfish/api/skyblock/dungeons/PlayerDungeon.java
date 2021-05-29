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

  @SerializedName("progress")
  private double progress = 0;

  @SerializedName("required")
  private double required = 0;

}
