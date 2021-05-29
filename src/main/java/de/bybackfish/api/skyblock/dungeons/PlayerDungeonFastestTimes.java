package de.bybackfish.api.skyblock.dungeons;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class PlayerDungeonFastestTimes {

 @SerializedName("s")
  private PlayerDungeonFastestTime scoreS;

  @SerializedName("s_plus")
  private PlayerDungeonFastestTime scoreSPlus;

  @SerializedName("general")
  private PlayerDungeonFastestTime scoreGeneral;

}
