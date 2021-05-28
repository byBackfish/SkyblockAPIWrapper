package de.bybackfish.api.skyblock;

import com.google.gson.annotations.SerializedName;
import de.bybackfish.api.skyblock.dungeons.PlayerDungeons;
import de.bybackfish.api.skyblock.economy.PlayerEconomy;
import de.bybackfish.api.skyblock.extra.PlayerExtra;
import de.bybackfish.api.skyblock.skills.PlayerSkills;
import de.bybackfish.api.skyblock.slayer.PlayerSlayer;
import lombok.Getter;

@Getter
public class PlayerData {

  @SerializedName("skills")
  private PlayerSkills skills = new PlayerSkills();

  @SerializedName("dungeons")
  private PlayerDungeons dungeons = new PlayerDungeons();

  @SerializedName("slayer")
  private PlayerSlayer slayer = new PlayerSlayer();

  @SerializedName("extra")
  private PlayerExtra extra = new PlayerExtra();

  @SerializedName("coins")
  private PlayerEconomy economy = new PlayerEconomy();

//  @SerializedName("weight")
 // private PlayerWeights weights = new PlayerWeights();

  @SerializedName("uuid")
  private String uuid;


}
