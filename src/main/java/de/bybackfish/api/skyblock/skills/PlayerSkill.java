package de.bybackfish.api.skyblock.skills;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.Getter;

@Getter
public class PlayerSkill {
  @SerializedName("xp")
  private double xp = 0;

  @SerializedName("level")
  private double level = 0;
}
