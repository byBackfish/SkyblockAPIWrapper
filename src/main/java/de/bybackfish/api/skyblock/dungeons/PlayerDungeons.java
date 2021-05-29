package de.bybackfish.api.skyblock.dungeons;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class PlayerDungeons {

  @SerializedName("xp")
  private double xp = 0;

  @SerializedName("level")
  private double level = 0;

  @SerializedName("progress")
  private double progress = 0;

  @SerializedName("required")
  private double required = 0;

  @SerializedName(
      "berserk"
  )
  private PlayerDungeon berserk = new PlayerDungeon();

  @SerializedName(
      "healer"
  )
  private PlayerDungeon healer = new PlayerDungeon();

  @SerializedName(
      "archer"
  )
  private PlayerDungeon archer = new PlayerDungeon();

  @SerializedName(
      "tank"
  )
  private PlayerDungeon tank = new PlayerDungeon();

  @SerializedName(
      "mage"
  )
  private PlayerDungeon mage = new PlayerDungeon();

  @SerializedName("data")
  private PlayerDungeonStats playerDungeonStats = new PlayerDungeonStats();

}
