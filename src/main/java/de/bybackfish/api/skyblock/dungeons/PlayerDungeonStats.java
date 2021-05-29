package de.bybackfish.api.skyblock.dungeons;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class PlayerDungeonStats {

  @SerializedName("secretCount")
  private long secretCount = 0;

  @SerializedName("fastestTime")
  private PlayerDungeonFastestTimes fastestTimes;

  @SerializedName("completions")
  private PlayerDungeonCompletions playerDungeonCompletions;


}
